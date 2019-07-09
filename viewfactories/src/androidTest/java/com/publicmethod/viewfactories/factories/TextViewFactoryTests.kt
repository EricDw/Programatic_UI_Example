package com.publicmethod.viewfactories.factories

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.publicmethod.viewfactories.TestActivity
import com.publicmethod.viewfactories.BaseAndroidTests
import com.publicmethod.viewfactories.R
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class TextViewFactoryTests : BaseAndroidTests<TestActivity>(
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
