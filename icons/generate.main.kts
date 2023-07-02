#!/usr/bin/env kotlin

@file:Repository("https://jitpack.io")
@file:Repository("https://maven.google.com")

@file:DependsOn("com.github.DevSrSouza:svg-to-compose:0.8.1")

import br.com.devsrsouza.svg2compose.Svg2Compose
import br.com.devsrsouza.svg2compose.VectorType
import java.io.File

val assetsDir = File("assets")
val srcDir = File("src/main/kotlin")

Svg2Compose.parse(
    applicationIconPackage = "assets",
    accessorName = "JetnewsAssets",
    outputSourceDirectory = srcDir,
    vectorsDirectory = assetsDir,
    type = VectorType.SVG,
    allAssetsPropertyName = "AllAssets"
)
