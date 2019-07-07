package com.publicmethod.programaticuiexample

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.publicmethod.programaticuiexample.views.Model
import com.publicmethod.programaticuiexample.views.createMainContentView
import kotlin.properties.Delegates

class MainActivity : AppCompatActivity() {

    private lateinit var rootView: ConstraintLayout

    private var textView: TextView? = null

    private var model: Model by Delegates.observable(Model()) { _, _, newModel ->
        render(
             newModel
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) =
        super.onCreate(savedInstanceState).also {
            createMainContentView(Model()).run {
                rootView = second
                textView = first
            }
            setContentView(rootView)
        }

    fun updateModel() {
        model = model.copy(
            clickAmount = model.clickAmount.inc()
        )
    }

    private fun render(viewState: Model) =
        rootView.run {

            textView?.let {
                removeView(it)
            }

            textView =
                createViewFor(Main.ModelTextView(viewState))

            textView?.run {
                addView(this)
                constrainToCenter(this)
            }

        }
}

