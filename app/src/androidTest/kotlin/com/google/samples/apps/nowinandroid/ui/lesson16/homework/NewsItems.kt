package com.google.samples.apps.nowinandroid.ui.lesson16.homework

import androidx.compose.ui.semantics.SemanticsNode
import androidx.compose.ui.test.SemanticsNodeInteractionsProvider
import com.google.samples.apps.nowinandroid.core.designsystem.component.Tags
import io.github.kakaocup.compose.node.element.KNode
import io.github.kakaocup.compose.node.element.lazylist.KLazyListItemNode

class NewsItems(
    semanticNode: SemanticsNode,
    semanticsProvider: SemanticsNodeInteractionsProvider? = null,
) : KLazyListItemNode<NewsItems>(semanticNode, semanticsProvider) {

    val newsImage = child<KNode> {
        hasTestTag(Tags.NEWS_IMAGE)
    }

    val newsTitle = child<KNode> {
        hasTestTag(Tags.NEWS_TITLE)
    }

    val topicsRow = child<KNode> {
        hasTestTag(Tags.TOPIC_TAG_ROW)
    }

    val newsDate = child<KNode> {
        hasTestTag(Tags.NEWS_DATE)
    }

    val newsDescText = child<KNode> {
        hasTestTag(Tags.NEWS_DESC_TEXT)
    }


}