package com.google.samples.apps.nowinandroid.ui.lesson16.homework

import androidx.compose.ui.test.ExperimentalTestApi
import com.google.samples.apps.nowinandroid.ui.lesson15.ConfigureTest
import com.google.samples.apps.nowinandroid.ui.lesson16.homework.TopicsItem
import dagger.hilt.android.testing.HiltAndroidTest
import org.junit.Test

@HiltAndroidTest
class LazyListTest : ConfigureTest() {

    @OptIn(ExperimentalTestApi::class)
    @Test
    fun checkLazyListItems() {
        run {
            step("Проверка эементов в горизоонтальном списке") {
                LazyHomeScreen.topicList.childAt<TopicsItem>(0){
                    image.assertIsDisplayed()
                    title.assertIsDisplayed()
                    iconPlus.assertIsDisplayed()
                }
                LazyHomeScreen.topicList.childAt<TopicsItem>(1){
                    assertIsDisplayed()
                }
                LazyHomeScreen.topicList.childAt<TopicsItem>(2){
                    assertIsDisplayed()
                }
            }
            step("Клик по топику Compose") {
                LazyHomeScreen.topicList.childAt<TopicsItem>(2){
                    iconPlus.performClick()
                    checkedIcon.assertIsDisplayed()
                }
            }

        }
    }




}