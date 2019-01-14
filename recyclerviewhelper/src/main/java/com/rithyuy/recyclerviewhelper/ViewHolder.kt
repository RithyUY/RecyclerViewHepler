package com.rithyuy.recyclerviewhelper

import androidx.recyclerview.widget.RecyclerView
import android.view.View

abstract class ViewHolder<T>(view: View) : androidx.recyclerview.widget.RecyclerView.ViewHolder(view) {

    abstract fun onBind(data: T)
}