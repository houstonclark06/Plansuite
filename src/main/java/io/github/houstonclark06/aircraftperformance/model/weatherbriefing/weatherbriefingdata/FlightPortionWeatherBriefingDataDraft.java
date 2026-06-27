package io.github.houstonclark06.aircraftperformance.model.weatherbriefing.weatherbriefingdata;

import io.github.houstonclark06.aircraftperformance.model.weatherbriefing.weatherbriefingdata.AirportWeatherBriefingData.AirportWeatherBriefingDataDraft;
import io.github.houstonclark06.aircraftperformance.model.weatherbriefing.weatherbriefingdata.LegWeatherBriefingData.LegWeatherBriefingDataDraft;

/**
 * Sealed marker interface for all drafts for records for data pertaining to a FlightPortion in
 * WeatherBriefing.
 */
public sealed interface FlightPortionWeatherBriefingDataDraft
    permits AirportWeatherBriefingDataDraft, LegWeatherBriefingDataDraft {}
