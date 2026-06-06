package io.github.houstonclark06.aircraftperformance.model.navigationpoint;

import io.github.houstonclark06.aircraftperformance.validation.Validation;

/** Represents a generic navigable point on a pilot map. */
public abstract class NavigationPoint {
  private final String userGeneratedLabel;

  public NavigationPoint(String userGeneratedLabel) {
    this.userGeneratedLabel = Validation.requireNonBlank(userGeneratedLabel, "userGeneratedLabel");
  }
}
