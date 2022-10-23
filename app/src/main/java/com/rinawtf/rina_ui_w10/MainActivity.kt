package com.rinawtf.rina_ui_w10

import android.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn = findViewById<ImageView>(R.id.btn)
         btn.setOnClickListener {
            val builder = AlertDialog.Builder(this)

            //set title for alert dialog
            val view = builder.setView(R.layout.alert_dialog)
            // Create the AlertDialog
            val alertDialog: AlertDialog = builder.create()
            // Set other dialog properties
            alertDialog.setCancelable(true)
            // alertDialogRed.setIcon(R.drawable.okay)
            alertDialog.show()
            alertDialog.window?.setLayout(1000, 800)
    }
    }
}