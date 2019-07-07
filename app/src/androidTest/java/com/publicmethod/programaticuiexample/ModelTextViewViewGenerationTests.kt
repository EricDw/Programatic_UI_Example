package com.publicmethod.programaticuiexample

import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ModelTextViewViewGenerationTests : BaseAndroidTests<TestActivity>(
    TestActivity::class.java
) {

    @Test
    fun textViewIsGeneratedWithCorrectId() {
        val expected = R.id.test_text_view
        activityTestRule.activity.run {
            createTextView {
                id = expected
            }
        }.also {
            val actual = it.id
            assertEquals(expected, actual)
        }
    }
}
