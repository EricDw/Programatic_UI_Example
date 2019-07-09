package com.publicmethod.viewfactories.factories

import android.content.Context
import android.view.View
import android.view.ViewGroup
import com.google.android.material.floatingactionbutton.FloatingActionButton

fun Context.createFloatingActionButton(
    init: FloatingActionButton.() -> Unit = {}
) = FloatingActionButton(this).apply {
    id = View.generateViewId()
    layoutParams = ViewGroup.MarginLayoutParams(
        ViewGroup.LayoutParams.WRAP_CONTENT,
        ViewGroup.LayoutParams.WRAP_CONTENT
    )
    init()
}
