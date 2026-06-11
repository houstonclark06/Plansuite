package io.github.houstonclark06.aircraftperformance.model.flight;

import io.github.houstonclark06.aircraftperformance.model.navigationpoint.NavigationPoint;
import java.util.Objects;

/** Represents a leg (straight line portion) of a flight between two navigation points. */
class Leg {
  private final NavigationPoint startPoint;
  private final NavigationPoint endPoint;

  /**
   * Creates a Leg.
   *
   * @param startPoint the NavigationPoint at the beginning of the leg
   * @param endPoint the NavigationPoint at the end of the leg
   * @throws NullPointerException if {@code startPoint == null}
   * @throws NullPointerException if {@code endPoint == null}
   */
  Leg(NavigationPoint startPoint, NavigationPoint endPoint) {
    this.startPoint = Objects.requireNonNull(startPoint);
    this.endPoint = Objects.requireNonNull(endPoint);
  }
}
