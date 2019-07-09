package com.publicmethod.viewfactories.factories

import android.content.Context
import android.view.View
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet


fun Context.createTextView(init: TextView.() -> Unit) =
    TextView(this).apply {
        id = View.generateViewId()
        layoutParams = ConstraintLayout.LayoutParams(
            ConstraintSet.WRAP_CONTENT,
            ConstraintSet.WRAP_CONTENT
        )
        init()
    }
