@file:Suppress("FunctionNaming", "TopLevelPropertyNaming")

package com.abregujuancruz.supercalculator.usecase.base.view

import androidx.compose.foundation.Image
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.abregujuancruz.supercalculator.R

@Composable
fun BackButton(
    onBack: () -> Unit,
    contentDescription: String? = null
) {
    IconButton(
        onClick = { onBack() },
    ) {
        Image(
            painterResource(id = R.drawable.ic_arrow_back),
            contentDescription = contentDescription
                ?: stringResource(id = R.string.back_btn_content_description)
        )
    }
}
