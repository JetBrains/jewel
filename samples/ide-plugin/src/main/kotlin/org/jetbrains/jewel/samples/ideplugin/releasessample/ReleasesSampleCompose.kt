package org.jetbrains.jewel.samples.ideplugin.releasessample

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.focusable
import androidx.compose.foundation.interaction.FocusInteraction
import androidx.compose.foundation.interaction.HoverInteraction
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.PressInteraction
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.Color.Companion.Transparent
import androidx.compose.ui.graphics.Color.Companion.Unspecified
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.input.pointer.PointerIcon
import androidx.compose.ui.input.pointer.pointerHoverIcon
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.ResourceLoader
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.intl.Locale
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.intellij.ide.ui.laf.darcula.DarculaUIUtil
import com.intellij.openapi.components.service
import com.intellij.openapi.project.Project
import com.intellij.ui.NewUI
import com.intellij.ui.RelativeFont
import com.intellij.util.ui.JBFont
import com.intellij.util.ui.JBUI
import kotlinx.datetime.toJavaLocalDate
import org.jetbrains.jewel.Divider
import org.jetbrains.jewel.Icon
import org.jetbrains.jewel.LocalResourceLoader
import org.jetbrains.jewel.Orientation
import org.jetbrains.jewel.PopupMenu
import org.jetbrains.jewel.SvgLoader
import org.jetbrains.jewel.Text
import org.jetbrains.jewel.TextField
import org.jetbrains.jewel.bridge.SwingBridgeService
import org.jetbrains.jewel.bridge.SwingBridgeTheme
import org.jetbrains.jewel.bridge.retrieveColorOrUnspecified
import org.jetbrains.jewel.bridge.retrieveStatelessIcon
import org.jetbrains.jewel.bridge.toComposeColor
import org.jetbrains.jewel.foundation.lazy.SelectableLazyColumn
import org.jetbrains.jewel.foundation.lazy.SelectionMode
import org.jetbrains.jewel.foundation.lazy.items
import org.jetbrains.jewel.intui.standalone.IntUiTheme
import org.jetbrains.jewel.items
import java.awt.Font
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle

@Composable
fun ReleasesSampleCompose(project: Project) {
    SwingBridgeTheme {
        val svgLoader = service<SwingBridgeService>().svgLoader

        // TODO use splitter component once it exists
        Row(Modifier.fillMaxSize()) {
            var selectedItem: ContentItem? by remember { mutableStateOf(null) }

            LeftColumn(
                project = project,
                svgLoader = svgLoader,
                modifier = Modifier.weight(.4f).fillMaxHeight(),
                onSelectedItemChange = { selectedItem = it },
            )

            Divider(Modifier.fillMaxHeight(), orientation = Orientation.Vertical)

            RightColumn(
                selectedItem = selectedItem,
                modifier = Modifier.weight(.4f).fillMaxHeight(),
            )
        }
    }
}

