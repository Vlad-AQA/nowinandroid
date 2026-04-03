package com.google.samples.apps.nowinandroid.ui.lesson16.homework

import com.google.samples.apps.nowinandroid.ui.lesson16.TopicsItem
import com.google.samples.apps.nowinandroid.ui.lesson16.createLazyList
import io.github.kakaocup.compose.node.element.ComposeScreen

object LazyHomeScreen : ComposeScreen<LazyHomeScreen>() {

    val topicList = createLazyList(
        viewBuilderAction = {
            hasTestTag("topicSelectionTestTag")
        },
        itemTypeBuilder = {
            itemType(::TopicsItem)
        },
    )

    val newsList = createLazyList(
        viewBuilderAction = {
            hasTestTag("forYou:feed")
        },
        itemTypeBuilder = {
            itemType (::NewsItems)
        }
    )
}