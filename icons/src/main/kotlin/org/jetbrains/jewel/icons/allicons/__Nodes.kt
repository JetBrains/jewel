package org.jetbrains.jewel.icons.allicons

import androidx.compose.runtime.Composable
import org.jetbrains.jewel.icons.AllIcons
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.nodes.AbstractException
import org.jetbrains.jewel.icons.allicons.nodes.Alias
import org.jetbrains.jewel.icons.allicons.nodes.Annotation
import org.jetbrains.jewel.icons.allicons.nodes.AnnotationFolder
import org.jetbrains.jewel.icons.allicons.nodes.Class
import org.jetbrains.jewel.icons.allicons.nodes.ClassAbstract
import org.jetbrains.jewel.icons.allicons.nodes.ClassAnonymous
import org.jetbrains.jewel.icons.allicons.nodes.ClassInitializer
import org.jetbrains.jewel.icons.allicons.nodes.Constant
import org.jetbrains.jewel.icons.allicons.nodes.Controller
import org.jetbrains.jewel.icons.allicons.nodes.CopyOfFolder
import org.jetbrains.jewel.icons.allicons.nodes.DataColumn
import org.jetbrains.jewel.icons.allicons.nodes.DataSchema
import org.jetbrains.jewel.icons.allicons.nodes.DataTables
import org.jetbrains.jewel.icons.allicons.nodes.Desktop
import org.jetbrains.jewel.icons.allicons.nodes.EditFolder
import org.jetbrains.jewel.icons.allicons.nodes.Enum
import org.jetbrains.jewel.icons.allicons.nodes.ErrorIntroduction
import org.jetbrains.jewel.icons.allicons.nodes.Exception
import org.jetbrains.jewel.icons.allicons.nodes.ExcludeRoot
import org.jetbrains.jewel.icons.allicons.nodes.ExcludedGenerated
import org.jetbrains.jewel.icons.allicons.nodes.Field
import org.jetbrains.jewel.icons.allicons.nodes.Folder
import org.jetbrains.jewel.icons.allicons.nodes.Function
import org.jetbrains.jewel.icons.allicons.nodes.Generated
import org.jetbrains.jewel.icons.allicons.nodes.GeneratedSource
import org.jetbrains.jewel.icons.allicons.nodes.GeneratedTestRoot
import org.jetbrains.jewel.icons.allicons.nodes.Gvariable
import org.jetbrains.jewel.icons.allicons.nodes.HomeFolder
import org.jetbrains.jewel.icons.allicons.nodes.IdeaProject
import org.jetbrains.jewel.icons.allicons.nodes.Include
import org.jetbrains.jewel.icons.allicons.nodes.Interface
import org.jetbrains.jewel.icons.allicons.nodes.Jdk
import org.jetbrains.jewel.icons.allicons.nodes.Lambda
import org.jetbrains.jewel.icons.allicons.nodes.Library
import org.jetbrains.jewel.icons.allicons.nodes.LibraryFolder
import org.jetbrains.jewel.icons.allicons.nodes.Method
import org.jetbrains.jewel.icons.allicons.nodes.MethodAbstract
import org.jetbrains.jewel.icons.allicons.nodes.MethodReference
import org.jetbrains.jewel.icons.allicons.nodes.ModelClass
import org.jetbrains.jewel.icons.allicons.nodes.Module
import org.jetbrains.jewel.icons.allicons.nodes.Module8x8
import org.jetbrains.jewel.icons.allicons.nodes.ModuleGroup
import org.jetbrains.jewel.icons.allicons.nodes.ModuleJava
import org.jetbrains.jewel.icons.allicons.nodes.Package
import org.jetbrains.jewel.icons.allicons.nodes.Parameter
import org.jetbrains.jewel.icons.allicons.nodes.Plugin
import org.jetbrains.jewel.icons.allicons.nodes.PpWeb
import org.jetbrains.jewel.icons.allicons.nodes.Property
import org.jetbrains.jewel.icons.allicons.nodes.Record
import org.jetbrains.jewel.icons.allicons.nodes.ResourcesRoot
import org.jetbrains.jewel.icons.allicons.nodes.Servlet
import org.jetbrains.jewel.icons.allicons.nodes.SourceRoot
import org.jetbrains.jewel.icons.allicons.nodes.Star
import org.jetbrains.jewel.icons.allicons.nodes.StarEmpty
import org.jetbrains.jewel.icons.allicons.nodes.Static
import org.jetbrains.jewel.icons.allicons.nodes.Template
import org.jetbrains.jewel.icons.allicons.nodes.Test
import org.jetbrains.jewel.icons.allicons.nodes.TestGroup
import org.jetbrains.jewel.icons.allicons.nodes.TestIgnored
import org.jetbrains.jewel.icons.allicons.nodes.TestResourcesRoot
import org.jetbrains.jewel.icons.allicons.nodes.TestRoot
import org.jetbrains.jewel.icons.allicons.nodes.TestSourceFolder
import org.jetbrains.jewel.icons.allicons.nodes.Type
import org.jetbrains.jewel.icons.allicons.nodes.UnloadedModule
import org.jetbrains.jewel.icons.allicons.nodes.UpFolder
import org.jetbrains.jewel.icons.allicons.nodes.Variable
import org.jetbrains.jewel.icons.allicons.nodes.WarningIntroduction
import org.jetbrains.jewel.icons.allicons.nodes.WebFolder
import kotlin.collections.List as ____KtList

public object NodesGroup

public val AllIcons.Nodes: NodesGroup
  get() = NodesGroup

private var __AllAssets: ____KtList<IntellijIconData>? = null

public val NodesGroup.AllAssets: ____KtList<IntellijIconData>
  @Composable
  get() {
    if (__AllAssets != null) {
      return __AllAssets!!
    }
    __AllAssets= listOf(GeneratedSource, ClassInitializer, EditFolder, CopyOfFolder, ResourcesRoot,
        Jdk, ModuleJava, Field, TestRoot, ModuleGroup, Method, Function, Library, Servlet,
        WarningIntroduction, ErrorIntroduction, Interface, UnloadedModule, Plugin, MethodAbstract,
        Enum, SourceRoot, AnnotationFolder, Package, Type, Include, ExcludeRoot, Desktop, Variable,
        WebFolder, Controller, Gvariable, Class, LibraryFolder, Record, Static, StarEmpty, Constant,
        IdeaProject, Parameter, Exception, HomeFolder, TestSourceFolder, ModelClass, DataColumn,
        ClassAbstract, UpFolder, Template, Star, Alias, DataSchema, TestGroup, ClassAnonymous,
        DataTables, ExcludedGenerated, AbstractException, PpWeb, Lambda, MethodReference, Module,
        Module8x8, Property, GeneratedTestRoot, TestResourcesRoot, Generated, Folder, TestIgnored,
        Test, Annotation)
    return __AllAssets!!
  }
