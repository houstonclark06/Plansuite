package io.github.houstonclark06.aircraftperformance.model.flight;

import io.github.houstonclark06.aircraftperformance.model.airport.Airport;
import io.github.houstonclark06.aircraftperformance.model.navigationpoint.NavigationPoint;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Objects;

/** Represents a flight between two airports. */
public class Flight {
  private final Airport departure;

  private final LinkedHashMap<String, NavigationPoint> enrouteNavigationPoints;
  private final LinkedList<Leg> flightLegs;

  private final Airport destination;

  private final LinkedHashMap<String, Airport> alternateAirports;

  private Flight(Airport departure, Airport destination) {
    this.departure = Objects.requireNonNull(departure);

    this.enrouteNavigationPoints = new LinkedHashMap<String, NavigationPoint>();
    this.flightLegs = new LinkedList<Leg>();

    this.destination = Objects.requireNonNull(destination);
    
    this.alternateAirports = new LinkedHashMap<String, Airport>();
  }
}
