plugins {
    id("java")
    id ("org.jetbrains.kotlin.jvm") version "1.6.20"
}

val ktor_version = "2.0.1"
val logback_version = "1.2.11"

allprojects {
    group = "com.lderic"
    version = "0.0.0"

    apply(plugin = "java")
    apply(plugin = "org.jetbrains.kotlin.jvm")

    repositories {
        mavenCentral()
    }

    dependencies {
        implementation(kotlin("stdlib"))
        implementation("io.ktor:ktor-server-core:$ktor_version")
        implementation("io.ktor:ktor-server-netty:$ktor_version")
        implementation("io.ktor:ktor-server-websockets:$ktor_version")
        implementation("ch.qos.logback:logback-classic:$logback_version")
        testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.2")
        testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.2")
    }

    tasks.getByName<Test>("test") {
        useJUnitPlatform()
    }
}