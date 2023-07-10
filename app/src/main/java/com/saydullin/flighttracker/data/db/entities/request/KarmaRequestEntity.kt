package com.saydullin.flighttracker.data.db.entities.request

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class KarmaRequestEntity(
    @PrimaryKey val id: Int,
    val is_blocked: Boolean,
    val is_crawler: Boolean,
    val is_bot: Boolean,
    val is_friend: Boolean,
    val is_regular: Boolean,
)


