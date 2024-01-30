enum class SupportedIJVersion(
    /** Human-readable major platform version. E.g., `2023.3` */
    val majorPlatformVersion: String,
    /** Raw major platform version. E.g., `233` */
    val rawPlatformVersion: String,
    /** If true, this platform version has its dedicated bridge artifact. */
    val hasBridgeArtifact: Boolean,
) {

    IJ_232("2023.2", "232", true),
    IJ_233("2023.3", "233", true),
    IJ_241("2024.1", "241", false),
}
