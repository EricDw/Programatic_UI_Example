package com.publicmethod.programaticuiexample

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.publicmethod.programaticuiexample.factories.Main
import com.publicmethod.programaticuiexample.factories.createViewFor
import com.publicmethod.programaticuiexample.models.Model
import com.publicmethod.programaticuiexample.views.createMainContentView
import com.publicmethod.viewfactories.theme.constrainToCenterOfParent
import kotlin.properties.Delegates

class MainActivity : AppCompatActivity() {

    private lateinit var rootView: ConstraintLayout

    private var textView: TextView? = null

    private var model: Model by Delegates.observable(
        Model()
    ) { _, _, newModel ->
        mainRenderer(
            newModel
        )
    }

    private val modelTextViewRenderer: (Model) -> Unit = {
        rootView.run {

            textView?.let {
                removeView(it)
            }

            textView =
                createViewFor<TextView>(
                    Main.ModelTextView(it)
                ).apply {
                    addView(this)
                    constrainToCenterOfParent(this)
                }
        }
    }

    private val mainRenderer: (Model) -> Unit =
        modelTextViewRenderer

    val modelUpdater: () -> Unit = {
        model = model.copy(
            clickAmount = model.clickAmount.inc()
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

}

