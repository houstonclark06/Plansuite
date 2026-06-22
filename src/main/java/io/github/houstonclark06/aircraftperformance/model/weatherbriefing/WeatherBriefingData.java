package io.github.houstonclark06.aircraftperformance.model.weatherbriefing;

record WeatherBriefingData() {
  static class WeatherBriefingDataDraft {
    WeatherBriefingDataDraft() {}

    WeatherBriefingData build() {
      // TODO: Validate that data is present and valid.

      return new WeatherBriefingData();
    }
  }
}
