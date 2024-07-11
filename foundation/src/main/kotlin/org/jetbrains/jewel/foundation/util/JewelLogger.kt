package org.jetbrains.jewel.foundation.util

import org.jetbrains.annotations.ApiStatus
import java.lang.reflect.Method
import java.util.logging.ConsoleHandler
import java.util.logging.Level
import java.util.logging.Logger

public inline fun <reified T : Any> T.myLogger(): JewelLogger = JewelLogger.getInstance(T::class.java)

/**
 * A wrapper which uses either IDE logging subsystem (if available) or java.util.logging.
 */
@ApiStatus.NonExtendable
@Suppress("OptionalUnit")
public abstract class JewelLogger {
    private interface Factory {
        fun getInstance(category: String?): JewelLogger
    }

    public fun debug(message: String?): Unit = debug(message, null)

    public fun debug(t: Throwable): Unit = debug(t.message, t)

    public fun info(message: String?): Unit = info(message, null)

    public fun info(t: Throwable): Unit = info(t.message, t)

    public fun warn(message: String?): Unit = warn(message, null)

    public fun warn(t: Throwable): Unit = warn(t.message, t)

    public fun error(message: String?): Unit = error(message, null)

    public fun error(t: Throwable): Unit = error(t.message, t)

    public abstract fun info(
        message: String?,
        t: Throwable?,
    )

    public abstract fun warn(
        message: String?,
        t: Throwable?,
    )

    public abstract fun error(
        message: String?,
        t: Throwable?,
    )

    public abstract fun debug(
        message: String?,
        t: Throwable?,
    )

    private class JavaFactory : Factory {
        override fun getInstance(category: String?): JewelLogger {
            val logger by lazy {
                val l = Logger.getLogger(category)

                // Remove existing default handlers to avoid duplicate messages in console
                for (handler in l.handlers) {
                    l.removeHandler(handler)
                }

                // Create a new handler with a higher logging level
                val handler = ConsoleHandler()
                handler.level = Level.FINER
                l.addHandler(handler)

                // Tune the logger for level and duplicated messages
                l.level = Level.FINER
                l.useParentHandlers = false
                l
            }
            return object : JewelLogger() {
                override fun debug(
                    message: String?,
                    t: Throwable?,
                ) {
                    logger.log(Level.FINE, message, t)
                }

                override fun info(
                    message: String?,
                    t: Throwable?,
                ) {
                    logger.log(Level.INFO, message, t)
                }

                override fun warn(
                    message: String?,
                    t: Throwable?,
                ) {
                    logger.log(Level.WARNING, message, t)
                }

                override fun error(
                    message: String?,
                    t: Throwable?,
                ) {
                    logger.log(Level.SEVERE, message, t)
                }
            }
        }
    }

    private abstract class ReflectionBasedFactory : Factory {
        @Throws(RuntimeException::class)
        @Suppress("TooGenericExceptionCaught", "TooGenericExceptionThrown")
        override fun getInstance(category: String?): JewelLogger {
            try {
                val logger = getLogger(category)

                return object : JewelLogger() {
                    override fun debug(
                        message: String?,
                        t: Throwable?,
                    ) {
                        try {
                            this@ReflectionBasedFactory.debug(message, t, logger)
                        } catch (ignored: Exception) {
                        }
                    }

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
        protected abstract fun debug(
            message: String?,
            t: Throwable?,
            logger: Any?,
        )

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
        private val myDebug: Method
        private val myInfo: Method
        private val myWarn: Method
        private val myError: Method

        init {
            val loggerClass = Class.forName("com.intellij.openapi.diagnostic.Logger")
            myGetInstance = loggerClass.getMethod("getInstance", String::class.java)
            myGetInstance.isAccessible = true
            myDebug = loggerClass.getMethod("debug", String::class.java, Throwable::class.java)
            myDebug.isAccessible = true
            myInfo = loggerClass.getMethod("info", String::class.java, Throwable::class.java)
            myInfo.isAccessible = true
            myWarn = loggerClass.getMethod("warn", String::class.java, Throwable::class.java)
            myWarn.isAccessible = true
            myError = loggerClass.getMethod("error", String::class.java, Throwable::class.java)
            myError.isAccessible = true
        }

        @Throws(Exception::class)
        override fun debug(
            message: String?,
            t: Throwable?,
            logger: Any?,
        ) {
            myDebug.invoke(logger, message, t)
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
        private val myDebug: Method
        private val myInfo: Method
        private val myWarn: Method
        private val myError: Method

        init {
            val loggerFactoryClass = Class.forName("org.slf4j.LoggerFactory")
            myGetLogger = loggerFactoryClass.getMethod("getLogger", String::class.java)
            myGetLogger.isAccessible = true

            val loggerClass = Class.forName("org.slf4j.Logger")
            myDebug = loggerClass.getMethod("debug", String::class.java, Throwable::class.java)
            myDebug.isAccessible = true
            myInfo = loggerClass.getMethod("info", String::class.java, Throwable::class.java)
            myInfo.isAccessible = true
            myWarn = loggerClass.getMethod("warn", String::class.java, Throwable::class.java)
            myWarn.isAccessible = true
            myError = loggerClass.getMethod("error", String::class.java, Throwable::class.java)
            myError.isAccessible = true
        }

        @Throws(Exception::class)
        override fun debug(
            message: String?,
            t: Throwable?,
            logger: Any?,
        ) {
            myDebug.invoke(logger, message, t)
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

    public companion object {
        private var ourFactory: Factory? = null

        @Suppress("SwallowedException", "TooGenericExceptionCaught")
        @get:Synchronized
        private val factory: Factory?
            get() {
                if (ourFactory == null) {
                    ourFactory =
                        try {
                            IdeaFactory()
                        } catch (t: Throwable) {
                            try {
                                Slf4JFactory()
                            } catch (t2: Throwable) {
                                JavaFactory()
                            }
                        }
                }
                return ourFactory
            }

        public fun getInstance(category: String): JewelLogger = factory!!.getInstance("#$category")

        public fun getInstance(clazz: Class<*>): JewelLogger = getInstance('#'.toString() + clazz.name)
    }
}
