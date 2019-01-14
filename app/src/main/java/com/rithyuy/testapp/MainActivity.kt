package com.rithyuy.testapp

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import com.rithyuy.recyclerviewhelper.ViewHolder
import com.rithyuy.recyclerviewhelper.ViewHolderProvider
import com.rithyuy.testapp.dsl.button
import com.rithyuy.testapp.dsl.horizontalGroup
import com.rithyuy.testapp.dsl.text
import com.rithyuy.testapp.dsl.verticalGroup

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        configurationWindow()
        setContentView(R.layout.activity_main)
    }

    private fun configurationWindow() {

        if (Build.VERSION.SDK_INT == Build.VERSION_CODES.O) {
            window.decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_FULLSCREEN
                    or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                    or View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
                    or View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR)
            return
        }

        window.decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_FULLSCREEN
                or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR)
    }
}