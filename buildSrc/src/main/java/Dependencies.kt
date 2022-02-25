object Versions {

    // App version
    const val appVersionCode = 1
    const val appVersionName = "1.0"

    // Android versions
    const val compileSdkVersion = 31
    const val minSdkVersion = 23
    const val targetSdkVersion = 31

    // Library versions
    const val androidAccompanistSystemuiControllerVersion = "0.17.0"
    const val androidxActivityComposeVersion = "1.3.1"
    const val androidxComposeVersion = "1.0.5"
    const val androidxCoreKtxVersion = "1.7.0"
    const val androidxComposeNavigationVersion = "2.4.1"
    const val androidxLifecycleViewModelComposeVersion = "1.0.0-alpha07"
    const val androidxMaterialVersion = "1.4.0"
    const val appCompatVersion = "1.4.1"
    const val gsonVersion = "2.8.9"
    const val ioCoilComposeVersion = "1.3.1"
    const val koinVersion = "3.1.5"
    const val kotlinCompilerExtensionVersion = "1.2.0-alpha03"
    const val kotlinCoroutinesVersion = "1.6.0"
    const val kotlinVersion = "1.6.10"
    const val retrofitVersion = "2.9.0"
}

object Dependencies {
    const val androidAccompanistSystemuiController = "com.google.accompanist:accompanist-systemuicontroller:${Versions.androidAccompanistSystemuiControllerVersion}"
    const val androidMaterial = "com.google.android.material:material:${Versions.androidxMaterialVersion}"
    const val androidxActivityCompose = "androidx.activity:activity-compose:${Versions.androidxActivityComposeVersion}"
    const val androidxAppcompat = "androidx.appcompat:appcompat:${Versions.appCompatVersion}"
    const val androidxComposeNavigation = "androidx.navigation:navigation-compose:${Versions.androidxComposeNavigationVersion}"
    const val androidxComposeUi = "androidx.compose.ui:ui:${Versions.androidxComposeVersion}"
    const val androidxComposeUiFoundation = "androidx.compose.foundation:foundation:${Versions.androidxComposeVersion}"
    const val androidxComposeUiMaterial = "androidx.compose.material:material:${Versions.androidxComposeVersion}"
    const val androidxComposeUiMaterialIcons = "androidx.compose.material:material-icons-core:${Versions.androidxComposeVersion}"
    const val androidxComposeUiMaterialIconsExtended = "androidx.compose.material:material-icons-extended:${Versions.androidxComposeVersion}"
    const val androidxComposeUiTooling = "androidx.compose.ui:ui-tooling:${Versions.androidxComposeVersion}"
    const val androidxComposeRuntimeLivedata = "androidx.compose.runtime:runtime-livedata:${Versions.androidxComposeVersion}"
    const val androidxCoreKtx = "androidx.core:core-ktx:${Versions.androidxCoreKtxVersion}"
    const val androidxLifecycleViewModelCompose = "androidx.lifecycle:lifecycle-viewmodel-compose:${Versions.androidxLifecycleViewModelComposeVersion}"
    const val gson = "com.google.code.gson:gson:${Versions.gsonVersion}"
    const val ioCoilCompose = "io.coil-kt:coil-compose:${Versions.ioCoilComposeVersion}"
    const val koinAndroid = "io.insert-koin:koin-android:${Versions.koinVersion}"
    const val koinAndroidCompose = "io.insert-koin:koin-androidx-compose:${Versions.koinVersion}"
    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlinVersion}"
    const val kotlinCoroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.kotlinCoroutinesVersion}"
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofitVersion}"
    const val retrofitConverterGson = "com.squareup.retrofit2:converter-gson:${Versions.retrofitVersion}"
}
