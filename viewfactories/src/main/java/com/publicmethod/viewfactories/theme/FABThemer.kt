package com.publicmethod.viewfactories.theme

import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.updateMargins
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.publicmethod.viewfactories.dp

fun <V : FloatingActionButton> V.themeWithConstraintMargins(): V =
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