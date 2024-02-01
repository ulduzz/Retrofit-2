package com.sirketismi.entities.model


import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class ReturnPrice(
    val max: Int?,
    val min: Int?
) : Parcelable