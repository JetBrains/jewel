import java.util.Properties
import org.gradle.api.Project

internal fun Project.localProperty(propertyName: String): String? {
  val localPropertiesFile = rootProject.file("local.properties")
  if (!localPropertiesFile.exists()) {
    return null
  }
  val properties = Properties()
  localPropertiesFile.inputStream().use { properties.load(it) }
  return properties.getProperty(propertyName)
}
