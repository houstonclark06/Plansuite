package io.github.houstonclark06.aircraftperformance.model.weatherbriefing;

import io.github.houstonclark06.aircraftperformance.model.flight.Flight;
import java.time.Clock;
import java.time.Instant;
import java.util.Objects;

/** Base class for all weather briefings. */
public abstract class WeatherBriefing {
  private final Instant timestamp;
  private final Flight flight;

  /**
   * Creates a WeatherBriefing.
   *
   * @param clock a Clock to be used for the briefing timestamp
   * @param flight the flight that the briefing applies to
   * @throws NullPointerException if {@code clock == null}
   * @throws NullPointerException if {@code flight == null}
   */
  protected WeatherBriefing(Clock clock, Flight flight) {
    this.timestamp = Instant.now(Objects.requireNonNull(clock, "clock cannot be null"));
    this.flight = Objects.requireNonNull(flight);
  }

  /**
   * Returns the timestamp.
   *
   * @return the timestamp of the WeatherBriefing
   */
  Instant getTimestamp() {
    return timestamp;
  }
}
