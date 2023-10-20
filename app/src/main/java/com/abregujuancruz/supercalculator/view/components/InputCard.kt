package com.abregujuancruz.supercalculator.view.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun InputCard(hintText: String) {
    var input by remember { mutableStateOf("") }
    OutlinedTextField(
        modifier = Modifier.fillMaxWidth(),
        value = input,
        onValueChange = { input = it },
        label = { Text(text = hintText) }
    )
}

@Preview(showBackground = true)
@Composable
fun InputCardPreview() {
    InputCard("Primer producto")
}
