package org.jetbrains.jewel.samples.ideplugin.swingsample

import com.intellij.openapi.application.EDT
import com.intellij.openapi.ui.GraphicsConfig
import com.intellij.ui.AnimatedIcon
import com.intellij.util.IconUtil
import com.intellij.util.ui.ImageUtil
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.awt.Dimension
import java.awt.Graphics
import java.awt.Graphics2D
import java.awt.Image
import java.awt.event.ComponentEvent
import java.awt.event.ComponentListener
import java.awt.image.BufferedImage
import javax.swing.JComponent
import kotlin.math.min

internal class ImageComponent(
    private val scope: CoroutineScope,
    bufferedImage: BufferedImage? = null,
) : JComponent() {

    var image: BufferedImage? = bufferedImage
        set(value) {
            if (field == value) return
            field = value
            updateScaledImage()
        }

    private var scaledImage: Image? = null

    init {
        addComponentListener(object : ComponentListener {
            override fun componentResized(e: ComponentEvent?) {
                updateScaledImage()
            }

            override fun componentMoved(e: ComponentEvent?) {
                // No-op
            }

            override fun componentShown(e: ComponentEvent?) {
                // No-op
            }

            override fun componentHidden(e: ComponentEvent?) {
                // No-op
            }
        })

        registerUiInspectorInfoProvider {
            mapOf(
                "image" to image,
                "imageSize" to image?.let { Dimension(ImageUtil.getRealWidth(it), ImageUtil.getRealHeight(it)) }
            )
        }
    }

    private fun updateScaledImage() {
        scaledImage = IconUtil.toImage(AnimatedIcon.Big())
        revalidate()

        val currentImage = image ?: return

        scope.launch(Dispatchers.Default) {
            val imageWidth = currentImage.width
            val imageHeight = currentImage.height

            val componentWidth = width
            val componentHeight = height

            val widthRatioToFit = componentWidth.toDouble() / imageWidth
            val heightRatioToFit = componentHeight.toDouble() / imageHeight
            val ratioToFit = min(widthRatioToFit, heightRatioToFit)
            val newImage = ImageUtil.scaleImage(currentImage, ratioToFit)

            launch(Dispatchers.EDT) {
                scaledImage = newImage
                revalidate()
            }
        }
    }

    override fun getPreferredSize(): Dimension {
        val currentImage = scaledImage

        return if (!isPreferredSizeSet && currentImage != null) {
            Dimension(
                ImageUtil.getUserWidth(currentImage),
                ImageUtil.getUserHeight(currentImage),
            )
        } else {
            super.getPreferredSize()
        }
    }

    override fun paintComponent(g: Graphics) {
        val currentImage = scaledImage ?: return

        with(g as Graphics2D) {
            val graphicsConfig = GraphicsConfig(this)
            graphicsConfig.setupAAPainting()

            val imageWidth = ImageUtil.getUserWidth(currentImage)
            val imageHeight = ImageUtil.getUserHeight(currentImage)

            val componentWidth = width
            val componentHeight = height

            drawImage(
                /* img = */ currentImage,
                /* x = */ componentWidth / 2 - (imageWidth) / 2,
                /* y = */ componentHeight / 2 - (imageHeight) / 2,
                /* observer = */ null
            )

            graphicsConfig.restore()
        }
    }
}
