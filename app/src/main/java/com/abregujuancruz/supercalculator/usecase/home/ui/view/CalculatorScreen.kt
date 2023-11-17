package com.abregujuancruz.supercalculator.usecase.home.ui.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.abregujuancruz.supercalculator.theme.CmTheme
import com.abregujuancruz.supercalculator.usecase.base.view.BaseScreenWithFooter
import com.abregujuancruz.supercalculator.usecase.home.ui.model.ActionButton
import com.abregujuancruz.supercalculator.usecase.home.ui.model.HomeData
import com.abregujuancruz.supercalculator.usecase.home.ui.view.components.CmButton
import com.abregujuancruz.supercalculator.usecase.home.ui.view.components.InputCard
import com.abregujuancruz.supercalculator.usecase.home.ui.viewmodel.HomeViewModel

@Composable
fun CalculatorScreen(
    viewModel: HomeViewModel
) {

    val homeData: HomeData by viewModel.homeData.observeAsState(HomeData())
    val result: String by viewModel.result.observeAsState("")
    val function: String by viewModel.function.observeAsState("")
    val firstProductPrice: String by viewModel.firstProductPrice.observeAsState("")
    val firstProductQuantity: String by viewModel.firstProductQuantity.observeAsState("")
    val secondProductPrice: String by viewModel.secondProductPrice.observeAsState("")
    val secondProductQuantity: String by viewModel.secondProductQuantity.observeAsState("")
    val enableCalculate: Boolean by viewModel.enableCalculate.observeAsState(false)

    CmTheme {
        BaseScreenWithFooter(
            title = "Super Calculator",
            footer = {
                BuildButtons(
                    buttons = homeData.buttons,
                    enabled = enableCalculate,
                    viewModel = viewModel
                )
            }
        ) {
            BuildInputs(
                firstProductPrice = firstProductPrice,
                firstProductQuantity = firstProductQuantity,
                secondProductPrice = secondProductPrice,
                secondProductQuantity = secondProductQuantity,
                viewModel = viewModel,
                result = result,
                function = function
            )

        }
    }
}

@Composable
private fun BuildInputs(
    firstProductPrice: String,
    firstProductQuantity: String,
    secondProductPrice: String,
    secondProductQuantity: String,
    result: String,
    viewModel: HomeViewModel,
    function: String
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Transparent)
            .padding(16.dp)
    ) {

        Text(
            modifier = Modifier.fillMaxWidth(),
            text = "Primer producto",
            textAlign = TextAlign.Start
        )

        InputCard(
            hintText = "Precio",
            textValue = firstProductPrice,
            onTextFieldChanged = {
                viewModel.onTextFieldChange(
                    firstProductPrice = it,
                    firstQuantity = firstProductQuantity,
                    secondProductPrice = secondProductPrice,
                    secondQuantity = secondProductQuantity
                )
            },
            keyboardType = KeyboardType.Decimal
        )
        InputCard(
            hintText = "Cantidad en unidades",
            textValue = firstProductQuantity,
            onTextFieldChanged = {
                viewModel.onTextFieldChange(
                    firstProductPrice = firstProductPrice,
                    firstQuantity = it,
                    secondProductPrice = secondProductPrice,
                    secondQuantity = secondProductQuantity
                )
            },
            keyboardType = KeyboardType.Number
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            modifier = Modifier.fillMaxWidth(),
            text = "Segundo producto",
            textAlign = TextAlign.Start
        )

        InputCard(
            hintText = "Precio",
            textValue = secondProductPrice,
            onTextFieldChanged = {
                viewModel.onTextFieldChange(
                    firstProductPrice = firstProductPrice,
                    firstQuantity = firstProductQuantity,
                    secondProductPrice = it,
                    secondQuantity = secondProductQuantity
                )
            },
            keyboardType = KeyboardType.Decimal
        )
        InputCard(
            hintText = "Cantidad en unidades",
            isDone = true,
            textValue = secondProductQuantity,
            onTextFieldChanged = {
                viewModel.onTextFieldChange(
                    firstProductPrice = firstProductPrice,
                    firstQuantity = firstProductQuantity,
                    secondProductPrice = secondProductPrice,
                    secondQuantity = it
                )
            },
            keyboardType = KeyboardType.Number
        )
        Spacer(modifier = Modifier.height(48.dp))
        Text(
            text = result,
            textAlign = TextAlign.Center,
            fontSize = 24.sp
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = function,
            textAlign = TextAlign.Center,
            fontSize = 18.sp
        )

    }
}

@Composable
private fun BuildButtons(
    buttons: ArrayList<ActionButton>?,
    enabled: Boolean,
    viewModel: HomeViewModel
) {
    buttons?.forEach {
        CmButton(
            onClick = { viewModel.setOnClickByType(it) },
            type = it.type ?: "primary",
            text = it.title ?: "",
            enabled = enabled
        )
        Spacer(modifier = Modifier.height(8.dp))
    }
}
