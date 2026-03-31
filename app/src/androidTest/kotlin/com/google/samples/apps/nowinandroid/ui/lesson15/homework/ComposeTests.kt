package com.google.samples.apps.nowinandroid.ui.lesson15.homework

import com.google.samples.apps.nowinandroid.ui.lesson15.ComposePageObj
import com.google.samples.apps.nowinandroid.ui.lesson15.ConfigureTest
import dagger.hilt.android.testing.HiltAndroidTest
import org.junit.Test

@HiltAndroidTest
class ComposeTests : ConfigureTest(){

    @Test
    fun checkElementHomePageAndSearchPage() {
        run {
            step("Проверка елементов toolBar"){
                HomeScreen.titleToolBar.assertTextEquals("Now in Android")
                HomeScreen.iconOptionsToolBar.assertIsDisplayed()
                HomeScreen.iconSearchToolBar.assertIsDisplayed()
            }
            step("Проверка элементов HomePge"){
                HomeScreen.titleHomePage.assertTextContains("What", ignoreCase=true, substring = true)
                HomeScreen.subTitleHomePage.assertTextContains("Updates", ignoreCase=true, substring = true)
                HomeScreen.DoneButton.assertIsDisplayed()
                HomeScreen.DoneButtonText.assertTextEquals("Done")
            }
            step("Тап на иконку поиска"){
                HomeScreen.iconSearchToolBar.performClick()
            }
            step("Проверка элементов SearchPage") {
                SearchScreen.iconSearchScreen.assertIsDisplayed()
                SearchScreen.searchTextField.assertIsDisplayed()
                SearchScreen.recentSearchesText.assertTextEquals("Recent searches")
            }
        }
    }
}