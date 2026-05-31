package io.github.houstonclark06.aircraftperformance.model.weatherbriefing;

import java.time.Clock;

/** Represents a weather briefing entered manually by user. */
class UserGeneratedWeatherBriefing extends WeatherBriefing {
  private UserGeneratedWeatherBriefing(Clock clock) {
    super(clock);
  }
}
