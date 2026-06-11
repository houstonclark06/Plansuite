package io.github.houstonclark06.aircraftperformance.validation;

/** Provides common methods for validating method and constructor arguments. */
public final class Validation {
  private Validation() {
    throw new AssertionError("Utility class should not be instantiated.");
  }

  /**
   * Requires a finite numeric value.
   *
   * @param value the value to validate
   * @param name the argument name used in the exception message
   * @return {@code value}, unchanged
   * @throws IllegalArgumentException if {@code value} is not finite
   */
  public static double requireFinite(double value, String name) {
    if (!Double.isFinite(value)) {
      throw new IllegalArgumentException(name + " must be finite");
    }

    return value;
  }

  /**
   * Requires a positive, finite numeric value.
   *
   * @param value the value to validate
   * @param name the argument name used in the exception message
   * @return {@code value}, unchanged
   * @throws IllegalArgumentException if {@code value} is not positive and finite
   */
  public static double requirePositiveFinite(double value, String name) {
    if (!Double.isFinite(value) || value <= 0) {
      throw new IllegalArgumentException(name + " must be positive and finite");
    }

    return value;
  }

  /**
   * Requires a non-negative, finite numeric value.
   *
   * @param value the value to validate
   * @param name the argument name used in the exception message
   * @return {@code value}, unchanged
   * @throws IllegalArgumentException if {@code value} is negative or not finite
   */
  public static double requireNonNegativeFinite(double value, String name) {
    if (!Double.isFinite(value) || value < 0) {
      throw new IllegalArgumentException(name + " must be non-negative and finite");
    }

    return value;
  }

  /**
   * Requires a non-null string containing at least one non-whitespace character.
   *
   * @param value the string to validate
   * @param name the argument name used in the exception message
   * @return {@code value}, unchanged
   * @throws IllegalArgumentException if {@code value} is {@code null}, empty, or blank
   */
  public static String requireNonBlank(String value, String name) {
    if (value == null || value.isBlank()) {
      throw new IllegalArgumentException(name + " cannot be null or blank");
    }

    return value;
  }
}
