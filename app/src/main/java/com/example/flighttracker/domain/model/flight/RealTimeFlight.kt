package com.example.flighttracker.domain.model.flight

import com.example.flighttracker.data.model.flight.FlightResponse

data class RealTimeFlight(
    val request: FlightRequest,
    val response: List<FlightResponse>,
    val terms: String,
)