@Composable
fun LeftColumn(
    project: Project,
    svgLoader: SvgLoader,
    modifier: Modifier = Modifier,
    onSelectedItemChange: (ContentItem?) -> Unit,
) {
    val service = remember(project) { project.service<ReleasesSampleService>() }
    val currentContentSource by service.content.collectAsState()
    var count = "Recomposing 1 — ${currentContentSource::class.simpleName} ${currentContentSource.items.size}"
    println(count)

    Column(modifier) {
        Row(
            modifier = Modifier.fillMaxWidth()
                .height(IntrinsicSize.Min)
                .padding(4.dp, 6.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text("Filter elements:")

            Spacer(Modifier.width(8.dp))

            val resourceLoader = LocalResourceLoader.current
            SearchBar(service, svgLoader, resourceLoader, Modifier.weight(1f))

            Spacer(Modifier.width(4.dp))

            OverflowMenu(currentContentSource, svgLoader, resourceLoader) {
                service.setContentSource(it)
            }
        }

        val interactionSource = remember { MutableInteractionSource() }
        var focused by remember { mutableStateOf(false) }
        LaunchedEffect(interactionSource) {
            interactionSource.interactions.collect {
                when (it) {
                    is FocusInteraction.Focus -> focused = true
                    is FocusInteraction.Unfocus -> focused = false
                }
            }
        }
        SelectableLazyColumn(
            modifier = Modifier
                .focusable(interactionSource = interactionSource)
                .border(2.dp, if (focused) Blue else Transparent),
            selectionMode = SelectionMode.Single,
            onSelectedIndexesChanged = {
                val selectedItem = if (it.isNotEmpty()) {
                    currentContentSource.items[it.first()]
                } else {
                    null
                }

                onSelectedItemChange(selectedItem)
            },
        ) {
            println("!!!" + count)
            println("Recomposing 2 — ${currentContentSource::class.simpleName} ${currentContentSource.items.size}")
            items(
                items = currentContentSource.items,
                key = { it.key },
                contentType = {
                    when (it) {
                        is ContentItem.AndroidRelease -> ItemType.AndroidRelease
                        is ContentItem.AndroidStudio -> ItemType.AndroidStudio
                    }
                },
            ) {
                ContentItemRow(it, isSelected, isActive)
            }
        }
    }
}

@Composable
private fun ContentItemRow(item: ContentItem, isSelected: Boolean, isActive: Boolean) {
    val color = when {
        isSelected && isActive -> retrieveColorOrUnspecified("List.selectionBackground")
        isSelected && !isActive -> retrieveColorOrUnspecified("List.selectionInactiveBackground")
        else -> Transparent
    }
    Row(
        modifier = Modifier.height(IntUiTheme.globalMetrics.rowHeight)
            .background(color)
            .padding(horizontal = 4.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(4.dp),
    ) {
        Text(
            text = item.displayText,
            modifier = Modifier.weight(1f),
            overflow = TextOverflow.Ellipsis,
        )

        when (item) {
            is ContentItem.AndroidRelease -> {
                ItemTag(
                    text = item.apiLevel.toString(),
                    backgroundColor = ReleaseChannel.Other.background.toComposeColor(),
                    foregroundColor = ReleaseChannel.Other.foreground.toComposeColor(),
                )
            }

            is ContentItem.AndroidStudio -> {
                val channel = item.channel
                ItemTag(
                    text = channel.name.lowercase(),
                    backgroundColor = channel.background.toComposeColor(),
                    foregroundColor = channel.foreground.toComposeColor(),
                )
            }
        }
    }
}

@Composable
private fun ItemTag(
    text: String,
    backgroundColor: Color,
    foregroundColor: Color,
    modifier: Modifier = Modifier,
    shape: Shape = RoundedCornerShape(4.dp),
    padding: PaddingValues = PaddingValues(horizontal = 4.dp, vertical = 2.dp),
) {
    Text(
        text = text,
        fontSize = JBFont.medium().size2D.sp,
        color = foregroundColor,
        modifier = modifier
            .background(backgroundColor, shape)
            .padding(padding),
    )
}

private enum class ItemType {
    AndroidRelease, AndroidStudio
}

@Composable
private fun SearchBar(
    service: ReleasesSampleService,
    svgLoader: SvgLoader,
    resourceLoader: ResourceLoader,
    modifier: Modifier = Modifier,
) {
    val filterText by service.filter.collectAsState()

    val searchIconProvider = retrieveStatelessIcon("actions/search.svg", svgLoader, IntUiTheme.iconData)
    val searchIcon by searchIconProvider.getPainter(resourceLoader)

    val focusRequester = remember { FocusRequester() }

    LaunchedEffect(Unit) {
        focusRequester.requestFocus()
    }

    TextField(
        value = filterText,
        onValueChange = { service.filterContent(it) },
        modifier = modifier.focusRequester(focusRequester),
        leadingIcon = {
            Icon(searchIcon, null, Modifier.padding(end = 8.dp))
        },
        trailingIcon = {
            if (filterText.isNotBlank()) {
                CloseIconButton(svgLoader, resourceLoader, service)
            }
        },
    )
}

@Composable
private fun CloseIconButton(
    svgLoader: SvgLoader,
    resourceLoader: ResourceLoader,
    service: ReleasesSampleService,
) {
    val interactionSource = remember { MutableInteractionSource() }
    var hovered by remember { mutableStateOf(false) }

    LaunchedEffect(interactionSource) {
        interactionSource.interactions.collect {
            when (it) {
                is HoverInteraction.Enter -> hovered = true
                is HoverInteraction.Exit -> hovered = false
            }
        }
    }

    val closeIconProvider = retrieveStatelessIcon("actions/close.svg", svgLoader, IntUiTheme.iconData)
    val closeIcon by closeIconProvider.getPainter(resourceLoader)

    val hoveredCloseIconProvider =
        retrieveStatelessIcon("actions/closeHovered.svg", svgLoader, IntUiTheme.iconData)
    val hoveredCloseIcon by hoveredCloseIconProvider.getPainter(resourceLoader)

    Icon(
        painter = if (hovered) hoveredCloseIcon else closeIcon,
        contentDescription = "Clear",
        modifier = Modifier
            .pointerHoverIcon(PointerIcon.Default)
            .clickable(
                interactionSource = interactionSource,
                indication = null,
                role = Role.Button,
            ) { service.resetFilter() },
    )
}

@Composable
private fun OverflowMenu(
    currentContentSource: ContentSource<*>,
    svgLoader: SvgLoader,
    resourceLoader: ResourceLoader,
    onContentSourceChange: (ContentSource<*>) -> Unit,
) {
    val iconProvider =
        retrieveStatelessIcon("actions/more.svg", svgLoader, IntUiTheme.iconData)
    val icon by iconProvider.getPainter(resourceLoader)

    val interactionSource = remember { MutableInteractionSource() }
    var hovered by remember { mutableStateOf(false) }
    var pressed by remember { mutableStateOf(false) }

    LaunchedEffect(interactionSource) {
        interactionSource.interactions.collect {
            when (it) {
                is HoverInteraction.Enter -> hovered = true
                is HoverInteraction.Exit -> hovered = false
                is PressInteraction.Press -> pressed = true
                is PressInteraction.Release, is PressInteraction.Cancel -> pressed = false
            }
        }
    }

    val backgroundColor = remember(hovered, pressed) {
        when {
            pressed -> JBUI.CurrentTheme.ActionButton.pressedBackground().toComposeColor()
            hovered -> JBUI.CurrentTheme.ActionButton.hoverBackground().toComposeColor()
            else -> Unspecified
        }
    }

    var menuVisible by remember { mutableStateOf(false) }

    // TODO use IconButton when it exists
    Icon(
        painter = icon,
        contentDescription = "Select data source",
        modifier = Modifier
            .fillMaxHeight()
            .clickable(interactionSource, null) { menuVisible = !menuVisible }
            .background(backgroundColor, RoundedCornerShape((DarculaUIUtil.BUTTON_ARC.unscaled / 2).dp)),
    )

    val contentSources = remember {
        listOf(AndroidStudioReleases, AndroidReleases)
    }

    if (menuVisible) {
        val checkedIconProvider =
            retrieveStatelessIcon("actions/checked.svg", svgLoader, IntUiTheme.iconData)
        val checkedIcon by checkedIconProvider.getPainter(resourceLoader)

        PopupMenu(
            onDismissRequest = {
                menuVisible = false
                true
            },
            horizontalAlignment = Alignment.Start,
            content = {
                items(
                    contentSources,
                    isSelected = {
                        // TODO fix this check once the "selected" check works correctly;
                        //  the selected flag should be set on mouse hover/keyboard navigation
                        it.isSameAs(currentContentSource)
                    },
                    onItemClick = onContentSourceChange,
                ) {
                    Row(
                        modifier = Modifier.height(IntUiTheme.globalMetrics.rowHeight),
                        horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.Start),
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        if (it.isSameAs(currentContentSource)) {
                            Icon(checkedIcon, null)
                        } else {
                            val iconWidth = (checkedIcon.intrinsicSize.width / LocalDensity.current.density).dp
                            Spacer(Modifier.width(iconWidth))
                        }

                        Text(it.displayName)
                    }
                }
            },
            resourceLoader = resourceLoader,
        )
    }
}

@Composable
fun RightColumn(
    selectedItem: ContentItem?,
    modifier: Modifier,
) {
    if (selectedItem == null) {
        Box(modifier, contentAlignment = Alignment.Center) {
            Text("Nothing to see here", color = JBUI.CurrentTheme.Label.disabledForeground().toComposeColor())
        }
    } else {
        Column(modifier) {
            val imagePath = selectedItem.imagePath
            if (imagePath != null) {
                val painter = painterResource(imagePath, LocalResourceLoader.current)
                Image(
                    painter = painter,
                    contentDescription = null,
                    modifier = Modifier.fillMaxWidth()
                        .aspectRatio(painter.intrinsicSize.ratio)
                        .sizeIn(maxHeight = 200.dp),
                    contentScale = ContentScale.FillWidth,
                )
            }

            Column(
                Modifier.verticalScroll(rememberScrollState())
                    .padding(horizontal = 20.dp, vertical = 12.dp),
                verticalArrangement = Arrangement.spacedBy(6.dp),
            ) {
                Text(
                    selectedItem.displayText,
                    fontWeight = FontWeight.Bold,
                    fontSize = JBFont.h1().size2D.sp,
                )

                val formatter = remember(Locale.current) { DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM) }
                val releaseDate = selectedItem.releaseDate
                if (releaseDate != null) {
                    Text(
                        text = "Released on ${formatter.format(releaseDate.toJavaLocalDate())}",
                        fontSize = getCommentFontSize(),
                        color = JBUI.CurrentTheme.Label.disabledForeground().toComposeColor(),
                    )
                }

                Spacer(Modifier.height(20.dp))

                when (selectedItem) {
                    is ContentItem.AndroidRelease -> AndroidReleaseDetails(selectedItem)
                    is ContentItem.AndroidStudio -> AndroidStudioReleaseDetails(selectedItem)
                }
            }
        }
    }
}

