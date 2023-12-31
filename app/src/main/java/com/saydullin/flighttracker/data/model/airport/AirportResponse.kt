package com.saydullin.flighttracker.data.model.airport

data class AirportResponse(
    val airline_iata: String,
    val airline_icao: String,
    val flight_iata: String,
    val flight_icao: String,
    val flight_number: String,
    val dep_iata: String,
    val dep_icao: String,
    val dep_terminal: String,
    val dep_gate: String,
    val dep_time: String,
    val dep_time_utc: String,
    val dep_estimated: String,
    val dep_estimated_utc: String,
    val dep_actual: String,
    val dep_actual_utc: String,
    val arr_iata: String,
    val arr_icao: String,
    val arr_terminal: String,
    val arr_gate: String,
    val arr_baggage: String,
    val arr_time: String,
    val arr_time_utc: String,
    val arr_estimated: String,
    val arr_estimated_utc: String,
    val arr_actual: String,
    val arr_actual_utc: String,
    val cs_airline_iata: String,
    val cs_flight_number: String,
    val cs_flight_iata: String,
    val status: String,
    val duration: String,
    val delayed: String,
    val dep_delayed: String,
    val arr_delayed: String,
    val aircraft_icao: String,
    val arr_time_ts: String,
    val dep_time_ts: String,
    val arr_estimated_ts: String,
    val dep_estimated_ts: String,
    val arr_actual_ts: String,
    val dep_actual_ts: String
)