package com.taraniuk.github.api.customviewapp.ui.main.view

import android.content.res.Resources
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.taraniuk.github.api.customviewapp.R
import com.taraniuk.github.api.customviewapp.utils.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private val animationUtils = AnimationUtils()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        animationUtils.view = romb
        animationUtils.start(width(), height())
    }

    private fun width(): Float {
        return Resources.getSystem().displayMetrics.xdpi * 1.91f
    }

    private fun height(): Float {
        return Resources.getSystem().displayMetrics.ydpi * 2.65f
    }

}