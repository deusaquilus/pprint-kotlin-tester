import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi

plugins {
    kotlin("multiplatform") version "1.9.22"
    kotlin("plugin.serialization") version "1.9.22"
}

repositories {
    mavenCentral()
    mavenLocal()
}

kotlin {
    jvm {
        jvmToolchain(8)

        @OptIn(ExperimentalKotlinGradlePluginApi::class)
        mainRun {
            mainClass = "MainKt"
        }
    }

    linuxX64 {
        binaries {
            executable(listOf(DEBUG, RELEASE)) {
                entryPoint = "main"
            }
        }
    }

    /*
    js {
        browser()
        nodejs()
    }
     */

    // todo: kotest doesn't have wasm targets yet
    /*
    @OptIn(ExperimentalWasmDsl::class)
    wasmJs()

    @OptIn(ExperimentalWasmDsl::class)
    wasmWasi()
     */

    /*
    macosArm64()

    iosArm64()
     */


    sourceSets {
        commonMain {
            dependencies {
                implementation("io.exoquery:pprint-kotlin:1.2.2-SNAPSHOT")
                //implementation("org.jetbrains.kotlinx:kotlinx-serialization-core:1.6.2")
            }
        }
    }

}
