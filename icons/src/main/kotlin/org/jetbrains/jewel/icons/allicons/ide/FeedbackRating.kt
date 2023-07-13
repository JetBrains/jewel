package org.jetbrains.jewel.icons.allicons.ide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val IdeGroup.FeedbackRating: IntellijIconData
    get() {
        if (_feedbackRating != null) {
            return _feedbackRating!!
        }
        _feedbackRating = IntellijIconData(name = "FeedbackRating",size = DpSize(height = 32.0.dp,
                width = 32.0.dp),imageVector = { FeedbackRatingComposable(it) })
        return _feedbackRating!!
    }

private var _feedbackRating: IntellijIconData? = null

private fun FeedbackRatingComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "FeedbackRating", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp, viewportWidth = 32.0f,
        viewportHeight = 32.0f).apply {
    path(fill = SolidColor(Color(0xFFA8ADBD)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
        moveTo(19.4385f, 11.2673f)
        lineTo(16.0f, 3.0f)
        lineTo(12.5614f, 11.2673f)
        lineTo(3.6362f, 11.9828f)
        lineTo(10.4363f, 17.8077f)
        lineTo(8.3588f, 26.5172f)
        lineTo(16.0f, 21.85f)
        lineTo(23.6412f, 26.5172f)
        lineTo(21.5636f, 17.8077f)
        lineTo(28.3637f, 11.9828f)
        lineTo(19.4385f, 11.2673f)
        close()
        moveTo(25.8872f, 12.7874f)
        lineTo(18.7498f, 12.2152f)
        lineTo(16.0f, 5.604f)
        lineTo(13.2502f, 12.2152f)
        lineTo(6.1127f, 12.7874f)
        lineTo(11.5507f, 17.4456f)
        lineTo(9.8893f, 24.4106f)
        lineTo(16.0f, 20.6782f)
        lineTo(22.1106f, 24.4106f)
        lineTo(20.4492f, 17.4456f)
        lineTo(25.8872f, 12.7874f)
        close()
    }
}
.build()
