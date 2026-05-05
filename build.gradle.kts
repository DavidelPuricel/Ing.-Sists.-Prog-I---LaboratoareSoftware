plugins {
    java
}

repositories {
    mavenCentral()
}

dependencies {
    // Bibliotecile pentru Excel (Apache POI)
    implementation("org.apache.poi:poi:5.5.1")
    implementation("org.apache.poi:poi-ooxml:5.5.1")

    // Bibliotecile pentru logare (ca să nu mai ai erori de tip Logger)
    implementation("org.apache.logging.log4j:log4j-api:2.25.4")
    implementation("org.apache.logging.log4j:log4j-core:2.25.4")
}