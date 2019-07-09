package com.publicmethod.viewfactories.theme

import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import com.google.android.material.floatingactionbutton.FloatingActionButton

fun ConstraintLayout.constrainFAB(fab: FloatingActionButton) =
    ConstraintSet().apply {
        clone(this@constrainFAB)
        connect(fab.id, ConstraintSet.RIGHT, ConstraintSet.PARENT_ID, ConstraintSet.RIGHT)
        connect(fab.id, ConstraintSet.BOTTOM, ConstraintSet.PARENT_ID, ConstraintSet.BOTTOM)
    }.applyTo(this@constrainFAB)

fun ConstraintLayout.constrainToCenterOfParent(view: View) =
    ConstraintSet().apply {
        clone(this@constrainToCenterOfParent)
        connect(view.id, ConstraintSet.TOP, ConstraintSet.PARENT_ID, ConstraintSet.TOP)
        connect(view.id, ConstraintSet.RIGHT, ConstraintSet.PARENT_ID, ConstraintSet.RIGHT)
        connect(view.id, ConstraintSet.BOTTOM, ConstraintSet.PARENT_ID, ConstraintSet.BOTTOM)
        connect(view.id, ConstraintSet.LEFT, ConstraintSet.PARENT_ID, ConstraintSet.LEFT)
    }.applyTo(this@constrainToCenterOfParent)
