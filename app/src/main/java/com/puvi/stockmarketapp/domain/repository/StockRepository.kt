package com.puvi.stockmarketapp.domain.repository

import com.puvi.stockmarketapp.domain.model.CompanyListing
import com.puvi.stockmarketapp.util.Resource
import kotlinx.coroutines.flow.Flow

interface StockRepository {
    suspend fun getCompanyListings(
        fetchFromRemote: Boolean,
        query: String
    ): Flow<Resource<List<CompanyListing>>>
}