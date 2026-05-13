package com.example.theweatherapp

data class WeatherResponse(
    val location: Location,
    val current: Current
)

data class Location(
    val name: String,
    val region: String,
    val country: String,
    val lat: Double,
    val lon: Double,
    val localtime: String
)

data class Current(
    val temp_c: Double,
    val temp_f: Double,
    val is_day: Int,
    val condition: Condition,
    val wind_kph: Double,
    val wind_dir: String,
    val pressure_mb: Double,
    val humidity: Int,
    val cloud: Int,
    val feelslike_c: Double,
    val vis_km: Double,
    val uv: Double
)

data class Condition(
    val text: String,
    val icon: String,
    val code: Int
)
