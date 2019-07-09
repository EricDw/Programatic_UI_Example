package com.publicmethod.programaticuiexample.factories

import android.content.Context
import android.view.View
import com.publicmethod.programaticuiexample.R
import com.publicmethod.programaticuiexample.theme.themeFor
import com.publicmethod.viewfactories.factories.createConstraintLayout
import com.publicmethod.viewfactories.factories.createFloatingActionButton
import com.publicmethod.viewfactories.factories.createTextView

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
                themeFor(this)
            }

        } as V

    }