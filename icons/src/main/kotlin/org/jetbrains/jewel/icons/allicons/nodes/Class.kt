package org.jetbrains.jewel.icons.allicons.nodes

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
import org.jetbrains.jewel.icons.allicons.NodesGroup

public val NodesGroup.Class: IntellijIconData
    get() {
        if (_class != null) {
            return _class!!
        }
        _class = IntellijIconData(name = "Class",size = DpSize(height = 16.0.dp, width =
                16.0.dp),imageVector = { ClassComposable(it) })
        return _class!!
    }

private var _class: IntellijIconData? = null

private fun ClassComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name = "Class",
        defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight =
        16.0f).apply {
    path(fill = SolidColor(Color(0xFFE7EFFD)), stroke = SolidColor(Color(0xFF3574F0)),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(8.0f, 8.0f)
        moveToRelative(-6.5f, 0.0f)
        arcToRelative(6.5f, 6.5f, 0.0f, true, true, 13.0f, 0.0f)
        arcToRelative(6.5f, 6.5f, 0.0f, true, true, -13.0f, 0.0f)
    }
    path(fill = SolidColor(Color(0xFF3574F0)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(8.1329f, 11.5f)
        curveTo(9.6122f, 11.5f, 10.8836f, 10.6105f, 11.2075f, 9.3391f)
        horizontalLineTo(10.2213f)
        curveTo(9.9023f, 10.0739f, 9.1191f, 10.6057f, 8.1329f, 10.6057f)
        curveTo(6.7794f, 10.6057f, 5.8028f, 9.518f, 5.8028f, 8.0f)
        curveTo(5.8028f, 6.482f, 6.7794f, 5.3943f, 8.1329f, 5.3943f)
        curveTo(9.1191f, 5.3943f, 9.9023f, 5.9261f, 10.2213f, 6.6609f)
        horizontalLineTo(11.2075f)
        curveTo(10.8836f, 5.3895f, 9.6122f, 4.5f, 8.1329f, 4.5f)
        curveTo(6.2186f, 4.5f, 4.7925f, 5.9938f, 4.7925f, 8.0f)
        curveTo(4.7925f, 10.0062f, 6.2186f, 11.5f, 8.1329f, 11.5f)
        close()
    }
}
.build()
