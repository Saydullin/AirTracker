package com.example.flighttracker.data.model

data class RealTimeFlightResponse (
    val request: FlightRequestResponse,
    val response: List<FlightResponse>,
    val terms: String,
) {
}