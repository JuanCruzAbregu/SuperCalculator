package com.abregujuancruz.supercalculator.usecase.home.ui.view.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun InputCard(hintText: String, isDone: Boolean = false) {

    var input by remember { mutableStateOf("") }
    val imeAction = if (isDone) ImeAction.Done else ImeAction.Next

    OutlinedTextField(
        modifier = Modifier.fillMaxWidth(),
        value = input,
        onValueChange = { input = it },
        label = { Text(text = hintText) },
        keyboardOptions = KeyboardOptions(
            imeAction = imeAction
        )
    )
}

@Preview(showBackground = true)
@Composable
fun InputCardPreview() {
    InputCard("Primer producto")
}
