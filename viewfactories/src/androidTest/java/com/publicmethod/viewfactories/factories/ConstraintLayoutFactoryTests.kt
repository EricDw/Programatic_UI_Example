package com.publicmethod.viewfactories.factories

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.publicmethod.viewfactories.BaseAndroidTests
import com.publicmethod.viewfactories.R
import com.publicmethod.viewfactories.TestActivity
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class ConstraintLayoutFactoryTests : BaseAndroidTests<TestActivity>(
    TestActivity::class.java
) {

    @Test
    fun constraintLayoutIsGeneratedWithCorrectId() {
        val expected = R.id.test_constraint_layout
        activityTestRule.activity.run {
            createConstraintLayout {
                id = expected
            }
        }.also {
            val actual = it.id
            Assert.assertEquals(expected, actual)
        }
    }

}
