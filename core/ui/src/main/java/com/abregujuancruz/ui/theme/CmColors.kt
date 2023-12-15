package com.abregujuancruz.ui.theme

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Color


@Stable
data class CmColors(
    val cmPrimary200: Color,
    val cmPrimary300: Color,
    val cmPrimary400: Color,
    val cmPrimary500: Color,
    val cmPrimary600: Color,
    val cmPrimary700: Color,
    val cmPrimary800: Color,

    val cmSecondary200: Color,
    val cmSecondary300: Color,
    val cmSecondary400: Color,
    val cmSecondary500: Color,
    val cmSecondary600: Color,
    val cmSecondary700: Color,
    val cmSecondary800: Color,

    val cmSuccess200: Color,
    val cmSuccess300: Color,
    val cmSuccess400: Color,
    val cmSuccess500: Color,
    val cmSuccess600: Color,
    val cmSuccess700: Color,
    val cmSuccess800: Color,

    val cmNeutral100: Color,
    val cmNeutral200: Color,
    val cmNeutral300: Color,
    val cmNeutral400: Color,
    val cmNeutral500: Color,
    val cmNeutral600: Color,
    val cmNeutral700: Color,
    val cmNeutral800: Color,
    val cmNeutral900: Color,

    val cmInfo200: Color,
    val cmInfo300: Color,
    val cmInfo400: Color,
    val cmInfo500: Color,
    val cmInfo600: Color,
    val cmInfo700: Color,
    val cmInfo800: Color,

    val cmWarning200: Color,
    val cmWarning300: Color,
    val cmWarning400: Color,
    val cmWarning500: Color,
    val cmWarning600: Color,
    val cmWarning700: Color,
    val cmWarning800: Color,

    val cmError200: Color,
    val cmError300: Color,
    val cmError400: Color,
    val cmError500: Color,
    val cmError600: Color,
    val cmError700: Color,
    val cmError800: Color,

    val materialColors: ColorScheme
)

val defaultCmColors = CmColors(
    cmPrimary200 = CustomColors.UI_VIOLET_200,
    cmPrimary300 = CustomColors.UI_VIOLET_300,
    cmPrimary400 = CustomColors.UI_VIOLET_400,
    cmPrimary500 = CustomColors.UI_VIOLET_500,
    cmPrimary600 = CustomColors.UI_VIOLET_600,
    cmPrimary700 = CustomColors.UI_VIOLET_700,
    cmPrimary800 = CustomColors.UI_VIOLET_800,

    cmSecondary200 = CustomColors.UI_ORANGE_200,
    cmSecondary300 = CustomColors.UI_ORANGE_300,
    cmSecondary400 = CustomColors.UI_ORANGE_400,
    cmSecondary500 = CustomColors.UI_ORANGE_500,
    cmSecondary600 = CustomColors.UI_ORANGE_600,
    cmSecondary700 = CustomColors.UI_ORANGE_700,
    cmSecondary800 = CustomColors.UI_ORANGE_800,

    cmSuccess200 = CustomColors.UI_GREEN_200,
    cmSuccess300 = CustomColors.UI_GREEN_300,
    cmSuccess400 = CustomColors.UI_GREEN_400,
    cmSuccess500 = CustomColors.UI_GREEN_500,
    cmSuccess600 = CustomColors.UI_GREEN_600,
    cmSuccess700 = CustomColors.UI_GREEN_700,
    cmSuccess800 = CustomColors.UI_GREEN_800,

    cmNeutral100 = CustomColors.UI_WHITE,
    cmNeutral200 = CustomColors.UI_GREY_200,
    cmNeutral300 = CustomColors.UI_GREY_300,
    cmNeutral400 = CustomColors.UI_GREY_400,
    cmNeutral500 = CustomColors.UI_GREY_500,
    cmNeutral600 = CustomColors.UI_GREY_600,
    cmNeutral700 = CustomColors.UI_GREY_700,
    cmNeutral800 = CustomColors.UI_GREY_800,
    cmNeutral900 = CustomColors.UI_BLACK,

    cmInfo200 = CustomColors.UI_BLUE_200,
    cmInfo300 = CustomColors.UI_BLUE_300,
    cmInfo400 = CustomColors.UI_BLUE_400,
    cmInfo500 = CustomColors.UI_BLUE_500,
    cmInfo600 = CustomColors.UI_BLUE_600,
    cmInfo700 = CustomColors.UI_BLUE_700,
    cmInfo800 = CustomColors.UI_BLUE_800,

    cmWarning200 = CustomColors.UI_YELLOW_200,
    cmWarning300 = CustomColors.UI_YELLOW_300,
    cmWarning400 = CustomColors.UI_YELLOW_400,
    cmWarning500 = CustomColors.UI_YELLOW_500,
    cmWarning600 = CustomColors.UI_YELLOW_600,
    cmWarning700 = CustomColors.UI_YELLOW_700,
    cmWarning800 = CustomColors.UI_YELLOW_800,

    cmError200 = CustomColors.UI_RED_200,
    cmError300 = CustomColors.UI_RED_300,
    cmError400 = CustomColors.UI_RED_400,
    cmError500 = CustomColors.UI_RED_500,
    cmError600 = CustomColors.UI_RED_600,
    cmError700 = CustomColors.UI_RED_700,
    cmError800 = CustomColors.UI_RED_800,
    materialColors = lightColorScheme(
        primary = CustomColors.UI_VIOLET_500,
        secondary = CustomColors.UI_ORANGE_500,
        background = CustomColors.UI_VIOLET_500,
        surface = CustomColors.UI_WHITE,
        onPrimary = CustomColors.UI_WHITE,
        onSecondary = CustomColors.UI_WHITE,
        onBackground = CustomColors.UI_GREY_800,
        onSurface = CustomColors.UI_GREY_800,
        error = CustomColors.UI_RED_600,
        onError = CustomColors.UI_WHITE
    )
)

