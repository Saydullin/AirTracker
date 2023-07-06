package com.example.flighttracker.data.model

data class GeoRequest (
    val country_code: String,
    val country: String,
    val continent: String,
    val city: String,
    val lat: String,
    val lng: String,
    val timezone: String,
) {
}