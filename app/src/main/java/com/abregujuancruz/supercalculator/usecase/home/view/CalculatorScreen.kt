package com.abregujuancruz.supercalculator.usecase.home.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.abregujuancruz.supercalculator.usecase.base.BaseScreenWithFooter
import com.abregujuancruz.supercalculator.usecase.home.view.components.InputCard

@Composable
fun CalculatorScreen() {
    BaseScreenWithFooter(
        title = "Super Calculator",
        footer = {
            Button(
                modifier = Modifier.fillMaxWidth(),
                onClick = { /*TODO*/ }
            ) {
                Text(text = "Calcular")
            }
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
            InputCard(hintText = "Segundo producto", true)
        }
    }
}

@Preview
@Composable
fun CalculatorScreenPreview() {
    CalculatorScreen()
}
