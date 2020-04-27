package com.example.sampleconductorproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bluelinelabs.conductor.RouterTransaction

class FirstController : BaseController() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup): View {
        val view = inflater.inflate(R.layout.controller_first, container, false)
        val childRouter = getChildRouter(container)
        childRouter.setRoot(RouterTransaction.with(SecondController()))

        return view
    }
}