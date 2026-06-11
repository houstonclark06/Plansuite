package io.github.houstonclark06.aircraftperformance.model.airport;

import io.github.houstonclark06.aircraftperformance.model.navigationpoint.NavigationPoint;

/** Represents an airport and important data belonging to it. */
public class Airport extends NavigationPoint {

  /**
   * Creates an Airport.
   *
   * @param label the user-generated label for the Airport
   */
  public Airport(String label) {
    super(label);
  }
}
