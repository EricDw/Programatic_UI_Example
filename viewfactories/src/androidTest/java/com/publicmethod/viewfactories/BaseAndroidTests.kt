package com.publicmethod.viewfactories

import android.app.Activity
import androidx.test.rule.ActivityTestRule
import org.junit.Rule

open class BaseAndroidTests<A: Activity>(
    testActivityClass: Class<A>
) {
    @get:Rule
    val activityTestRule = ActivityTestRule(
        testActivityClass
    )
}