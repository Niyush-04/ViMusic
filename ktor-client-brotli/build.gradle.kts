plugins {
    alias(libs.plugins.kotlin.jvm)
}

dependencies {
    implementation(libs.ktor.client.encoding)
    implementation(libs.brotli)
}