package com.puvi.stockmarketapp.data.mapper

import android.os.Build
import androidx.annotation.RequiresApi
import com.puvi.stockmarketapp.data.remote.dto.IntraDayInfoDto
import com.puvi.stockmarketapp.domain.model.IntraDayInfo
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.Locale

@RequiresApi(Build.VERSION_CODES.O)
fun IntraDayInfoDto.toIntraDay(): IntraDayInfo {
    val pattern = "yyy-MM-dd HH:mm:ss"
    val formatter = DateTimeFormatter.ofPattern(pattern, Locale.getDefault())
    val localDateTime = LocalDateTime.parse(timestamp, formatter)
    return IntraDayInfo(
        date = localDateTime,
        close = close
    )
}