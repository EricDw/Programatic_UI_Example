package com.publicmethod.programaticuiexample

import com.publicmethod.programaticuiexample.views.Model

sealed class ViewType
sealed class Main: ViewType() {
    object Constraint: Main()
    object FAB : Main()
    data class ModelTextView(val model: Model? = null) : Main()
}