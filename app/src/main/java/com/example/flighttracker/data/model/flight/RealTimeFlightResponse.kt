package com.example.flighttracker.data.model.flight

import com.example.flighttracker.data.model.request.RequestResponse

data class RealTimeFlightResponse (
    val request: RequestResponse,
    val response: List<FlightResponse>,
    val terms: String,
) {
}