package com.publicmethod.programaticuiexample

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTests : BaseAndroidTests<MainActivity>(
    MainActivity::class.java
) {

    @Test
    fun rootViewWithCorrectIdIsDisplayed() {
        onView(withId(R.id.constraint_layout_main)).check(matches(isDisplayed()))
    }

    @Test
    fun fabWithCorrectIdIsDisplayed() {
        fab().check(matches(isDisplayed()))
    }

    @Test
    fun initialTextViewWithCorrectIdIsDisplayed() {
        onView(withId(R.id.text_view)).check(matches(isDisplayed()))
    }

    @Test
    fun initialTextViewWithCorrectTextIsDisplayed() {
        onView(withText("Even!")).check(matches(isDisplayed()))
    }

    @Test
    fun clickingFabTwiceChangesTextToEven() {
        fab().run {
            perform(click())
            perform(click())
        }
        onView(withText("Even!")).check(matches(isDisplayed()))
    }

    private fun fab() = onView(withId(R.id.fab))

}
