package com.saydullin.flighttracker.domain.model.route

data class Route(
    val airline_iata: String,
    val airline_icao: String,
    val flight_number: String,
    val flight_iata: String,
    val flight_icao: String,
    val cs_airline_iata: String?,
    val cs_flight_iata: String?,
    val cs_flight_number: String?,
    val dep_iata: String,
    val dep_icao: String,
    val dep_terminals: String,
    val dep_time: String,
    val dep_time_utc: String,
    val arr_iata: String,
    val arr_icao: String,
    val arr_terminals: List<String>,
    val arr_time: String,
    val arr_time_utc: String,
    val duration: String,
    val aircraft_icao: String,
    val counter: String,
    val updated: String,
    val days: List<String>,
)