package com.geeks.emil_maldyabev_hw_5_1

class Presenter {

    private var model = Injector.getModel()
    private lateinit var view: CounterView

    fun increment() {
        model.inc()
        view.showCount(model.count)
    }

    fun checkNumber() {
        if (model.count == 10) {
            view.showToast("Поздравляем")
        } else if (model.count == 15) {
            view.changeTextColor()
        }
    }

    fun decrement() {
        model.dec()
        view.showCount(model.count)
    }

    fun changeVisible() {
        if (model.isVisible) {
            model.changeVisibility(false)
        } else model.changeVisibility(true)
        view.changedVisible(model.isVisible)
    }

    fun clear() {
        model.clear()
        view.showCount(model.count)
    }

    fun attachView(view: CounterView) {
        this.view = view
    }
}