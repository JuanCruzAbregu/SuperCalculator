package com.abregujuancruz.supercalculator.usecase.home.ui.model

import android.os.Parcelable
import androidx.annotation.Keep
import com.abregujuancruz.supercalculator.core.model.Action
import kotlinx.parcelize.Parcelize

@Keep
@Parcelize
data class ActionButton(
    val type: String? = null,
    val title: String? = null,
    val enabled: Boolean? = true,
    val actions: ArrayList<Action>? = null
) : Parcelable {

    fun isPrimaryButton(): Boolean = (type == "primary")

}