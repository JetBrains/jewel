package org.jetbrains.jewel.icons.allicons.welcome

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
import org.jetbrains.jewel.icons.allicons.WelcomeGroup

public val WelcomeGroup.CreateNewProjectTab: IntellijIconData
    get() {
        if (_createNewProjectTab != null) {
            return _createNewProjectTab!!
        }
        _createNewProjectTab = IntellijIconData(name = "CreateNewProjectTab",size = DpSize(height =
                20.0.dp, width = 20.0.dp),imageVector = { CreateNewProjectTabComposable(it) })
        return _createNewProjectTab!!
    }

private var _createNewProjectTab: IntellijIconData? = null

private fun CreateNewProjectTabComposable(colorScheme: IntelliJIconColors): ImageVector =
        Builder(name = "CreateNewProjectTab", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp,
        viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
    path(fill = SolidColor(Color(0xFF3574F0)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
        moveTo(10.0f, 1.0f)
        curveTo(9.5858f, 1.0f, 9.25f, 1.3358f, 9.25f, 1.75f)
        verticalLineTo(9.25f)
        horizontalLineTo(1.75f)
        curveTo(1.3358f, 9.25f, 1.0f, 9.5858f, 1.0f, 10.0f)
        curveTo(1.0f, 10.4142f, 1.3358f, 10.75f, 1.75f, 10.75f)
        horizontalLineTo(9.25f)
        verticalLineTo(18.25f)
        curveTo(9.25f, 18.6642f, 9.5858f, 19.0f, 10.0f, 19.0f)
        curveTo(10.4142f, 19.0f, 10.75f, 18.6642f, 10.75f, 18.25f)
        verticalLineTo(10.75f)
        horizontalLineTo(18.25f)
        curveTo(18.6642f, 10.75f, 19.0f, 10.4142f, 19.0f, 10.0f)
        curveTo(19.0f, 9.5858f, 18.6642f, 9.25f, 18.25f, 9.25f)
        horizontalLineTo(10.75f)
        verticalLineTo(1.75f)
        curveTo(10.75f, 1.3358f, 10.4142f, 1.0f, 10.0f, 1.0f)
        close()
    }
}
.build()