@Composable
private fun AndroidReleaseDetails(item: ContentItem.AndroidRelease) {
    TextWithLabel("Codename:", item.codename ?: "N/A")
    TextWithLabel("Version:", item.versionName)
    TextWithLabel("API level:", item.apiLevel.toString())
}

@Composable
private fun AndroidStudioReleaseDetails(item: ContentItem.AndroidStudio) {
    TextWithLabel("Channel:", item.channel.name)
    TextWithLabel("Version:", item.versionName)
    TextWithLabel("IntelliJ Platform version:", item.platformVersion)
    TextWithLabel("IntelliJ Platform build:", item.platformBuild)
    TextWithLabel("Full build number:", item.build)
}

@Composable
private fun TextWithLabel(labelText: String, valueText: String) {
    Row(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
        Text(labelText)
        Text(valueText, fontWeight = FontWeight.Bold)
    }
}

private val Size.ratio
    get() = width / height

// Logic from com.intellij.openapi.ui.panel.ComponentPanelBuilder#getCommentFont
private fun getCommentFontSize(font: Font = JBFont.label()): TextUnit {
    val commentFont = if (NewUI.isEnabled()) {
        JBFont.medium()
    } else {
        RelativeFont.NORMAL.fromResource("ContextHelp.fontSizeOffset", -2).derive(font)
    }
    return commentFont.size2D.sp
}
