package com.puvi.stockmarketapp.data.remote.dto

import java.time.LocalDateTime


data class IntraDayInfoDto(
    val timestamp: String,
    val close: Double
)