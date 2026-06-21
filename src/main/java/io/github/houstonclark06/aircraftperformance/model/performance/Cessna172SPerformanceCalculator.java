package io.github.houstonclark06.aircraftperformance.model.performance;

import io.github.houstonclark06.aircraftperformance.model.aircraft.Cessna172S;
import io.github.houstonclark06.aircraftperformance.model.weatherbriefing.WeatherBriefing;
import java.util.Objects;

/** Calculates performance values for Cessna 172S. */
final class Cessna172SPerformanceCalculator {
  private Cessna172SPerformanceCalculator() {
    throw new AssertionError("Cannot be instantiated.");
  }

  /**
   * Calculates short field takeoff distance.
   *
   * @param aircraft the aircraft
   * @param weatherBriefing the weather briefing
   * @return the calculated short field takeoff distance
   * @throws NullPointerException if {@code aircraft == null}
   * @throws NullPointerException if {@code weatherBriefing == null}
   * @throws UnsupportedOperationException always until this method is complete
   */
  static ShortFieldTakeoffDistance getShortFieldTakeoffDistance(
      Cessna172S aircraft, WeatherBriefing weatherBriefing) {

    // Null checks
    Objects.requireNonNull(aircraft, "aircraft cannot be null");
    Objects.requireNonNull(weatherBriefing, "weatherBriefing cannot be null");

    double takeoffWeight = aircraft.getWeightAndBalanceProfile().getTakeoffWeight();

    // TODO: Develop from stub method.
    throw new UnsupportedOperationException("Not implemented yet.");
  }
}
