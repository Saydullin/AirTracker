package com.saydullin.flighttracker.data.model.flight

import com.saydullin.flighttracker.data.model.request.RequestDataResponse

data class MainFlightResponse(
    val request: RequestDataResponse,
    val response: List<FlightResponse>,
    val terms: String,
)