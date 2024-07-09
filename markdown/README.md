## Jewel Markdown Renderer

> [!IMPORTANT]
> The Jewel Markdown renderer is currently considered **experimental**. Its API and implementations may change at any
> time, and no guarantees are made for binary and source compatibility. It might also have bugs and missing features.

Adds the ability to render Markdown as native Compose UI.

Currently supports the [CommonMark 0.31.2](https://spec.commonmark.org/0.31.2/) specs.

Additional supported Markdown, via extensions:

* Alerts ([GitHub Flavored Markdown][alerts-specs]) — see [`extension-gfm-alerts`](extension/gfm-alerts)

[alerts-specs]: https://github.com/orgs/community/discussions/16925

On the roadmap, but not currently supported — in no particular order:

* Tables ([GitHub Flavored Markdown](https://github.github.com/gfm/#tables-extension-))
* Strikethrough ([GitHub Flavored Markdown](https://github.github.com/gfm/#strikethrough-extension-))
* Image loading (via [Coil 3](https://coil-kt.github.io/coil/upgrading_to_coil3/))
* Auto-linking ([GitHub Flavored Markdown](https://github.github.com/gfm/#autolinks-extension-))
* Task list items ([GitHub Flavored Markdown](https://github.github.com/gfm/#task-list-items-extension-))
* Keyboard shortcuts highlighting (specialized HTML handling)
* Collapsing sections ([GitHub Flavored Markdown][details-specs])
* Theme-sensitive image loading ([GitHub Flavored Markdown][dark-mode-pics-specs])
* Emojis ([GitHub Flavored Markdown][emoji-specs])
* Footnotes ([GitHub Flavored Markdown][footnotes-specs])

[details-specs]: https://docs.github.com/en/get-started/writing-on-github/working-with-advanced-formatting/organizing-information-with-collapsed-sections

[dark-mode-pics-specs]: https://docs.github.com/en/get-started/writing-on-github/getting-started-with-writing-and-formatting-on-github/basic-writing-and-formatting-syntax#specifying-the-theme-an-image-is-shown-to

[emoji-specs]: https://docs.github.com/en/get-started/writing-on-github/getting-started-with-writing-and-formatting-on-github/basic-writing-and-formatting-syntax#using-emojis

[footnotes-specs]: https://docs.github.com/en/get-started/writing-on-github/getting-started-with-writing-and-formatting-on-github/basic-writing-and-formatting-syntax#footnotes

Not supported, and not on the roadmap:

* Inline HTML rendering
* Mermaid diagrams (GitHub Flavored Markdown)
* LaTeX rendering, both inline and not (GitHub Flavored Markdown)
* topoJSON/geoJSON rendering (GitHub Flavored Markdown)
* 3D STL models (GitHub Flavored Markdown)
* Rich rendering of embeds such as videos, YouTube, GitHub Gists/...

## Add the Markdown renderer to your project

The Jewel Markdown renderer is designed to be run in a project that already has a `jewel-standalone` or
`jewel-ide-laf-bridge-*` dependency. The `core` module doesn't contain any styling, and you're supposed to use either
the `jewel-markdown-int-ui-standalone-styling` or `jewel-markdown-ide-laf-bridge-styling` instead. They will carry the
necessary dependencies.

> [!CAUTION]
> Don't use the standalone artifact in an IDE plugin, and don't use the bridge artifact in a standalone project!

If you want to use extensions, you also need to add them **alongside** the `jewel-markdown-core`:

```kotlin
dependencies {
    implementation(libs.jewel.standalone)
    implementation(libs.jewel.markdown.intUiStandaloneStyling)
    implementation(libs.jewel.markdown.extension.gfm.alerts) // Optional
    // Et cetera...
}
```

## How to use Jewel's Markdown renderer

The process that leads to rendering Markdown in a native UI is two-pass.

The first pass is an upfront rendering that pre-processes blocks into `MarkdownBlock`s, but doesn't touch the inline
Markdown. It's recommended to run this outside of the composition, since it has no dependencies on it.

```kotlin
// Somewhere outside of composition...
val processor = MarkdownProcessor()
val rawMarkdown = "..."
var markdownBlocks: List<MarkdownBlock> = processor.processMarkdownDocument(rawMarkdown)
```

Once you have your list of `MarkdownBlock`s, you can do the second step in the composition: 
render a series of `MarkdownBlock`s into native Jewel UI.

Here is an example:

```kotlin
@Composable
fun Markdown(blocks: List<MarkdownBlock>) {
    val isDark = JewelTheme.isDark
    val markdownStyling =
        remember(isDark) { if (isDark) MarkdownStyling.dark() else MarkdownStyling.light() }
    val blockRenderer = remember(markdownStyling, isDark) {
        if (isDark) MarkdownBlockRenderer.dark() else MarkdownBlockRenderer.light()
    }

    SelectionContainer(Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier.verticalScroll(rememberScrollState()),
            verticalArrangement = Arrangement.spacedBy(markdownStyling.blockVerticalSpacing),
        ) {
            blockRenderer.render(blocks)
        }
    }
}
```

If you expect long Markdown documents, you can also use a `LazyMarkdown` to get better performances.
You can find an example in [`MarkdownPreview`](samples/standalone/src/main/kotlin/org/jetbrains/jewel/samples/standalone/view/markdown/MarkdownPreview.kt).

### Using extensions

By default, the processor will ignore any kind of Markdown it doesn't support. To support additional features, such as
ones found in GitHub Flavored Markdown, you can use extensions. If you don't specify any extension, the processor will
be restricted to the [CommonMark specs](https://specs.commonmark.org) as supported by
[`commonmark-java`](https://github.com/commonmark/commonmark-java).

Extensions are composed of two parts: a parsing and a rendering part. The two parts need to be passed to the
`MarkdownProcessor` and `MarkdownBlockRenderer`, respectively:

```kotlin
// Where the parsing happens...
val parsingExtensions: List<MarkdownProcessorExtension> = listOf(/*...*/)
val processor = MarkdownProcessor(parsingExtensions)

// Where the rendering happens...
val blockRenderer = remember(markdownStyling, isDark) {
    if (isDark) {
        MarkdownBlockRenderer.dark(
            rendererExtensions = listOf(/*...*/),
            inlineRenderer = InlineMarkdownRenderer.default(parsingExtensions),
        )
    } else {
        MarkdownBlockRenderer.light(
            rendererExtensions = listOf(/*...*/),
            inlineRenderer = InlineMarkdownRenderer.default(parsingExtensions),
        )
    }
}
```

It is strongly recommended to use the corresponding set of rendering extensions as the ones used for parsing, otherwise
the custom blocks will be parsed but not rendered.

Note that you should create an `InlineMarkdownRenderer` with the same list of extensions that was used to build the
processor, as even though inline rendering extensions are not supported yet, they will be in the future.

### Showcase

You can see this in action running the Standalone sample, and selecting Markdown from the top-left menu.


The following image shows Jewel Markdown rendering this very Jewel Markdown README.
![Image showing the Markdown showcase from the Jewel standalone sample](https://github.com/JetBrains/jewel/assets/19003/67e2cc4e-c9b8-454b-884a-bba526ad2fe4)