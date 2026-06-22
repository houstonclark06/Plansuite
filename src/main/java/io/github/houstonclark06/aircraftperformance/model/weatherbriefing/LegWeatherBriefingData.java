package io.github.houstonclark06.aircraftperformance.model.weatherbriefing;

record LegWeatherBriefingData() {
  static class LegWeatherBriefingDataDraft {
    LegWeatherBriefingDataDraft() {}

    LegWeatherBriefingData build() {
      // TODO: Validate that data is present and valid.

      return new LegWeatherBriefingData();
    }
  }
}
