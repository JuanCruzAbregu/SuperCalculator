package com.abregujuancruz.supercalculator.usecase.base.view

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.abregujuancruz.supercalculator.theme.CmTheme


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomToolbar(
    title: String,
    modifier: Modifier = Modifier,
    navigationIcon: @Composable (() -> Unit)? = null,
    actions: @Composable (RowScope.() -> Unit) = {},
) {
    TopAppBar(
        title = {
            Text(
                text = title,
                style = CmTheme.typography.h2Medium
            )
        },
        modifier = modifier,
        navigationIcon = navigationIcon ?: {},
        actions = actions
    )
}