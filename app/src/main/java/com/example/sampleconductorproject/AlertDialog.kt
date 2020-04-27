package com.example.sampleconductorproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bluelinelabs.conductor.Controller

class AlertDialog : BaseController() {

    interface AlertDialogTargetCallback {
        fun onAlertDialogDismiss()
    }

    fun <T> setAlertDialogListener(targetController: T) where T : Controller, T : AlertDialogTargetCallback {
        setTargetController(targetController)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup): View {
        return inflater.inflate(R.layout.controller_alert_dialog, container, false)
    }

    override fun onDestroy() {
        (targetController as AlertDialogTargetCallback).onAlertDialogDismiss()
        super.onDestroy()
    }
}