package com.abregujuancruz.util.model

import android.os.Parcelable
import androidx.annotation.Keep
import kotlinx.parcelize.Parcelize

@Keep
@Parcelize
data class Action(
    val type: String? = null,
    val path: String? = null
): Parcelable
