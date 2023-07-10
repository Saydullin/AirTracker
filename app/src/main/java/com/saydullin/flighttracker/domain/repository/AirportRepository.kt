package com.saydullin.flighttracker.domain.repository

import androidx.paging.PagingData
import com.saydullin.flighttracker.data.model.airport.AirportResponse
import com.saydullin.flighttracker.domain.model.airport.AirportDepartment
import kotlinx.coroutines.flow.Flow

interface AirportRepository {

    suspend fun getSchedule(dep: AirportDepartment): Flow<PagingData<AirportResponse>>

}