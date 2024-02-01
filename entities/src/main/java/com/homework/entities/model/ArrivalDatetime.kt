package com.sirketismi.entities.model


import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class ArrivalDatetime(
    val date: String?,
    val time: String?,
    val timestamp: Int?
) : Parcelable