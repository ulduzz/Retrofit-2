package com.homework.network.api

import com.homework.entities.model.SearchResponse
import retrofit2.http.GET

interface CampaignService {
    @GET("campaigns")
    suspend fun getFlights()
}