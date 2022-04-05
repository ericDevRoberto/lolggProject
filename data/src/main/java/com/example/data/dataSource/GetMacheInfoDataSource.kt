package com.example.data.dataSource

import com.example.data.service.RiotApiService
import retrofit2.http.Path

class GetMacheInfoDataSource(private val service: RiotApiService) {

    suspend fun getMacheInfo(server: String, name: String ) = service.getMacheInfo(server, name)
}