package org.jetbrains.jewel.markdown.extensions.github.tables

import androidx.compose.runtime.Immutable

/**
 * The offsets of rows and columns of a [SimpleTableLayout], centered
 * inside their spacing.
 *
 * E.g. If a table is given a cell spacing of 2px, then the first column
 * and row offset will each be 1px.
 */
@Immutable internal data class TableLayoutResult(val rowOffsets: List<Float>, val columnOffsets: List<Float>)
