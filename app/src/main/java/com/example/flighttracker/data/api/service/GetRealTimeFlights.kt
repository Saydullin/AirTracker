package com.example.flighttracker.data.api.service

import com.example.flighttracker.data.model.flight.FlightResponse
import retrofit2.Response
import retrofit2.http.GET

interface GetRealTimeFlights {

    @GET("flights")
    suspend fun getFlights(): Response<FlightResponse>

}