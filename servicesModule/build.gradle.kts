plugins {
    id("java-library")
    id("org.jetbrains.kotlin.jvm")
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_7
    targetCompatibility = JavaVersion.VERSION_1_7
}

dependencies {

    implementation(Libs.androidCore)
    implementation (Libs.material)
    implementation(Libs.retrofit2Moshi)
    implementation(Libs.coroutinesCore)
    implementation(Libs.moshiCore)
    implementation(Libs.koinAndroid)
    implementation(Libs.koinScope)
    implementation(Libs.koinViewModel)
    testImplementation(Libs.jUnit)
}