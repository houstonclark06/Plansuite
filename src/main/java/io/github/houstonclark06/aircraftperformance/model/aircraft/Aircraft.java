package io.github.houstonclark06.aircraftperformance.model.aircraft;

import io.github.houstonclark06.aircraftperformance.validation.Validation;

/** Represents a generic aircraft with properties common to all supported aircraft. */
abstract class Aircraft {
  private final String tailNumber;

  protected Aircraft(String tailNumber) {
    this.tailNumber = Validation.requireNonBlank(tailNumber, "tailNumber").strip();
  }

  String getTailNumber() {
    return this.tailNumber;
  }
}
