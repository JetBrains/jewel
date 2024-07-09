package org.jetbrains.jewel.samples.ideplugin

import org.jetbrains.annotations.ApiStatus
import java.lang.reflect.Method

/**
 * A wrapper which uses either IDE logging subsystem (if available) or java.util.logging.
 */
@ApiStatus.NonExtendable
abstract class LoggerRt {
    private interface Factory {
        fun getInstance(category: String?): LoggerRt
    }

    fun info(message: String?) = info(message, null)

    fun info(t: Throwable) = info(t.message, t)

    fun warn(message: String?) = warn(message, null)

    fun warn(t: Throwable) = warn(t.message, t)

    fun error(message: String?) = error(message, null)

    fun error(t: Throwable) = error(t.message, t)

    abstract fun info(
        message: String?,
        t: Throwable?,
    )

    abstract fun warn(
        message: String?,
        t: Throwable?,
    )

    abstract fun error(
        message: String?,
        t: Throwable?,
    )

    private class JavaFactory : Factory {
        override fun getInstance(category: String?): LoggerRt {
            val logger =
                java.util.logging.Logger
                    .getLogger(category)
            return object : LoggerRt() {
                override fun info(
                    message: String?,
                    t: Throwable?,
                ) {
                    logger.log(java.util.logging.Level.INFO, message, t)
                }

                override fun warn(
                    message: String?,
                    t: Throwable?,
                ) {
                    logger.log(java.util.logging.Level.WARNING, message, t)
                }

                override fun error(
                    message: String?,
                    t: Throwable?,
                ) {
                    logger.log(java.util.logging.Level.SEVERE, message, t)
                }
            }
        }
    }

    private abstract class ReflectionBasedFactory : Factory {
        @Throws(RuntimeException::class)
        override fun getInstance(category: String?): LoggerRt {
            try {
                val logger = getLogger(category)
                return object : LoggerRt() {
                    override fun info(
                        message: String?,
                        t: Throwable?,
                    ) {
                        try {
                            this@ReflectionBasedFactory.info(message, t, logger)
                        } catch (ignored: Exception) {
                        }
                    }

                    override fun warn(
                        message: String?,
                        t: Throwable?,
                    ) {
                        try {
                            this@ReflectionBasedFactory.warn(message, t, logger)
                        } catch (ignored: Exception) {
                        }
                    }

                    override fun error(
                        message: String?,
                        t: Throwable?,
                    ) {
                        try {
                            this@ReflectionBasedFactory.error(message, t, logger)
                        } catch (ignored: Exception) {
                        }
                    }
                }
            } catch (e: Exception) {
                throw RuntimeException(e)
            }
        }

        @Throws(Exception::class)
        protected abstract fun error(
            message: String?,
            t: Throwable?,
            logger: Any?,
        )

        @Throws(Exception::class)
        protected abstract fun warn(
            message: String?,
            t: Throwable?,
            logger: Any?,
        )

        @Throws(Exception::class)
        protected abstract fun info(
            message: String?,
            t: Throwable?,
            logger: Any?,
        )

        @Throws(Exception::class)
        protected abstract fun getLogger(category: String?): Any
    }

    private class IdeaFactory : ReflectionBasedFactory() {
        private val myGetInstance: Method
        private val myInfo: Method
        private val myWarn: Method
        private val myError: Method

        init {
            val loggerClass = Class.forName("com.intellij.openapi.diagnostic.Logger")
            myGetInstance = loggerClass.getMethod("getInstance", String::class.java)
            myGetInstance.isAccessible = true
            myInfo = loggerClass.getMethod("info", String::class.java, Throwable::class.java)
            myInfo.isAccessible = true
            myWarn = loggerClass.getMethod("warn", String::class.java, Throwable::class.java)
            myInfo.isAccessible = true
            myError = loggerClass.getMethod("error", String::class.java, Throwable::class.java)
            myError.isAccessible = true
        }

        @Throws(Exception::class)
        override fun error(
            message: String?,
            t: Throwable?,
            logger: Any?,
        ) {
            myError.invoke(logger, message, t)
        }

        @Throws(Exception::class)
        override fun warn(
            message: String?,
            t: Throwable?,
            logger: Any?,
        ) {
            myWarn.invoke(logger, message, t)
        }

        @Throws(Exception::class)
        override fun info(
            message: String?,
            t: Throwable?,
            logger: Any?,
        ) {
            myInfo.invoke(logger, message, t)
        }

        @Throws(Exception::class)
        override fun getLogger(category: String?): Any = myGetInstance.invoke(null, category)
    }

    private class Slf4JFactory : ReflectionBasedFactory() {
        private val myGetLogger: Method
        private val myInfo: Method
        private val myWarn: Method
        private val myError: Method

        init {
            val loggerFactoryClass = Class.forName("org.slf4j.LoggerFactory")
            myGetLogger = loggerFactoryClass.getMethod("getLogger", String::class.java)
            myGetLogger.isAccessible = true

            val loggerClass = Class.forName("org.slf4j.Logger")
            myInfo = loggerClass.getMethod("info", String::class.java, Throwable::class.java)
            myInfo.isAccessible = true
            myWarn = loggerClass.getMethod("warn", String::class.java, Throwable::class.java)
            myInfo.isAccessible = true
            myError = loggerClass.getMethod("error", String::class.java, Throwable::class.java)
            myError.isAccessible = true
        }

        @Throws(Exception::class)
        override fun error(
            message: String?,
            t: Throwable?,
            logger: Any?,
        ) {
            myError.invoke(logger, message, t)
        }

        @Throws(Exception::class)
        override fun warn(
            message: String?,
            t: Throwable?,
            logger: Any?,
        ) {
            myWarn.invoke(logger, message, t)
        }

        @Throws(Exception::class)
        override fun info(
            message: String?,
            t: Throwable?,
            logger: Any?,
        ) {
            myInfo.invoke(logger, message, t)
        }

        @Throws(Exception::class)
        override fun getLogger(category: String?): Any = myGetLogger.invoke(null, category)
    }

    companion object {
        private var ourFactory: Factory? = null

        @get:Synchronized private val factory: Factory?
            get() {
                if (ourFactory == null) {
                    try {
                        ourFactory = IdeaFactory()
                    } catch (t: Throwable) {
                        try {
                            ourFactory = Slf4JFactory()
                        } catch (t2: Throwable) {
                            ourFactory = JavaFactory()
                        }
                    }
                }
                return ourFactory
            }

        fun getInstance(category: String): LoggerRt = factory!!.getInstance(category)

        fun getInstance(clazz: Class<*>): LoggerRt = getInstance('#'.toString() + clazz.name)
    }
}
