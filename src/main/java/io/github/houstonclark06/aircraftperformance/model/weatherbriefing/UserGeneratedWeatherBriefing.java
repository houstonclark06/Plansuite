package io.github.houstonclark06.aircraftperformance.model.weatherbriefing;

import io.github.houstonclark06.aircraftperformance.model.flight.Flight;
import java.time.Clock;
import java.util.Objects;

/** Represents a weather briefing entered manually by user. */
class UserGeneratedWeatherBriefing extends WeatherBriefing {
  UserGeneratedWeatherBriefing(UserGeneratedWeatherBriefingDraft draft) {
    super(draft.clock, draft.flight);
  }

  static class UserGeneratedWeatherBriefingDraft {
    private final Clock clock;
    private final Flight flight;

    UserGeneratedWeatherBriefingDraft(Clock clock, Flight flight) {
      this.clock = Objects.requireNonNull(clock);
      this.flight = Objects.requireNonNull(flight);
    }
  }
}
