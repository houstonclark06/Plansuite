package io.github.houstonclark06.aircraftperformance.model.mappoint;

import io.github.houstonclark06.aircraftperformance.validation.Validation;

/** Represents a generic navigable point on a pilot map. */
public abstract class MapPoint {
  private final String userGeneratedLabel;

  public MapPoint(String userGeneratedLabel) {
    this.userGeneratedLabel = Validation.requireNonBlank(userGeneratedLabel, "userGeneratedLabel");
  }
}
