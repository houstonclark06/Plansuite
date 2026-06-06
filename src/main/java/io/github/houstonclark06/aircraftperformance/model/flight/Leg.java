package io.github.houstonclark06.aircraftperformance.model.flight;

import io.github.houstonclark06.aircraftperformance.model.navigationpoint.NavigationPoint;
import java.util.Objects;

/** Represents a leg (straight line portion) of a flight between two navigation points. */
class Leg {
  private final NavigationPoint startPoint;
  private final NavigationPoint endPoint;

  private Leg(NavigationPoint startPoint, NavigationPoint endPoint) {
    this.startPoint = Objects.requireNonNull(startPoint);
    this.endPoint = Objects.requireNonNull(endPoint);
  }
}
