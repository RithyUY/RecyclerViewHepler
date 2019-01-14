package com.rithyuy.recyclerviewhelper

import androidx.recyclerview.widget.RecyclerView
import android.view.ViewGroup

class RecyclerViewAdapter<T, VM : ViewHolder<T>>(
        private var mItems: ArrayList<T>,
        private val viewHolderProvider: ViewHolderProvider<T, VM>,
        private var itemTypeProvider: ItemTypeProvider? = null) : androidx.recyclerview.widget.RecyclerView.Adapter<VM>() {

    override fun onCreateViewHolder(parent: ViewGroup, itemType: Int): VM {
        return viewHolderProvider.onCreateViewHolder(parent, itemType)
    }

    override fun getItemCount() = mItems.size

    override fun onBindViewHolder(holder: VM, position: Int) {
        holder.onBind(mItems[position])
    }

    override fun getItemViewType(position: Int) = itemTypeProvider?.getItemType(position) ?: 0

}