package io.github.houstonclark06.aircraftperformance.validation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class ValidationTest {

  @Test
  void requireFinite_whenValueIsPositive_returnsValue() {
    double result = Validation.requireFinite(5.0, "value");

    assertEquals(5.0, result);
  }

  @Test
  void requireFinite_whenValueIsZero_returnsValue() {
    double result = Validation.requireFinite(0.0, "value");

    assertEquals(0.0, result);
  }

  @Test
  void requireFinite_whenValueIsNegative_returnsValue() {
    double result = Validation.requireFinite(-1.0, "value");

    assertEquals(-1.0, result);
  }

  @Test
  void requireFinite_whenValueIsNaN_throwsIllegalArgumentException() {
    assertThrows(
        IllegalArgumentException.class, () -> Validation.requireFinite(Double.NaN, "value"));
  }

  @Test
  void requireFinite_whenValueIsPositiveInfinity_throwsIllegalArgumentException() {
    assertThrows(
        IllegalArgumentException.class,
        () -> Validation.requireFinite(Double.POSITIVE_INFINITY, "value"));
  }

  @Test
  void requireFinite_whenValueIsNegativeInfinity_throwsIllegalArgumentException() {
    assertThrows(
        IllegalArgumentException.class,
        () -> Validation.requireFinite(Double.NEGATIVE_INFINITY, "value"));
  }

  @Test
  void requirePositiveFinite_whenValueIsPositive_returnsValue() {
    double result = Validation.requirePositiveFinite(5.0, "value");

    assertEquals(5.0, result);
  }

  @Test
  void requirePositiveFinite_whenValueIsZero_throwsIllegalArgumentException() {
    assertThrows(
        IllegalArgumentException.class, () -> Validation.requirePositiveFinite(0.0, "value"));
  }

  @Test
  void requirePositiveFinite_whenValueIsNegative_throwsIllegalArgumentException() {
    assertThrows(
        IllegalArgumentException.class, () -> Validation.requirePositiveFinite(-1.0, "value"));
  }

  @Test
  void requirePositiveFinite_whenValueIsNaN_throwsIllegalArgumentException() {
    assertThrows(
        IllegalArgumentException.class,
        () -> Validation.requirePositiveFinite(Double.NaN, "value"));
  }

  @Test
  void requirePositiveFinite_whenValueIsPositiveInfinity_throwsIllegalArgumentException() {
    assertThrows(
        IllegalArgumentException.class,
        () -> Validation.requirePositiveFinite(Double.POSITIVE_INFINITY, "value"));
  }

  @Test
  void requirePositiveFinite_whenValueIsNegativeInfinity_throwsIllegalArgumentException() {
    assertThrows(
        IllegalArgumentException.class,
        () -> Validation.requirePositiveFinite(Double.NEGATIVE_INFINITY, "value"));
  }

  @Test
  void requireNonNegativeFinite_whenValueIsPositive_returnsValue() {
    double result = Validation.requireNonNegativeFinite(5.0, "value");

    assertEquals(5.0, result);
  }

  @Test
  void requireNonNegativeFinite_whenValueIsZero_returnsValue() {
    double result = Validation.requireNonNegativeFinite(0.0, "value");

    assertEquals(0.0, result);
  }

  @Test
  void requireNonNegativeFinite_whenValueIsNegative_throwsIllegalArgumentException() {
    assertThrows(
        IllegalArgumentException.class, () -> Validation.requireNonNegativeFinite(-1.0, "value"));
  }

  @Test
  void requireNonNegativeFinite_whenValueIsNaN_throwsIllegalArgumentException() {
    assertThrows(
        IllegalArgumentException.class,
        () -> Validation.requireNonNegativeFinite(Double.NaN, "value"));
  }

  @Test
  void requireNonNegativeFinite_whenValueIsPositiveInfinity_throwsIllegalArgumentException() {
    assertThrows(
        IllegalArgumentException.class,
        () -> Validation.requireNonNegativeFinite(Double.POSITIVE_INFINITY, "value"));
  }

  @Test
  void requireNonNegativeFinite_whenValueIsNegativeInfinity_throwsIllegalArgumentException() {
    assertThrows(
        IllegalArgumentException.class,
        () -> Validation.requireNonNegativeFinite(Double.NEGATIVE_INFINITY, "value"));
  }

  @Test
  void requireNonBlank_whenValueIsNonBlank_returnsValue() {
    String result = Validation.requireNonBlank("N12345", "value");

    assertEquals("N12345", result);
  }

  @Test
  void requireNonBlank_whenValueIsEmpty_throwsIllegalArgumentException() {
    assertThrows(IllegalArgumentException.class, () -> Validation.requireNonBlank("", "value"));
  }

  @Test
  void requireNonBlank_whenValueIsWhitespace_throwsIllegalArgumentException() {
    assertThrows(IllegalArgumentException.class, () -> Validation.requireNonBlank("   ", "value"));
  }
}
