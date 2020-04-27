package com.example.sampleconductorproject

import com.bluelinelabs.conductor.Controller
import com.bluelinelabs.conductor.Router

abstract class BaseController : Controller() {
    open fun getTopRouter(): Router {
        val parent = parentController
        return if (parent is BaseController) {
            parent.getTopRouter()
        } else {
            router
        }
    }
}