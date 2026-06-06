package io.github.houstonclark06.aircraftperformance.model.airport;

import io.github.houstonclark06.aircraftperformance.validation.Validation;

/** Represents an airport and important data belonging to it. */
class Airport {
  private final String userGeneratedLabel;

  private Airport(String userGeneratedLabel) {
    this.userGeneratedLabel = Validation.requireNonBlank(userGeneratedLabel, "userGeneratedLabel");
  }
}
