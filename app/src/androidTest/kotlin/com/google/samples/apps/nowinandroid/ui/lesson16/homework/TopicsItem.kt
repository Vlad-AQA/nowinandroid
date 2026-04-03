package com.google.samples.apps.nowinandroid.ui.lesson16.homework

import androidx.compose.ui.semantics.SemanticsNode
import androidx.compose.ui.test.SemanticsNodeInteractionsProvider
import com.google.samples.apps.nowinandroid.core.designsystem.component.Tags
import io.github.kakaocup.compose.node.element.KNode
import io.github.kakaocup.compose.node.element.lazylist.KLazyListItemNode

class TopicsItem(
    semanticNode: SemanticsNode,
    semanticsProvider: SemanticsNodeInteractionsProvider? = null
) : KLazyListItemNode<TopicsItem>(semanticNode, semanticsProvider){

    val image = child<KNode> {
        hasTestTag(Tags.IMAGE)
    }
    val title = child<KNode> {
        hasTestTag(Tags.TITLE)
    }
    val iconPlus = child<KNode> {
        hasTestTag(Tags.ICON_PLUS)
    }
    val checkedIcon = child<KNode> {
        hasTestTag(Tags.CHECKED_ICON)
    }
}