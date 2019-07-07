package com.publicmethod.programaticuiexample.views

import android.graphics.Color
import android.widget.TextView

fun TextView.styleFor(viewState: Model) {
    setTextColor(
        if (viewState.isEven)
            Color.GREEN
        else
            Color.RED
    )
}