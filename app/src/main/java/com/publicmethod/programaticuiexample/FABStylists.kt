package com.publicmethod.programaticuiexample

import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.updateMargins
import com.google.android.material.floatingactionbutton.FloatingActionButton

fun <V : FloatingActionButton> V.styleWithConstraintMargins(): V =
    apply {
        layoutParams = ConstraintLayout.LayoutParams(
            layoutParams
        ).apply {
            updateMargins(
                dp(16),
                dp(16),
                dp(16),
                dp(16)
            )
            requestLayout()
        }
    }