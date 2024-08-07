package org.jetbrains.jewel.foundation.lazy.table

import androidx.compose.ui.unit.Constraints
import org.jetbrains.jewel.foundation.GenerateDataFunctions

@GenerateDataFunctions
public class LazyTableDimensionDefinition(
    public val key: Any,
    public val constraints: Constraints,
)

public interface LazyTableDimensionScope {

    public infix fun Any.with(constraints: Constraints): LazyTableDimensionDefinition

    public val noConstraints: Constraints
}

internal object LazyTableDimensionScopeImpl : LazyTableDimensionScope {

    override val noConstraints: Constraints = Constraints()

    override fun Any.with(constraints: Constraints): LazyTableDimensionDefinition = LazyTableDimensionDefinition(this, constraints)
}
