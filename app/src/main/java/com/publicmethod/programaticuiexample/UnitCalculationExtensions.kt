package com.publicmethod.programaticuiexample

import android.content.res.Resources

fun dpf(dp: Float): Float =
    dp * Resources.getSystem().displayMetrics.density


fun dp(dp: Int): Int =
    dpf(dp.toFloat()).toInt()
