package io.github.houstonclark06.aircraftperformance.model.weatherbriefing;

record AirportWeatherBriefingData() {
  static class AirportWeatherBriefingDataDraft {
    AirportWeatherBriefingDataDraft() {}

    AirportWeatherBriefingData build() {
      // TODO: Validate that data is present and valid.

      return new AirportWeatherBriefingData();
    }
  }
}
