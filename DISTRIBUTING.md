# Creating a self-contained application

You can package the standalone sample with the following gradle tasks:

- Linux `samples:standalone:packageLinuxX64`
- macOS `samples:standalone:packageMacOsAarch64`
- Windows `samples:standalone:packageWinX64`

The packaged application zip will be in the `build/construo/dist` folder.

## Signing and notarization on MacOS

Signing of the final application must be done **after** creating a self-contained application, using the standard Apple tools, see the [official documentation](https://developer.apple.com/documentation/security/customizing-the-notarization-workflow).
