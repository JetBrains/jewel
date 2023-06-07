package org.jetbrains.jewel.foundation

import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.RoundRect

internal fun RoundRect.inflate(delta: Float) = RoundRect(
    left = left - delta,
    top = top - delta,
    right = right + delta,
    bottom = bottom + delta,
    topLeftCornerRadius = CornerRadius(topLeftCornerRadius.x + delta, topLeftCornerRadius.y + delta),
    topRightCornerRadius = CornerRadius(topRightCornerRadius.x + delta, topRightCornerRadius.y + delta),
    bottomLeftCornerRadius = CornerRadius(bottomLeftCornerRadius.x + delta, bottomLeftCornerRadius.y + delta),
    bottomRightCornerRadius = CornerRadius(bottomRightCornerRadius.x + delta, bottomRightCornerRadius.y + delta)
)

internal fun RoundRect.deflate(delta: Float) = RoundRect(
    left = left + delta,
    top = top + delta,
    right = right - delta,
    bottom = bottom - delta,
    topLeftCornerRadius = CornerRadius(topLeftCornerRadius.x - delta, topLeftCornerRadius.y - delta),
    topRightCornerRadius = CornerRadius(topRightCornerRadius.x - delta, topRightCornerRadius.y - delta),
    bottomLeftCornerRadius = CornerRadius(bottomLeftCornerRadius.x - delta, bottomLeftCornerRadius.y - delta),
    bottomRightCornerRadius = CornerRadius(bottomRightCornerRadius.x - delta, bottomRightCornerRadius.y - delta)
)
