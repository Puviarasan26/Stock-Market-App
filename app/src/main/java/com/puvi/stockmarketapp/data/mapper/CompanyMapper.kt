package com.puvi.stockmarketapp.data.mapper

import com.puvi.stockmarketapp.data.local.CompanyListingEntity
import com.puvi.stockmarketapp.data.remote.dto.CompanyInfoDto
import com.puvi.stockmarketapp.domain.model.CompanyInfo
import com.puvi.stockmarketapp.domain.model.CompanyListing

fun CompanyListingEntity.toCompanyListing(): CompanyListing {
    return CompanyListing(
        name = name,
        symbol = symbol,
        exchange = exchange
    )
}

fun CompanyListing.toCompanyListing(): CompanyListingEntity {
    return CompanyListingEntity(
        name = name,
        symbol = symbol,
        exchange = exchange
    )
}

fun CompanyInfoDto.toCompanyInfo(): CompanyInfo {
    return CompanyInfo(
        symbol = symbol ?: "",
        description = description ?: "",
        name = name ?: "",
        country = country ?: "",
        industry = industry ?: ""
    )
}