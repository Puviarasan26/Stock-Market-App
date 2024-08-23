package com.puvi.stockmarketapp.di

import com.puvi.stockmarketapp.data.csv.CSVParser
import com.puvi.stockmarketapp.data.csv.CompanyListingParser
import com.puvi.stockmarketapp.data.repository.StockRepositoryImpl
import com.puvi.stockmarketapp.domain.model.CompanyListing
import com.puvi.stockmarketapp.domain.repository.StockRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds
    @Singleton
    abstract fun bindCompanyListingsParser(
        companyListingParser: CompanyListingParser
    ): CSVParser<CompanyListing>

    @Binds
    @Singleton
    abstract fun bindStockRepository(
        stockRepositoryImpl: StockRepositoryImpl
    ): StockRepository

}