package com.rithyuy.recyclerviewhelper

interface ItemTypeProvider {

    fun getItemType(position: Int) : Int
}