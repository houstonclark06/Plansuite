package io.github.houstonclark06.aircraftperformance.model.weatherbriefing;

import io.github.houstonclark06.aircraftperformance.model.flight.Flight;
import java.time.Clock;

/** Represents a weather briefing entered manually by user. */
class UserGeneratedWeatherBriefing extends WeatherBriefing {

  /**
   * Creates a UserGeneratedWeatherBriefing.
   *
   * @param clock a clock to be used for the briefing timestamp
   * @param flight the flight that the briefing applies to
   */
  private UserGeneratedWeatherBriefing(Clock clock, Flight flight) {
    super(clock, flight);
  }
}
