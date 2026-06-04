package io.github.houstonclark06.aircraftperformance.model.performance;

import io.github.houstonclark06.aircraftperformance.model.aircraft.Cessna172S;
import io.github.houstonclark06.aircraftperformance.model.weatherbriefing.WeatherBriefing;
import java.util.Objects;

/** Calculates performance values for Cessna 172S. */
final class Cessna172SPerformanceCalculator {
  private Cessna172SPerformanceCalculator() {
    throw new AssertionError("Cannot be instantiated.");
  }

  static ShortFieldTakeoffDistance getShortFieldTakeoffDistance(
      Cessna172S aircraft, WeatherBriefing weatherBriefing) {

    // Null checks
    Objects.requireNonNull(aircraft, "aircraft cannot be null");
    Objects.requireNonNull(weatherBriefing, "weatherBriefing cannot be null");

    double takeoffWeight = aircraft.getWeightAndBalanceProfile().getTakeoffWeight();

    // TODO: Develop from stub method.
    return null;
  }
}
