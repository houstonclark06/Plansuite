package io.github.houstonclark06.aircraftperformance.model.aircraft;

/** Represents a generic aircraft with properties common to all supported aircraft. */
abstract class Aircraft {
  private final String tailNumber;

  protected Aircraft(String tailNumber) {
    if (tailNumber == null || tailNumber.isBlank()) {
      throw new IllegalArgumentException("tailNumber cannot be blank");
    }

    this.tailNumber = tailNumber;
  }

  private String getTailNumber() {
    return this.tailNumber;
  }
}
