package com.abregujuancruz.supercalculator.usecase.home.ui.view.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.abregujuancruz.supercalculator.theme.CmTheme
import com.abregujuancruz.supercalculator.utils.Actionable

private const val PRIMARY = "primary"
private const val SECONDARY = "secondary"

@Composable
fun CmButton(
    onClick: Actionable,
    type: String = PRIMARY,
    text: String = "",
    enabled: Boolean = false,
) {
    val modifier = Modifier
        .fillMaxWidth()
        .heightIn(48.dp)

    if (type.lowercase() == SECONDARY)
        SecondaryButton(
            modifier = modifier,
            onClick = onClick,
            text = text,
            enabled = enabled
        )
    else
        PrimaryButton(
            modifier = modifier,
            onClick = onClick,
            text = text,
            enabled = enabled
        )
}

@Composable
private fun PrimaryButton(
    modifier: Modifier,
    onClick: Actionable,
    text: String,
    enabled: Boolean
) {
    Button(
        modifier = modifier,
        onClick = onClick,
        shape = CmTheme.shapes.buttonRoundedCornerShape,
        enabled = enabled,
        colors = ButtonDefaults
            .buttonColors(containerColor = CmTheme.colors.cmSuccess600)
    ) {
        Text(
            text = text,
            style = CmTheme.typography.button.copy(
                color =
                if (enabled) CmTheme.colors.cmNeutral100 else CmTheme.colors.cmSuccess600
            )
        )
    }
}

@Composable
private fun SecondaryButton(
    modifier: Modifier,
    onClick: Actionable,
    text: String,
    enabled: Boolean
) {
    OutlinedButton(
        modifier = modifier,
        onClick = onClick,
        shape = CmTheme.shapes.buttonRoundedCornerShape,
        border = BorderStroke(
            width = 1.dp,
            color = if (enabled) CmTheme.colors.cmSuccess600 else CmTheme.colors.cmSuccess600
        ),
        colors = ButtonDefaults.outlinedButtonColors(containerColor = Color.Unspecified),
        enabled = enabled
    ) {
        Text(
            text = text,
            style = CmTheme.typography.button.copy(
                color =
                if (enabled) CmTheme.colors.cmSuccess600 else CmTheme.colors.cmNeutral600
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewEqButton() {
    Column(
        modifier = Modifier
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        CmButton(
            onClick = {},
            type = PRIMARY,
            text = "Primary Button"
        )
        Spacer(modifier = Modifier.height(16.dp))
        CmButton(
            onClick = {},
            type = SECONDARY,
            text = "Secondary Button"
        )
    }
}
