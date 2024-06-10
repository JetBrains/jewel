package org.jetbrains.jewel.markdown.extensions.tables

import org.jetbrains.jewel.markdown.extensions.MarkdownBlockRendererExtension
import org.jetbrains.jewel.markdown.extensions.MarkdownRendererExtension
import org.jetbrains.jewel.markdown.rendering.MarkdownStyling

public class GitHubTableRendererExtension(
    alertStyling: TableStyling,
    rootStyling: MarkdownStyling,
) : MarkdownRendererExtension {

    override val blockRenderer: MarkdownBlockRendererExtension =
        GitHubTableBlockRenderer(alertStyling, rootStyling)
}
