package com.saydullin.flighttracker.data.repository

import androidx.paging.PagingData
import com.saydullin.flighttracker.data.model.airport.AirportResponse
import com.saydullin.flighttracker.domain.model.airport.AirportDepartment
import com.saydullin.flighttracker.domain.repository.AirportRepository
import kotlinx.coroutines.flow.Flow

class AirportRepositoryImpl : AirportRepository {

    override suspend fun getSchedule(dep: AirportDepartment): Flow<PagingData<AirportResponse>> {
        TODO("Not yet implemented")
    }

}