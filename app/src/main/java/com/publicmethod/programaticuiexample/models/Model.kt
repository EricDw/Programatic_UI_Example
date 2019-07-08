package com.publicmethod.programaticuiexample.models

data class Model(
    val clickAmount: Int = 0
) {
    val isEven = clickAmount % 2 == 0
}
