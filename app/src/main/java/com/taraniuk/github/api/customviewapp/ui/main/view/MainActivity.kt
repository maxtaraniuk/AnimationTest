package com.taraniuk.github.api.customviewapp.ui.main.view

import android.content.res.Resources
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.taraniuk.github.api.customviewapp.databinding.ActivityMainBinding
import com.taraniuk.github.api.customviewapp.ui.main.viewModel.MainViewModel


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val viewModel = MainViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel.view = binding.romb
        viewModel.start(width(), height())
    }

    private fun width(): Float {
        return Resources.getSystem().displayMetrics.xdpi * 1.91f
    }

    private fun height(): Float {
        return Resources.getSystem().displayMetrics.ydpi * 2.65f
    }

}