private object CustomColors {
    val UI_WHITE = Color(0xFFFFFFFF)
    val UI_GREY_200 = Color(0xFFFAFAFA)
    val UI_GREY_300 = Color(0xFFE8E8E8)
    val UI_GREY_400 = Color(0xFFD1D1D1)
    val UI_GREY_500 = Color(0xFFB2B2B2)
    val UI_GREY_600 = Color(0xFF767676)
    val UI_GREY_700 = Color(0xFF5B5B5B)
    val UI_GREY_800 = Color(0xFF333333)
    val UI_BLACK = Color(0xFF000000)

    val UI_VIOLET_200 = Color(0xFFF3EEF6)
    val UI_VIOLET_300 = Color(0xFFB999CB)
    val UI_VIOLET_400 = Color(0xFF844DA5)
    val UI_VIOLET_500 = Color(0xFF50007F)
    val UI_VIOLET_600 = Color(0xFF44006C)
    val UI_VIOLET_700 = Color(0xFF3A005C)
    val UI_VIOLET_800 = Color(0xFF30004C)

    val UI_YELLOW_200 = Color(0xFFFCF0CE)
    val UI_YELLOW_300 = Color(0xFFFFE4AB)
    val UI_YELLOW_400 = Color(0xFFFFD987)
    val UI_YELLOW_500 = Color(0xFFFFB30F)
    val UI_YELLOW_600 = Color(0xFF996B09)
    val UI_YELLOW_700 = Color(0xFF735006)
    val UI_YELLOW_800 = Color(0xFF5A3F05)

    val UI_ORANGE_200 = Color(0xFFFEE4D9)
    val UI_ORANGE_300 = Color(0xFFFEC1A6)
    val UI_ORANGE_400 = Color(0xFFFE9E73)
    val UI_ORANGE_500 = Color(0xFFFE5000)
    val UI_ORANGE_600 = Color(0xFFCB4000)
    val UI_ORANGE_700 = Color(0xFF983000)
    val UI_ORANGE_800 = Color(0xFF7E2700)

    val UI_RED_200 = Color(0xFFFBE9E9)
    val UI_RED_300 = Color(0xFFF4BBBB)
    val UI_RED_400 = Color(0xFFED8F8F)
    val UI_RED_500 = Color(0xFFDB1F1F)
    val UI_RED_600 = Color(0xFFBA1A1A)
    val UI_RED_700 = Color(0xFF991515)
    val UI_RED_800 = Color(0xFF791111)

    val UI_GREEN_200 = Color(0xFFE4F3E7)
    val UI_GREEN_300 = Color(0xFFC2E5C9)
    val UI_GREEN_400 = Color(0xFF86CC95)
    val UI_GREEN_500 = Color(0xFF24A33F)
    val UI_GREEN_600 = Color(0xFF19722C)
    val UI_GREEN_700 = Color(0xFF11511F)
    val UI_GREEN_800 = Color(0xFF0E4119)

    val UI_BLUE_200 = Color(0xFFE6EEFA)
    val UI_BLUE_300 = Color(0xFFC3D7F3)
    val UI_BLUE_400 = Color(0xFF7BA7E5)
    val UI_BLUE_500 = Color(0xFF1160D0)
    val UI_BLUE_600 = Color(0xFF0D4CA6)
    val UI_BLUE_700 = Color(0xFF0A397C)
    val UI_BLUE_800 = Color(0xFF083068)
}
