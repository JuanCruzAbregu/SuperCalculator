package com.abregujuancruz.supercalculator.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.abregujuancruz.supercalculator.R

@Immutable
data class CmTypography(
    val h1SemiBold: TextStyle,
    val h2SemiBold: TextStyle,
    val h2Medium: TextStyle,
    val h3SemiBold: TextStyle,
    val h3Medium: TextStyle,
    val h4SemiBold: TextStyle,
    val h4Medium: TextStyle,

    val body1Link: TextStyle,
    val body1Medium: TextStyle,
    val body2Link: TextStyle,
    val body2Medium: TextStyle,

    val display1: TextStyle,
    val display2: TextStyle,

    val userID: TextStyle,
    val overLine: TextStyle,
    val captionLink: TextStyle,
    val badges: TextStyle,
    val bottomNav: TextStyle,

    val materialTypography: Typography
) {
    val body1: TextStyle
        get() = materialTypography.bodyMedium

    val body2: TextStyle
        get() = materialTypography.bodySmall

    val button: TextStyle
        get() = materialTypography.labelMedium

    val caption: TextStyle
        get() = materialTypography.displayMedium
}

/**
 * Returns an object of type CmTypography with default values.
 */
@Suppress("LongMethod")
fun defaultCmTypography(colors: CmColors = defaultCmColors) = CmTypography(
    h1SemiBold = TextStyle(
        fontFamily = CmFontFamilies.Gibson,
        fontWeight = FontWeight.SemiBold,
        fontSize = 24.sp,
        color = colors.cmNeutral800,
        lineHeight = 28.sp
    ),
    h2SemiBold = TextStyle(
        fontFamily = CmFontFamilies.Gibson,
        fontWeight = FontWeight.SemiBold,
        fontSize = 20.sp,
        color = colors.cmNeutral800,
        lineHeight = 24.sp
    ),
    h2Medium = TextStyle(
        fontFamily = CmFontFamilies.Gibson,
        fontWeight = FontWeight.Medium,
        fontSize = 20.sp,
        color = colors.cmNeutral800,
        lineHeight = 24.sp
    ),
    h3SemiBold = TextStyle(
        fontFamily = CmFontFamilies.Gibson,
        fontWeight = FontWeight.SemiBold,
        fontSize = 18.sp,
        color = colors.cmNeutral800,
        lineHeight = 24.sp
    ),
    h3Medium = TextStyle(
        fontFamily = CmFontFamilies.Gibson,
        fontWeight = FontWeight.Medium,
        fontSize = 18.sp,
        color = colors.cmNeutral800,
        lineHeight = 24.sp
    ),
    h4SemiBold = TextStyle(
        fontFamily = CmFontFamilies.Gibson,
        fontWeight = FontWeight.SemiBold,
        fontSize = 16.sp,
        color = colors.cmNeutral800,
        lineHeight = 20.sp
    ),
    h4Medium = TextStyle(
        fontFamily = CmFontFamilies.Gibson,
        fontWeight = FontWeight.Medium,
        fontSize = 16.sp,
        color = colors.cmNeutral800,
        lineHeight = 20.sp
    ),
    body1Link = TextStyle(
        fontFamily = CmFontFamilies.Gibson,
        fontWeight = FontWeight.Medium,
        fontSize = 16.sp,
        color = colors.cmPrimary500,
        lineHeight = 20.sp
    ),
    body1Medium = TextStyle(
        fontFamily = CmFontFamilies.Gibson,
        fontWeight = FontWeight.Medium,
        fontSize = 16.sp,
        color = colors.cmNeutral800,
        lineHeight = 20.sp
    ),
    body2Link = TextStyle(
        fontFamily = CmFontFamilies.Gibson,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp,
        color = colors.cmPrimary500,
        lineHeight = 16.sp
    ),
    body2Medium = TextStyle(
        fontFamily = CmFontFamilies.Gibson,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp,
        color = colors.cmNeutral800,
        lineHeight = 16.sp
    ),
    display1 = TextStyle(
        fontFamily = CmFontFamilies.Gibson,
        fontWeight = FontWeight.SemiBold,
        fontSize = 40.sp,
        color = colors.cmNeutral800,
        lineHeight = 44.sp
    ),
    display2 = TextStyle(
        fontFamily = CmFontFamilies.Gibson,
        fontWeight = FontWeight.SemiBold,
        fontSize = 32.sp,
        color = colors.cmNeutral800,
        lineHeight = 36.sp
    ),
    userID = TextStyle(
        fontFamily = CmFontFamilies.Gibson,
        fontWeight = FontWeight.Normal,
        fontSize = 20.sp,
        color = colors.cmNeutral800,
        lineHeight = 24.sp
    ),
    overLine = TextStyle(
        fontFamily = CmFontFamilies.Gibson,
        fontWeight = FontWeight.Medium,
        fontSize = 16.sp,
        color = colors.cmNeutral600,
        lineHeight = 20.sp
    ),
    captionLink = TextStyle(
        fontFamily = CmFontFamilies.Gibson,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        color = colors.cmNeutral800,
        lineHeight = 16.sp
    ),
    badges = TextStyle(
        fontFamily = CmFontFamilies.Gibson,
        fontWeight = FontWeight.SemiBold,
        fontSize = 10.sp,
        color = colors.cmNeutral800,
        lineHeight = 12.sp
    ),
    bottomNav = TextStyle(
        fontFamily = CmFontFamilies.Gibson,
        fontWeight = FontWeight.SemiBold,
        fontSize = 9.sp,
        color = colors.cmPrimary500,
        lineHeight = 12.sp,
        letterSpacing = 0.3.sp
    ),
    materialTypography = Typography(
        bodyMedium = TextStyle(
            fontFamily = CmFontFamilies.Gibson,
            fontWeight = FontWeight.Normal,
            fontSize = 16.sp,
            color = colors.cmNeutral800,
            lineHeight = 20.sp
        ),
        labelMedium = TextStyle(
            fontFamily = CmFontFamilies.Gibson,
            fontWeight = FontWeight.Medium,
            fontSize = 16.sp,
            color = colors.cmPrimary500,
            lineHeight = 20.sp
        ),
        bodySmall = TextStyle(
            fontFamily = CmFontFamilies.Gibson,
            fontWeight = FontWeight.Normal,
            fontSize = 14.sp,
            color = colors.cmNeutral800,
            lineHeight = 16.sp
        ),
        displayMedium = TextStyle(
            fontFamily = CmFontFamilies.Gibson,
            fontWeight = FontWeight.Normal,
            fontSize = 12.sp,
            color = colors.cmNeutral800,
            lineHeight = 16.sp
        )
    )
)

@Immutable
private object CmFontFamilies {
    @Stable
    val Gibson = FontFamily(
        Font(resId = R.font.gibson_semi_bold, weight = FontWeight.SemiBold), // Weight = 600
        Font(resId = R.font.gibson_medium, weight = FontWeight.Medium), // Weight = 500
        Font(resId = R.font.gibson_regular, weight = FontWeight.Normal) // Weight = 400
    )
}
