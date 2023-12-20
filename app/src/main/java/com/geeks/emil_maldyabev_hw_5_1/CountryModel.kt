package com.geeks.emil_maldyabev_hw_5_1

class CountryModel {

    var count = 0
    var isVisible = true

    fun inc() {
        count++
    }

    fun dec() {
        count--
    }

    fun clear() {
        count = 0
    }

    fun changeVisibility(isVisible: Boolean) {
        this.isVisible = isVisible
    }
}