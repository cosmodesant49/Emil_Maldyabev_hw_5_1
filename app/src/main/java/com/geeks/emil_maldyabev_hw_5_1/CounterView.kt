package com.geeks.emil_maldyabev_hw_5_1

interface CounterView {
    fun showCount(count: Int)
    fun changedVisible(isVisible: Boolean)
    fun showToast(message: String)
    fun changeTextColor()
}