package io.github.houstonclark06.aircraftperformance.model.airport;

import io.github.houstonclark06.aircraftperformance.validation.Validation;

/** Represents an airport and important data belonging to it. */
public class Airport {
  private final String userGeneratedLabel;

  public Airport(String userGeneratedLabel) {
    this.userGeneratedLabel = Validation.requireNonBlank(userGeneratedLabel, "userGeneratedLabel");
  }
}
