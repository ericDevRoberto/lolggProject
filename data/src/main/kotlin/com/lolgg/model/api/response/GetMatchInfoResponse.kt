package com.lolgg.model.api.response

data class GetMatchInfoResponse(
    val info:InfoResponse
)

data class InfoResponse(
    val participants: String
)