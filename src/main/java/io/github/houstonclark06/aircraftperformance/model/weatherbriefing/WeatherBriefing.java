package io.github.houstonclark06.aircraftperformance.model.weatherbriefing;

import java.time.Clock;
import java.time.Instant;
import java.util.Objects;

/** Base class for all weather briefings. */
public abstract class WeatherBriefing {
  private final Instant timestamp;

  protected WeatherBriefing(Clock clock) {
    this.timestamp = Instant.now(Objects.requireNonNull(clock, "clock cannot be null"));
  }

  Instant getTimestamp() {
    return timestamp;
  }
}
