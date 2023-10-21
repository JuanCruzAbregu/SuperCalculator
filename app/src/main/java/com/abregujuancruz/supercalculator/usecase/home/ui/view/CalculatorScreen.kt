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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.abregujuancruz.supercalculator.usecase.base.view.BaseScreenWithFooter
import com.abregujuancruz.supercalculator.usecase.home.ui.model.ActionButton
import com.abregujuancruz.supercalculator.usecase.home.ui.model.HomeData
import com.abregujuancruz.supercalculator.usecase.home.ui.view.components.CmButton
import com.abregujuancruz.supercalculator.usecase.home.ui.view.components.InputCard
import com.abregujuancruz.supercalculator.utils.Actionable

@Composable
fun CalculatorScreen(
    screenData: HomeData?,
) {
    val buttonLambdaPairs = screenData?.buttons?.map { Pair(it) {} }

    BaseScreenWithFooter(
        title = "Super Calculator",
        footer = {
            BuildButtons(
                buttons = buttonLambdaPairs,
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
    buttons: List<Pair<ActionButton, Actionable>>?,
) {
    buttons?.forEach { buttonPair ->
        val actionButton = buttonPair.first
        val onClick = buttonPair.second
        CmButton(
            onClick = { onClick() },
            type = actionButton.type ?: "primary",
            text = actionButton.title ?: ""
        )
        Spacer(modifier = Modifier.height(8.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun CalculatorScreenPreview() {
    val screenData = HomeData(
        listOf(
            ActionButton(type = "primary", title = "Calcular"),
            ActionButton(type = "secondary", title = "Borrar")
        )
    )
    CalculatorScreen(screenData = screenData)
}
