
plugins {
    java
    checkstyle
}

allprojects {
    group = "org.scramados"
    version = "0.1-SNAPSHOT"
}

subprojects {
    apply(plugin = "java")
    apply(plugin = "checkstyle")

    repositories {
        mavenCentral()
    }

    dependencies {
        testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
        testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
    }

    tasks.getByName<Test>("test") {
        useJUnitPlatform()
    }

    tasks.jar {
        manifest {

            attributes(
                "time" to project.version

            )
        }
    }
}
