package com.publicmethod.programaticuiexample.views

import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.publicmethod.programaticuiexample.*

fun MainActivity.createMainContentView(model: Model): Pair<TextView, ConstraintLayout> {
    val constraintLayout = createViewFor<ConstraintLayout>(Main.Constraint).apply {
        createViewFor<FloatingActionButton>(Main.FAB).apply {
            setOnClickListener {
                updateModel()
            }

        }.styleWithConstraintMargins().apply {
            addView(this)
            constrainFAB(this)
        }
    }

    val textView = createViewFor<TextView>(Main.ModelTextView(model)).apply {
        constraintLayout.addView(this)
        constraintLayout.constrainToCenter(this)
    }
    return Pair(textView, constraintLayout)
}
