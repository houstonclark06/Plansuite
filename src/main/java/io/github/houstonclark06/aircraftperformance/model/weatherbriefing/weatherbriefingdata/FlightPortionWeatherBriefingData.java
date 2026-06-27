package io.github.houstonclark06.aircraftperformance.model.weatherbriefing.weatherbriefingdata;

/**
 * Sealed marker interface for all records for data pertaining to a FlightPortion in
 * WeatherBriefing.
 */
public sealed interface FlightPortionWeatherBriefingData
    permits AirportWeatherBriefingData, LegWeatherBriefingData {}
