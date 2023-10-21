package com.abregujuancruz.supercalculator.usecase.home.ui.model

import android.os.Parcelable
import androidx.annotation.Keep
import kotlinx.parcelize.Parcelize

@Keep
@Parcelize
data class HomeData(
    val buttons: ArrayList<ActionButton>? = null
) : Parcelable