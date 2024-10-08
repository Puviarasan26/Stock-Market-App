package com.puvi.stockmarketapp.data.csv

import java.io.InputStream

interface CSVParser<T> {
    suspend fun  parser(stream: InputStream): List<T>
}