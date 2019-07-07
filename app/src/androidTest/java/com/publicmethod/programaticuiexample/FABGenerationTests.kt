package com.publicmethod.programaticuiexample

import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class FABGenerationTests : BaseAndroidTests<TestActivity>(
    TestActivity::class.java
) {

    @Test
    fun fabIsGeneratedWithCorrectId() {
        val expected = R.id.test_fab
        activityTestRule.activity.run {
            createFloatingActionButton {
                id = expected
            }
        }.also {
            val actual = it.id
            assertEquals(expected, actual)
        }
    }
}
