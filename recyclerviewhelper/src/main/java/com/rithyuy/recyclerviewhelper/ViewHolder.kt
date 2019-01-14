package com.rithyuy.recyclerviewhelper

import android.support.v7.widget.RecyclerView
import android.view.View

abstract class ViewHolder<T>(view: View) : RecyclerView.ViewHolder(view) {

    abstract fun onBind(data: T)
}