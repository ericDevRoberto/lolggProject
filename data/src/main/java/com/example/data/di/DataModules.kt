package com.example.data.di

import com.example.data.service.remote.RiotApiService
import com.example.data.utils.apiServiceCore
import org.koin.dsl.module

private const val URL = "https://"

val dataModules = module {
    single { apiServiceCore(URL, RiotApiService::class.java) }
}