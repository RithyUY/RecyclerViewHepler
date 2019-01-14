package com.rithyuy.testapp.dsl

import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatTextView
import androidx.appcompat.widget.LinearLayoutCompat
import android.view.ViewGroup

fun ViewGroup.verticalGroup(block: LinearLayoutCompat.() -> Unit) {
    val layout = LinearLayoutCompat(context)
    layout.orientation = LinearLayoutCompat.VERTICAL
    addView(layout.apply(block))
}

fun ViewGroup.button(label: String = "" ,block: AppCompatButton.() -> Unit) {
    val buttonComponent = AppCompatButton(context)
    buttonComponent.text = label
    addView(buttonComponent.apply(block))
}

fun ViewGroup.text(label: String = "",block: AppCompatTextView.() -> Unit) {
    val textComponent = AppCompatTextView(context)
    textComponent.text = label
    addView(textComponent.apply(block))
}

fun ViewGroup.horizontalGroup(block: LinearLayoutCompat.()-> Unit) {
    val layout = LinearLayoutCompat(context)
    layout.orientation = LinearLayoutCompat.HORIZONTAL
    addView(layout.apply(block))
}