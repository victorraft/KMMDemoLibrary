# KMM Demo Library
This is a simple demo I'm making to demonstrate how to create a Kotlin Multiplatform library and use it in Android and iOS applications.

## How to use this library
The compiled artifacts for this library are not being publicly distributed yet, so you need to clone this repo to your machine, compile/host the artifacts locally. 
I'll look how to host the artifacts remotely in Maven/Sonatype soon.

### Distribute the library's artifacts in your local machine
- Clone the repository
- Make sure you can compile the project locally in Android Studio.
- In the terminal, execute this command: `./gradlew publishToMavenLocal`

### Import this library in an Android app
Add the `mavenLocal()` repository to your build.gradle's `repositories` block.

Include the dependency in your build.gradle:
```
implementation 'com.vron:kmm-library:0.1'
```

After that you should be able to import the code from the library and use its functions and classes:
```
import com.vron.kmmdemolib.getPlatform

val platformName = getPlatform().name
Log.d("KMM TEST", "Platform: $platformName")
```