package com.saydullin.flighttracker.data.model.airport

import com.saydullin.flighttracker.data.model.request.RequestDataResponse

data class AirportScheduleResponse(
    val request: RequestDataResponse,
    val response: List<AirportResponse>,
    val terms: String,
)


