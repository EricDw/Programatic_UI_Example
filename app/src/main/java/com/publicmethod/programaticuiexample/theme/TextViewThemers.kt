package com.publicmethod.programaticuiexample.theme

import android.graphics.Color
import android.widget.TextView
import com.publicmethod.programaticuiexample.models.Model

fun TextView.themeFor(viewState: Model) {
    setTextColor(
        if (viewState.isEven)
            Color.GREEN
        else
            Color.RED
    )
}