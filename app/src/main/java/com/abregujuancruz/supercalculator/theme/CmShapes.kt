package com.abregujuancruz.supercalculator.theme

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.runtime.Immutable
import androidx.compose.ui.unit.dp

@Immutable
object CmShapes {

    val buttonRoundedCornerShape: CornerBasedShape = RoundedCornerShape(16.dp)
    val materialShapes: Shapes = Shapes()

    val small: CornerBasedShape
        get() = materialShapes.small

    val medium: CornerBasedShape
        get() = materialShapes.medium

    val large: CornerBasedShape
        get() = materialShapes.large
}