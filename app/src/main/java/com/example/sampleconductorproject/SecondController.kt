package com.example.sampleconductorproject

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bluelinelabs.conductor.RouterTransaction
import com.bluelinelabs.conductor.changehandler.FadeChangeHandler
import kotlinx.android.synthetic.main.controller_second.view.*

class SecondController : BaseController(), AlertDialog.AlertDialogTargetCallback {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup): View {
        val view = inflater.inflate(R.layout.controller_second, container, false)

        view.btn.setOnClickListener {
            val controller = AlertDialog()
            controller.setAlertDialogListener(this)

            getTopRouter().pushController(
                RouterTransaction.with(controller)
                    .pushChangeHandler(FadeChangeHandler(false))
                    .popChangeHandler(FadeChangeHandler())
            )
        }

        return view
    }

    override fun onAlertDialogDismiss() {
        Log.d("myLogs", "onAlertDialogDismiss")
    }
}