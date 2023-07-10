package com.saydullin.flighttracker.data.model.request

data class GeoDataRequest (
    val country_code: String,
    val country: String,
    val continent: String,
    val city: String,
    val lat: String,
    val lng: String,
    val timezone: String,
) {
}