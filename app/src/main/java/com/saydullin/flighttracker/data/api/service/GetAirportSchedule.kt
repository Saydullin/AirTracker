package com.saydullin.flighttracker.data.api.service

import com.saydullin.flighttracker.data.model.airport.AirportScheduleResponse
import retrofit2.Response
import retrofit2.http.GET

interface GetAirportSchedule {

    @GET("schedules")
    suspend fun getAirportSchedule(): Response<AirportScheduleResponse>

}