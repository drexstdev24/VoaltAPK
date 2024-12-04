plugins {
    id("Voalt_library")
}

Android {
    namespace = "org.voalt.video"
}

dependencies {
  implementention(project(":core-util"))
  implementention(libs.libssignal.android)
  implementention(libs.google.guava.android)
}