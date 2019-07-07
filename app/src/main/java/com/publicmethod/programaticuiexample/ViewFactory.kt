package com.publicmethod.programaticuiexample

import android.content.Context
import android.view.View
import com.publicmethod.programaticuiexample.views.styleFor

inline fun <reified V : View> Context.createViewFor(viewType: ViewType): V =
    when (viewType) {

        Main.Constraint -> createConstraintLayout {
            id = R.id.constraint_layout_main
        } as V

        Main.FAB -> createFloatingActionButton {
            id = R.id.fab
            setImageDrawable(getDrawable(R.drawable.ic_add_white_24dp))
        } as V

        is Main.ModelTextView -> createTextView {
            id = R.id.text_view
            text =
                if (viewType.model?.isEven == true)
                    "Even!"
                else
                    "Odd!"

            viewType.model?.run {
                styleFor(this)
            }

        } as V

    }