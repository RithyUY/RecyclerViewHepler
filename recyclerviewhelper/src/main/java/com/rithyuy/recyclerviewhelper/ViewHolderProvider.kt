package com.rithyuy.recyclerviewhelper

import android.view.ViewGroup

interface ViewHolderProvider<T, VH : ViewHolder<T>> {

    fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): VH
}

