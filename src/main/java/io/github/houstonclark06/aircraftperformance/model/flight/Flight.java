package io.github.houstonclark06.aircraftperformance.model.flight;

import io.github.houstonclark06.aircraftperformance.model.airport.Airport;
import java.util.LinkedHashMap;
import java.util.Objects;

/** Represents a flight between two airports. */
public class Flight {
  private final Airport departure;
  private final Airport destination;
  private final LinkedHashMap<String, Airport> allAirports;

  private Flight(Airport departure, Airport destination) {
    this.departure = Objects.requireNonNull(departure);
    this.destination = Objects.requireNonNull(destination);
    this.allAirports = new LinkedHashMap<String, Airport>();
  }
}
