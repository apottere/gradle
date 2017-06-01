package Gradle_Check_TestCoverageNoDaemonJava8Windows

import Gradle_Check_TestCoverageNoDaemonJava8Windows.buildTypes.Gradle_Check_TestCoverageNoDaemonJava8Windows_1
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "e462bf6d-9e17-4d7f-976b-bcab91fe7938"
    extId = "Gradle_Check_TestCoverageNoDaemonJava8Windows"
    parentId = "Gradle_Check_Stage7"
    name = "Test Coverage - No-daemon Java8 Windows"


    for (bucket in 1..8) {
        buildType(Gradle_Check_TestCoverageNoDaemonJava8Windows_1("" + bucket))
    }
})
