package com.abregujuancruz.supercalculator.usecase.home.ui.view.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType

@Composable
fun InputCard(
    hintText: String,
    isDone: Boolean = false,
    textValue: String,
    onTextFieldChanged: (String) -> Unit,
    keyboardType: KeyboardType
) {

    val imeAction = if (isDone) ImeAction.Done else ImeAction.Next

    OutlinedTextField(
        modifier = Modifier.fillMaxWidth(),
        value = textValue,
        onValueChange = { onTextFieldChanged(it) },
        label = { Text(text = hintText) },
        keyboardOptions = KeyboardOptions(
            imeAction = imeAction,
            keyboardType = keyboardType
        )
    )
}
