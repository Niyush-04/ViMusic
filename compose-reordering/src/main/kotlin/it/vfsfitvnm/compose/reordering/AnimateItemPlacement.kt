package it.vfsfitvnm.compose.reordering

import androidx.compose.foundation.lazy.LazyItemScope
import androidx.compose.ui.Modifier

fun LazyItemScope.animateItemPlacement(
    modifier: Modifier,
    reorderingState: ReorderingState
): Modifier = if (reorderingState.draggingIndex == -1) {
    modifier.animateItem()
} else {
    modifier
}
