plugins {
    kotlin("jvm") version "2.0.20"
}

group = "org.openjfx"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation(kotlin("script-runtime"))
    implementation("org.antlr:antlr4:4.13.2")
}

tasks.test {
    useJUnitPlatform()
}