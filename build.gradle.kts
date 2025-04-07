plugins {
    id("java")
    id("com.gradleup.shadow") version "9.0.0-beta11"
    id("io.freefair.lombok") version "8.13.1"
    id("de.eldoria.plugin-yml.paper") version "0.7.1"
}

group = "com.spektrsoyuz"
version = "1.0"

repositories {
    mavenCentral()
    maven("https://repo.papermc.io/repository/maven-public/")
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:1.21.5-R0.1-SNAPSHOT")
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(21))
}

tasks {
    shadowJar {
        archiveClassifier.set("")
    }
    build {
        dependsOn(shadowJar)
    }
}

paper {
    name = "VoidGen"
    main = "com.spektrsoyuz.voidGen.VoidGen"
    apiVersion = "1.21.5"
    website = "https://spektrsoyuz.com/plugins/VoidGen"
    authors = listOf("SpektrSoyuz")
    foliaSupported = false

    serverDependencies {

    }

    permissions {

    }
}