package io.github.houstonclark06.aircraftperformance.model.aircraft;

import io.github.houstonclark06.aircraftperformance.validation.Validation;

/** Represents a generic aircraft with properties common to all supported aircraft. */
abstract class Aircraft {
  private final String tailNumber;

  /**
   * Creates an Aircraft.
   *
   * @param tailNumber the tail number of the aircraft
   * @throws IllegalArgumentException if {@code tailNumber} is null or blank
   */
  protected Aircraft(String tailNumber) {
    this.tailNumber = Validation.requireNonBlank(tailNumber, "tailNumber").strip();
  }

  /**
   * Gets the tail number.
   *
   * @return the tailNumber of the aircraft
   */
  String getTailNumber() {
    return this.tailNumber;
  }
}
