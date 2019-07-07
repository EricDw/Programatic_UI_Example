package com.publicmethod.programaticuiexample

import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.publicmethod.programaticuiexample.views.Model
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ViewFactoryTests : BaseAndroidTests<TestActivity>(
    TestActivity::class.java
) {

    @Test
    fun mainConstraintLayoutGeneratedWithCorrectId() {
        val expected = R.id.constraint_layout_main
        activityTestRule.activity.run {
            createViewFor<ConstraintLayout>(Main.Constraint)
        }.also {
            val actual = it.id
            assertEquals(expected, actual)
        }
    }

    @Test
    fun mainFABGeneratedWithCorrectId() {
        val expected = R.id.fab
        activityTestRule.activity.run {
            createViewFor<FloatingActionButton>(Main.FAB)
        }.also {
            val actual = it.id
            assertEquals(expected, actual)
        }
    }

    @Test
    fun mainTextViewGeneratedWithCorrectId() {
        val expected = R.id.text_view
        activityTestRule.activity.run {
            createViewFor<TextView>(Main.ModelTextView())
        }.also {
            val actual = it.id
            assertEquals(expected, actual)
        }
    }

    @Test
    fun givenEvenViewStateMainTextViewGeneratedWithEvenText() {
        val expected = "Even!"
        activityTestRule.activity.run {
            createViewFor<TextView>(
                Main.ModelTextView(
                    Model(2)
                )
            )
        }.also {
            val actual = it.text.toString()
            assertEquals(expected, actual)
        }
    }

    @Test
    fun givenOddViewStateMainTextViewGeneratedWithOddText() {
        val expected = "Odd!"
        activityTestRule.activity.run {
            createViewFor<TextView>(
                Main.ModelTextView(
                    Model(1)
                )
            )
        }.also {
            val actual = it.text.toString()
            assertEquals(expected, actual)
        }
    }

}
