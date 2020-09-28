package com.taraniuk.github.api.customviewapp.utils.views

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.View

class CustomRhombus @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

    private val paintTop = Paint()
    private val paintBottom = Paint()

    private val topPath = Path()
    private val bottomPath = Path()

    override fun onDraw(canvas: Canvas?) {
        canvas?.let {
            drawTopTriangle(canvas,paintTop,width.toFloat(),height.toFloat())
            drawBottomTriangle(canvas,paintBottom,width.toFloat(),height.toFloat())
        }
    }

    private fun drawTopTriangle(canvas: Canvas, paint: Paint, width: Float, height: Float) {
        topPath.moveTo(width/2,0F)
        topPath.lineTo(0F, height/2)
        topPath.lineTo(width, height/2)
        topPath.close()
        paint.color = Color.BLUE
        canvas.drawPath(topPath, paint)
    }

    private fun drawBottomTriangle(canvas: Canvas, paint: Paint, width: Float, height: Float) {
        bottomPath.moveTo(width/2,height)
        bottomPath.lineTo(0F, height/2)
        bottomPath.lineTo(width, height/2)
        bottomPath.close()
        paint.color = Color.RED
        canvas.drawPath(bottomPath, paint)
    }



}
