package com.abregujuancruz.supercalculator.usecase.home.ui.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.abregujuancruz.supercalculator.usecase.base.view.BaseScreenWithFooter
import com.abregujuancruz.supercalculator.usecase.home.ui.model.ActionButton
import com.abregujuancruz.supercalculator.usecase.home.ui.model.HomeData
import com.abregujuancruz.supercalculator.usecase.home.ui.view.components.CmButton
import com.abregujuancruz.supercalculator.usecase.home.ui.view.components.InputCard

@Composable
fun CalculatorScreen(
    homeData: HomeData
) {
    BaseScreenWithFooter(
        title = "Super Calculator",
        footer = {
            BuildButtons(
                buttons = homeData.buttons,
            )
        }
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
                .padding(16.dp)
        ) {
            InputCard(hintText = "Primer producto")
            InputCard(hintText = "Segundo producto", isDone = true)
        }
    }
}

@Composable
private fun BuildButtons(
    buttons: ArrayList<ActionButton>?
) {
    buttons?.forEach {
        CmButton(
            onClick = { },
            type = it.type ?: "primary",
            text = it.title ?: ""
        )
        Spacer(modifier = Modifier.height(8.dp))
    }
}
