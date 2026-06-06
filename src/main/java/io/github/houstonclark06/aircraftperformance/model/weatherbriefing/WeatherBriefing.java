package io.github.houstonclark06.aircraftperformance.model.weatherbriefing;

import io.github.houstonclark06.aircraftperformance.model.flight.Flight;
import java.time.Clock;
import java.time.Instant;
import java.util.Objects;

/** Base class for all weather briefings. */
public abstract class WeatherBriefing {
  private final Instant timestamp;
  private final Flight flight;

  protected WeatherBriefing(Clock clock, Flight flight) {
    this.timestamp = Instant.now(Objects.requireNonNull(clock, "clock cannot be null"));
    this.flight = Objects.requireNonNull(flight);
  }

  Instant getTimestamp() {
    return timestamp;
  }
}
