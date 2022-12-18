//package org.jetbrains.jewel
//
//import androidx.compose.foundation.border
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Brush
//import androidx.compose.ui.graphics.RectangleShape
//import androidx.compose.ui.graphics.Shape
//import androidx.compose.ui.graphics.isUnspecified
//import androidx.compose.ui.unit.Dp
//import androidx.compose.ui.unit.dp
//
//fun Modifier.border(areaColors: AreaColors, width: Dp = 1.dp, shape: Shape = RectangleShape): Modifier {
//    if (areaColors.startBorderColor.isUnspecified) {
//        return this
//    }
//    if (areaColors.endBorderColor.isUnspecified || areaColors.startBorderColor == areaColors.endBorderColor) {
//        return this.border(width, areaColors.startBorderColor, shape)
//    }
//    return this.border(width, Brush.linearGradient(listOf(areaColors.startBackground, areaColors.endBackground)), shape)
//}
//
//@Composable
//fun Modifier.areaFocusBorder(
//    focused: Boolean,
//    areaColors: AreaColors = LocalAreaColors.current,
//    width: Dp = 2.dp,
//    shape: Shape = RectangleShape
//): Modifier = focusBorder(focused, areaColors, width, shape)
//
//fun Modifier.focusBorder(
//    focused: Boolean,
//    areaColors: AreaColors,
//    width: Dp = 2.dp,
//    shape: Shape = RectangleShape
//): Modifier {
//    if (!focused) return this
//    if (areaColors.focusColor.isUnspecified) {
//        return this
//    }
//    return this.outerBorder(width, areaColors.focusColor, shape)
//}
