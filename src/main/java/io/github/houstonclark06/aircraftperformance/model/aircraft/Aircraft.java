package io.github.houstonclark06.aircraftperformance.model.aircraft;

import io.github.houstonclark06.aircraftperformance.validation.Validation;
import java.util.Objects;

/** Represents a generic aircraft with properties common to all supported aircraft. */
abstract class Aircraft {
  private final String tailNumber;

  protected Aircraft(String tailNumber) {
    this.tailNumber =
        Validation.requireNonBlank(
                Objects.requireNonNull(tailNumber, "tailNumber cannot be null"), "tailNumber")
            .trim();
  }

  String getTailNumber() {
    return this.tailNumber;
  }
}
