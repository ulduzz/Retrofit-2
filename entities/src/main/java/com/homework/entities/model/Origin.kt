package com.sirketismi.entities.model


import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class Origin(
    val airport_name: String?,
    val city_name: String?,
    val country_code: String?,
    val country_name: String?,
    val id: String?,
    val is_city: Boolean?,
    val label: String?,
    val slug: String?
) : Parcelable