package com.puvi.stockmarketapp.presentation.company_info

import com.puvi.stockmarketapp.domain.model.CompanyInfo
import com.puvi.stockmarketapp.domain.model.IntraDayInfo

data class CompanyInfoState(
    val stockInfos: List<IntraDayInfo> = emptyList(),
    val company: CompanyInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)
