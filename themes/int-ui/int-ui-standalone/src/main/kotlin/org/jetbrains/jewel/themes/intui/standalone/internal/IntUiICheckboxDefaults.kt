package org.jetbrains.jewel.themes.intui.standalone.internal

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.internal.CheckboxDefaults
import org.jetbrains.jewel.internal.CheckboxState

@Suppress("VariableNaming")
abstract class IntUiICheckboxDefaults : CheckboxDefaults {

    val CheckboxSize = 16.dp

    val CheckedMark = ImageVector.Builder(
        name = "CheckedMark",
        defaultWidth = 16.0.dp,
        defaultHeight = 16.0.dp,
        viewportWidth = 16.0f,
        viewportHeight = 16.0f
    ).apply {
        path(
            fill = SolidColor(Color.White),
            stroke = null,
            fillAlpha = 1f,
            strokeLineWidth = 0f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = EvenOdd
        ) {
            moveTo(13.1459f, 4.23661f)
            curveTo(13.5675f, 4.59336f, 13.6201f, 5.22434f, 13.2634f, 5.64594f)
            lineTo(7.76339f, 12.1459f)
            curveTo(7.58275f, 12.3594f, 7.32097f, 12.4875f, 7.04156f, 12.4991f)
            curveTo(6.76215f, 12.5108f, 6.49064f, 12.4049f, 6.29289f, 12.2071f)
            lineTo(3.29289f, 9.20711f)
            curveTo(2.90237f, 8.81658f, 2.90237f, 8.18342f, 3.29289f, 7.79289f)
            curveTo(3.68342f, 7.40237f, 4.31658f, 7.40237f, 4.70711f, 7.79289f)
            lineTo(6.93862f, 10.0244f)
            lineTo(11.7366f, 4.35406f)
            curveTo(12.0934f, 3.93245f, 12.7243f, 3.87987f, 13.1459f, 4.23661f)
            close()
        }
    }.build()

    val IndeterminateMark = ImageVector.Builder(
        name = "IndeterminateMark",
        defaultWidth = 16.0.dp,
        defaultHeight = 16.0.dp,
        viewportWidth = 16.0f,
        viewportHeight = 16.0f
    ).apply {
        path(
            fill = SolidColor(Color.White),
            stroke = null,
            fillAlpha = 1f,
            strokeLineWidth = 0f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = EvenOdd
        ) {
            moveTo(3.5f, 7f)
            lineTo(12.5f, 7f)
            arcTo(1f, 1f, 0.0f, false, true, 12.5f, 9f)
            lineTo(3.5f, 9f)
            arcTo(1f, 1f, 0.0f, false, true, 3.5f, 7f)
            close()
        }
    }.build()

    val Shape = RoundedCornerShape(3.dp)

    val ContentSpacing = 8.dp

    @Composable
    override fun width(): Dp = CheckboxSize

    @Composable
    override fun height(): Dp = CheckboxSize

    @Composable
    override fun shape(): Shape = Shape

    @Composable
    override fun contentSpacing(): Dp = ContentSpacing

    @Composable
    override fun textStyle(): TextStyle = TextStyle.Default

    @Composable
    override fun checkmark(state: CheckboxState): State<Painter?> {
        val checked = rememberVectorPainter(CheckedMark)
        val indeterminate = rememberVectorPainter(IndeterminateMark)

        return rememberUpdatedState(
            when (state.toggle) {
                ToggleableState.On -> checked
                ToggleableState.Off -> null
                ToggleableState.Indeterminate -> indeterminate
            }
        )
    }
}
