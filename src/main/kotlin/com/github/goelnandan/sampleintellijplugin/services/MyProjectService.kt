package com.github.goelnandan.sampleintellijplugin.services

import com.intellij.openapi.project.Project
import com.github.goelnandan.sampleintellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
