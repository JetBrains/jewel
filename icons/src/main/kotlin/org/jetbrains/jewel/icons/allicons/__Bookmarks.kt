package org.jetbrains.jewel.icons.allicons

import androidx.compose.runtime.Composable
import org.jetbrains.jewel.icons.AllIcons
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.bookmarks.AddBookmarksList
import org.jetbrains.jewel.icons.allicons.bookmarks.Bookmark
import org.jetbrains.jewel.icons.allicons.bookmarks.BookmarksList
import org.jetbrains.jewel.icons.allicons.bookmarks.Mnemonic
import kotlin.collections.List as ____KtList

public object BookmarksGroup

public val AllIcons.Bookmarks: BookmarksGroup
  get() = BookmarksGroup

private var __AllAssets: ____KtList<IntellijIconData>? = null

public val BookmarksGroup.AllAssets: ____KtList<IntellijIconData>
  @Composable
  get() {
    if (__AllAssets != null) {
      return __AllAssets!!
    }
    __AllAssets= listOf(AddBookmarksList, BookmarksList, Mnemonic, Bookmark)
    return __AllAssets!!
  }
