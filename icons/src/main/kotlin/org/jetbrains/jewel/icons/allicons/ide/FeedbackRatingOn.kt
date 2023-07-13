package org.jetbrains.jewel.icons.allicons.ide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.IdeGroup

public val IdeGroup.FeedbackRatingOn: IntellijIconData
    get() {
        if (_feedbackRatingOn != null) {
            return _feedbackRatingOn!!
        }
        _feedbackRatingOn = IntellijIconData(name = "FeedbackRatingOn",size = DpSize(height =
                32.0.dp, width = 32.0.dp),imageVector = { FeedbackRatingOnComposable(it) })
        return _feedbackRatingOn!!
    }

private var _feedbackRatingOn: IntellijIconData? = null

private fun FeedbackRatingOnComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name
        = "FeedbackRatingOn", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp, viewportWidth =
        32.0f, viewportHeight = 32.0f).apply {
    path(fill = SolidColor(Color(0xFFFFAF0F)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(16.0005f, 3.0f)
        lineTo(19.439f, 11.2673f)
        lineTo(28.3642f, 11.9828f)
        lineTo(21.5641f, 17.8077f)
        lineTo(23.6417f, 26.5172f)
        lineTo(16.0005f, 21.85f)
        lineTo(8.3592f, 26.5172f)
        lineTo(10.4368f, 17.8077f)
        lineTo(3.6367f, 11.9828f)
        lineTo(12.5619f, 11.2673f)
        lineTo(16.0005f, 3.0f)
        close()
    }
}
.build()
