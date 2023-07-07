package com.example.flighttracker.data.model.airport

import com.example.flighttracker.data.model.RequestResponse

data class AirportScheduleResponse(
    val request: RequestResponse,
    val response: List<AirportResponse>,
    val terms: String,
)


