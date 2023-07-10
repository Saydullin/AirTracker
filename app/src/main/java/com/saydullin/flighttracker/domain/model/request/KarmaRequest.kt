package com.saydullin.flighttracker.domain.model.request

data class KarmaRequest (
    val is_blocked: Boolean,
    val is_crawler: Boolean,
    val is_bot: Boolean,
    val is_friend: Boolean,
    val is_regular: Boolean,
) {
}