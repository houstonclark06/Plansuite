package io.github.houstonclark06.aircraftperformance.validation;

/** Common argument validation helpers. */
public final class Validation {
  private Validation() {
    throw new AssertionError("Utility class should not be instantiated.");
  }

  public static double requireFinite(double value, String name) {
    if (!Double.isFinite(value)) {
      throw new IllegalArgumentException(name + " must be finite");
    }

    return value;
  }

  public static double requirePositiveFinite(double value, String name) {
    if (!Double.isFinite(value) || value <= 0) {
      throw new IllegalArgumentException(name + " must be positive and finite");
    }

    return value;
  }

  public static double requireNonNegativeFinite(double value, String name) {
    if (!Double.isFinite(value) || value < 0) {
      throw new IllegalArgumentException(name + " must be non-negative and finite");
    }

    return value;
  }

  public static String requireNonBlank(String value, String name) {
    if (value == null || value.isBlank()) {
      throw new IllegalArgumentException(name + " cannot be blank");
    }

    return value;
  }
}
