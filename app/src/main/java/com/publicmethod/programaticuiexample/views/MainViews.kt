package com.publicmethod.programaticuiexample.views

import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.publicmethod.programaticuiexample.MainActivity
import com.publicmethod.programaticuiexample.factories.Main
import com.publicmethod.programaticuiexample.factories.createViewFor
import com.publicmethod.programaticuiexample.models.Model
import com.publicmethod.viewfactories.theme.constrainFAB
import com.publicmethod.viewfactories.theme.constrainToCenterOfParent
import com.publicmethod.viewfactories.theme.themeWithConstraintMargins

fun MainActivity.createMainContentView(model: Model): Pair<TextView, ConstraintLayout> {
    val constraintLayout = createViewFor<ConstraintLayout>(Main.Constraint).apply {
        createViewFor<FloatingActionButton>(Main.FAB).apply {
            setOnClickListener {
                modelUpdater()
            }

        }.themeWithConstraintMargins().apply {
            addView(this)
            constrainFAB(this)
        }
    }

    val textView = createViewFor<TextView>(Main.ModelTextView(model)).apply {
        constraintLayout.addView(this)
        constraintLayout.constrainToCenterOfParent(this)
    }
    return Pair(textView, constraintLayout)
}
