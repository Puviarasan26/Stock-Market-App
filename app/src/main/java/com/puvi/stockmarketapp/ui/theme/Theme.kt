package com.puvi.stockmarketapp.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorPalette = darkColors(
    primary = Color(0xFF34C759), // Green 500
    primaryVariant = Color(0xFF2E865F), // Green 700
    secondary = Color(0xFF56B3FA), // Teal 200
    background = Color(0xFF003D66), // Dark Blue for background
    onPrimary = Color(0xFFFFFFFF), // White on primary for better readability
    onBackground = Color(0xFFE0E0E0) // Light grey on dark blue background for readability
)


@Composable
fun StockMarketAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = DarkColorPalette

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}