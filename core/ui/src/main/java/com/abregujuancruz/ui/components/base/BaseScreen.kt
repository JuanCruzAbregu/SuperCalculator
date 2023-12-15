package com.abregujuancruz.ui.components.base

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.dp
import com.abregujuancruz.ui.components.buttons.BackButton
import com.abregujuancruz.ui.components.toolbars.CustomToolbar
import com.abregujuancruz.ui.theme.Actionable

/**
 * @param title text to use in your collapsable toolbar and title.
 * @param onBackPressed obligatory lambda to execute when the user touch the back button.
 * @param scrollState scroll state to use in the scrollable Column.
 * @param customToolbar top app bar of the screen. Consider using default toolbar.
 * @param content content of your screen. The lambda receives a "collapsed" value.
 * You can use it to know the collapsed state.
 */

@Composable
fun BaseScreenWithFooter(
    title: String? = null,
    onBackPressed: Actionable? = null,
    customToolbar: @Composable ((Boolean) -> Unit)? = null,
    scrollState: ScrollState = rememberScrollState(),
    footer: @Composable (() -> Unit)? = null,
    content: @Composable ((Boolean) -> Unit)? = null
) {

    val collapsed =
        scrollState.value >= with(LocalDensity.current) { 44.dp.toPx() }

    Scaffold(
        containerColor = Color.Unspecified,
        topBar = {
            customToolbar?.let { customToolbar(collapsed) } ?: run {
                CustomToolbar(
                    title = title ?: "",
                    navigationIcon = {
                        onBackPressed?.let {
                            BackButton(it)
                        }
                    })
            }
        }
    ) { padding ->
        Column(Modifier.padding(padding)) {
            Box(modifier = Modifier.weight(1f)) {
                Column(
                    modifier = Modifier
                        .padding(horizontal = 16.dp)
                        .verticalScroll(scrollState)
                ) {

                    content?.let { it(collapsed) }
                }
                if (collapsed) BottomShadow()
            }
            footer?.let {
                Column(
                    modifier = Modifier
                        .padding(horizontal = 16.dp)
                        .padding(bottom = 16.dp)
                ) { footer() }
            }
        }
    }
}

/** We use this decorative composable to represent a bottom shadow of toolbar */
@Composable
private fun BottomShadow() {
    Spacer(
        modifier = Modifier
            .fillMaxWidth()
            .height(8.dp)
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        Color.Black.copy(alpha = 0.1f),
                        Color.Transparent
                    )
                )
            )
    )
}
