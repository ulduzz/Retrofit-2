package com.homework.data.repository

import com.homework.network.api.ApiService
import com.sirketismi.entities.model.SearchResponse
import javax.inject.Inject


interface FlightRepositoryInterface {
    suspend fun getFlights() : SearchResponse?
}

class FlightRepository @Inject constructor(private val apiService : ApiService) : FlightRepositoryInterface {
    override suspend fun getFlights(): SearchResponse? {
        return apiService.getFlights()
    }
}