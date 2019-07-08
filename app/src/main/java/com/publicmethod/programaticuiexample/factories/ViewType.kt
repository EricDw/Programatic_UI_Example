package com.publicmethod.programaticuiexample.factories

import com.publicmethod.programaticuiexample.models.Model

sealed class ViewType
sealed class Main: ViewType() {
    object Constraint: Main()
    object FAB : Main()
    data class ModelTextView(val model: Model? = null) : Main()
}