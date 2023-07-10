package com.saydullin.flighttracker.domain.model.liveFlight

data class LiveFlight(
    val hex: String,
    val reg_number: String,
    val flag: String,
    val lat: Float,
    val lng: Float,
    val alt: Int,
    val dir: Int,
    val speed: Int,
    val v_speed: Int,
    val squawk: String,
    val flight_number: String,
    val flight_icao: String,
    val flight_iata: String,
    val dep_icao: String,
    val dep_iata: String,
    val arr_icao: String,
    val arr_iata: String,
    val airline_icao: String,
    val airline_iata: String,
    val aircraft_icao: String,
    val updated: Long,
    val status: String,
)


