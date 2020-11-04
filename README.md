# Open Grocer Project

## Overview
This project is both reference implementation of an grocery delivery app that uses Koin for dependency injection and Robolectric and Espresso for testing.

## Local Development Environment

## Technical Details

### Data Binding
Data binding is enabled in the app via an app `build.gradle` configuration.

```gradle
android {
    compileSdkVersion 29
    ...
    dataBinding {
        enabled true
    }
```

## Style and Design
This app follows the Material Design paradigm.

```gradle
dependencies {
    api "com.google.android.material:material:1.3.0-alpha03"
```

## Testing

## References
- [Build a Flexible UI](https://developer.android.com/training/basics/fragments/fragment-ui)
- [android kotlin - Fragment transaction example](https://android--examples.blogspot.com/2019/07/android-kotlin-fragment-transaction.html)
- [Get started with the Navigation component](https://developer.android.com/guide/navigation/navigation-getting-started)
- [Jetpack Navigation](https://codelabs.developers.google.com/codelabs/android-navigation/index.html?index=..%2F..index#0)
- [Jetpack Lifecycle](https://developer.android.com/jetpack/androidx/releases/lifecycle)
- [Room Persistence Library](https://developer.android.com/topic/libraries/architecture/room)
- [Koin](https://insert-koin.io/)
- [Retrofit](https://square.github.io/retrofit/)
- [Robolectric](http://robolectric.org/)
- [Material Android](https://material.io/develop/android)
- [Espresso Framework: Creating UI Tests using Page Object Model](https://medium.com/software-testing-break-and-improve/espresso-framework-creating-ui-tests-using-page-object-model-c3c73c138534)