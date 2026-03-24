/*
 * Copyright 2026 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.samples.apps.nowinandroid.ui.lesson15

import androidx.compose.ui.test.SemanticsNodeInteractionsProvider
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import com.google.samples.apps.nowinandroid.MainActivity
import com.kaspersky.components.composesupport.config.withComposeSupport
import com.kaspersky.kaspresso.kaspresso.Kaspresso
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import io.github.kakaocup.compose.node.builder.NodeMatcher
import io.github.kakaocup.compose.node.element.ComposeScreen
import io.github.kakaocup.compose.node.element.KNode
import io.github.kakaocup.compose.rule.KakaoComposeTestRule
import org.junit.Rule
import org.junit.Test

object ComposePageObj : ComposeScreen<ComposePageObj>() {

    val titleToolBar = child<KNode> {
        hasTestTag("titleTollBar")
    }
}

abstract class ConfigureTest : TestCase(Kaspresso.Builder.withComposeSupport()) {

    @get:Rule(order = 0)
    val hiltRule = HiltAndroidRule(this)

    @get:Rule(order = 1)
    val composeRule = createAndroidComposeRule<MainActivity>()

    @get:Rule(order = 2)
    val kakaoRule = KakaoComposeTestRule(composeRule, true)
}

@HiltAndroidTest
class TestCompose : ConfigureTest() {

    @Test
    fun checkTitleToolBar() {
        run {
            ComposePageObj {
                titleToolBar.assertTextEquals("Now in Android")
            }
        }
    }
}

//class ComposePageObj(
//    semanticsProvider: SemanticsNodeInteractionsProvider,
//) : ComposeScreen<ComposePageObj>(semanticsProvider) {
//
//    val titleToolBar = child<KNode> {
//        hasTestTag("titleToolBar")
//        useUnmergedTree = true
//    }
//}
//
//@HiltAndroidTest
//class TestCompose : TestCase(Kaspresso.Builder.withComposeSupport()) {
//
//    @get:Rule(order = 0)
//    val hiltRule = HiltAndroidRule(this)
//    @get:Rule(order = 1)
//    val composeRule = createAndroidComposeRule<MainActivity>()
//
//    private val composePage = ComposePageObj(composeRule)
//
//    @Test
//    fun checkTitleToolBar() {
//        run {
//            composePage{
//                titleToolBar.assertTextEquals("Now in Android")
//            }
//        }
//    }
//
//}
