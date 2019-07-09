package com.publicmethod.viewfactories.theme

import androidx.core.view.marginBottom
import androidx.core.view.marginLeft
import androidx.core.view.marginRight
import androidx.core.view.marginTop
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.publicmethod.viewfactories.BaseAndroidTests
import com.publicmethod.viewfactories.TestActivity
import com.publicmethod.viewfactories.dp
import com.publicmethod.viewfactories.factories.createFloatingActionButton
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ConstraintThemeTests : BaseAndroidTests<TestActivity>(
    TestActivity::class.java
) {

    @Test
    fun fabMarginsSetTo16DP() {
        val expected = listOf(
            dp(16),
            dp(16),
            dp(16),
            dp(16)
        )
        activityTestRule.activity.run {
            createFloatingActionButton()
                .themeWithConstraintMargins()
        }.also {
            val actual = it.run {
                listOf(
                    marginTop,
                    marginBottom,
                    marginLeft,
                    marginRight
                )
            }
            assertEquals(expected, actual)
        }
    }

}
