package com.taraniuk.github.api.customviewapp.ui.main.viewModel

import android.animation.ObjectAnimator
import android.graphics.Path
import android.view.View

class MainViewModel {

    lateinit var view: View
    private var path = Path()

    private fun startPosition(width: Float, height: Float) {
        path.moveTo(width / 2, height / 2)
    }

    private fun nextPosition(x: Float, y: Float) {
        path.lineTo(x, y)
    }

    private fun move() {

        ObjectAnimator.ofFloat(view, View.X, View.Y, path).apply {
            duration = 4000
            start()
        }
    }

    fun start(width: Float, height: Float) {
        startPosition(width, height)

        nextPosition(width / 2, 0f)
        nextPosition(width / 2, height)

        nextPosition(width / 2, height / 2)

        nextPosition(0f, height / 2)
        nextPosition(width, height / 2)

        nextPosition(width / 2, height / 2)
        move()
    }
}