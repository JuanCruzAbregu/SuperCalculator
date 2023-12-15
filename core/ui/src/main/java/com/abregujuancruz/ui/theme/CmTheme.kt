package com.abregujuancruz.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable


object CmTheme {

    val dimens: CmDimens
        get() = CmDimens

    val colors: CmColors
        get() = defaultCmColors

    val shapes: CmShapes
        get() = CmShapes

    val typography: CmTypography
        get() = defaultCmTypography()
}

@Composable
fun CmTheme(
    content: @Composable Actionable
) {
    MaterialTheme(
        colorScheme = CmTheme.colors.materialColors,
        typography = CmTheme.typography.materialTypography,
        shapes = CmShapes.materialShapes,
        content = content
    )
}
