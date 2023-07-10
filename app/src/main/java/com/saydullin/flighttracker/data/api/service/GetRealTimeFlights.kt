package com.saydullin.flighttracker.data.api.service

import com.saydullin.flighttracker.data.model.liveFlight.LiveFlightResponse
import retrofit2.Response
import retrofit2.http.GET

interface GetRealTimeFlights {

    @GET("flights")
    suspend fun getFlights(): Response<LiveFlightResponse>

}