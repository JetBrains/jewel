package org.jetbrains.jewel.icons.allicons

import androidx.compose.runtime.Composable
import org.jetbrains.jewel.icons.AllIcons
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.filetypes.ActionScript
import org.jetbrains.jewel.icons.allicons.filetypes.AddAny
import org.jetbrains.jewel.icons.allicons.filetypes.AngularJS
import org.jetbrains.jewel.icons.allicons.filetypes.AnyType
import org.jetbrains.jewel.icons.allicons.filetypes.Archive
import org.jetbrains.jewel.icons.allicons.filetypes.AspectJ
import org.jetbrains.jewel.icons.allicons.filetypes.ChangedFile
import org.jetbrains.jewel.icons.allicons.filetypes.ChangedFiles
import org.jetbrains.jewel.icons.allicons.filetypes.Config
import org.jetbrains.jewel.icons.allicons.filetypes.Css
import org.jetbrains.jewel.icons.allicons.filetypes.Csv
import org.jetbrains.jewel.icons.allicons.filetypes.Cucumber
import org.jetbrains.jewel.icons.allicons.filetypes.Diagram
import org.jetbrains.jewel.icons.allicons.filetypes.Eclipse
import org.jetbrains.jewel.icons.allicons.filetypes.EditorConfig
import org.jetbrains.jewel.icons.allicons.filetypes.Font
import org.jetbrains.jewel.icons.allicons.filetypes.Freemaker
import org.jetbrains.jewel.icons.allicons.filetypes.Gitignore
import org.jetbrains.jewel.icons.allicons.filetypes.Html
import org.jetbrains.jewel.icons.allicons.filetypes.IdeaModule
import org.jetbrains.jewel.icons.allicons.filetypes.Idl
import org.jetbrains.jewel.icons.allicons.filetypes.Ignored
import org.jetbrains.jewel.icons.allicons.filetypes.Image
import org.jetbrains.jewel.icons.allicons.filetypes.Java
import org.jetbrains.jewel.icons.allicons.filetypes.JavaScript
import org.jetbrains.jewel.icons.allicons.filetypes.Jest
import org.jetbrains.jewel.icons.allicons.filetypes.Jfr
import org.jetbrains.jewel.icons.allicons.filetypes.Jshint
import org.jetbrains.jewel.icons.allicons.filetypes.Json
import org.jetbrains.jewel.icons.allicons.filetypes.Jsp
import org.jetbrains.jewel.icons.allicons.filetypes.Jspx
import org.jetbrains.jewel.icons.allicons.filetypes.Less
import org.jetbrains.jewel.icons.allicons.filetypes.Lombok
import org.jetbrains.jewel.icons.allicons.filetypes.LombokConfig
import org.jetbrains.jewel.icons.allicons.filetypes.Manifest
import org.jetbrains.jewel.icons.allicons.filetypes.Modified
import org.jetbrains.jewel.icons.allicons.filetypes.Patch
import org.jetbrains.jewel.icons.allicons.filetypes.Perl
import org.jetbrains.jewel.icons.allicons.filetypes.Properties
import org.jetbrains.jewel.icons.allicons.filetypes.Protobuf
import org.jetbrains.jewel.icons.allicons.filetypes.React
import org.jetbrains.jewel.icons.allicons.filetypes.Regexp
import org.jetbrains.jewel.icons.allicons.filetypes.Sbt
import org.jetbrains.jewel.icons.allicons.filetypes.Scala
import org.jetbrains.jewel.icons.allicons.filetypes.Scratch
import org.jetbrains.jewel.icons.allicons.filetypes.Scratches
import org.jetbrains.jewel.icons.allicons.filetypes.Scss
import org.jetbrains.jewel.icons.allicons.filetypes.Shell
import org.jetbrains.jewel.icons.allicons.filetypes.SourceMap
import org.jetbrains.jewel.icons.allicons.filetypes.Sql
import org.jetbrains.jewel.icons.allicons.filetypes.Text
import org.jetbrains.jewel.icons.allicons.filetypes.UiForm
import org.jetbrains.jewel.icons.allicons.filetypes.Unknown
import org.jetbrains.jewel.icons.allicons.filetypes.VueJs
import org.jetbrains.jewel.icons.allicons.filetypes.Wsdl
import org.jetbrains.jewel.icons.allicons.filetypes.Xhtml
import org.jetbrains.jewel.icons.allicons.filetypes.Xml
import org.jetbrains.jewel.icons.allicons.filetypes.Xsd
import org.jetbrains.jewel.icons.allicons.filetypes.Yaml
import org.jetbrains.jewel.icons.allicons.filetypes.Yarn
import kotlin.collections.List as ____KtList

public object FiletypesGroup

public val AllIcons.Filetypes: FiletypesGroup
  get() = FiletypesGroup

private var __AllAssets: ____KtList<IntellijIconData>? = null

public val FiletypesGroup.AllAssets: ____KtList<IntellijIconData>
  @Composable
  get() {
    if (__AllAssets != null) {
      return __AllAssets!!
    }
    __AllAssets= listOf(Config, Jspx, Jshint, Protobuf, Manifest, JavaScript, Xml, Jsp, ChangedFile,
        SourceMap, Java, Scratch, Unknown, Sql, Jfr, Properties, Scss, AddAny, Scala, Perl, Shell,
        Json, Archive, ChangedFiles, Scratches, Idl, Text, Image, Csv, Yarn, Sbt, Regexp, AspectJ,
        Freemaker, AngularJS, Eclipse, Diagram, LombokConfig, Css, Jest, Xsd, ActionScript,
        Cucumber, EditorConfig, Ignored, Yaml, UiForm, Wsdl, Xhtml, React, Less, Gitignore, VueJs,
        Html, AnyType, Patch, Modified, Lombok, IdeaModule, Font)
    return __AllAssets!!
  }
