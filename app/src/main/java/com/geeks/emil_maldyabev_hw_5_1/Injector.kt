package com.geeks.emil_maldyabev_hw_5_1

class Injector {

    companion object {
        fun getPresenter() = Presenter()
        fun getModel() = CountryModel()
    }
}