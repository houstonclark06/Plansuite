package io.github.houstonclark06.aircraftperformance.interpolation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class InterpolatorTest {

  private static final double TOLERANCE = 1e-9;

  @Test
  void interpolateLinear_whenXValuesAreEqual_throwsIllegalArgumentException() {
    assertThrows(
        IllegalArgumentException.class, () -> Interpolator.interpolateLinear(5, 10, 0, 10, 100));
  }

  @Test
  void interpolateLinear_whenXValuesAreNegativeAndPositiveZero_throwsIllegalArgumentException() {
    assertThrows(
        IllegalArgumentException.class,
        () -> Interpolator.interpolateLinear(0.0, -0.0, 1.0, 0.0, 2.0));
  }

  @Test
  void interpolateLinear_whenXIsAboveRange_throwsIllegalArgumentException() {
    assertThrows(
        IllegalArgumentException.class, () -> Interpolator.interpolateLinear(11, 0, 0, 10, 100));
  }

  @Test
  void interpolateLinear_whenXIsBelowRange_throwsIllegalArgumentException() {
    assertThrows(
        IllegalArgumentException.class, () -> Interpolator.interpolateLinear(-1, 0, 0, 10, 100));
  }

  @Test
  void interpolateLinear_whenInputIsNaN_throwsIllegalArgumentException() {
    assertThrows(
        IllegalArgumentException.class,
        () -> Interpolator.interpolateLinear(Double.NaN, 0, 0, 10, 100));
  }

  @Test
  void interpolateLinear_whenInputIsPositiveInfinity_throwsIllegalArgumentException() {
    assertThrows(
        IllegalArgumentException.class,
        () -> Interpolator.interpolateLinear(Double.POSITIVE_INFINITY, 0, 0, 10, 100));
  }

  @Test
  void interpolateLinear_whenInputIsNegativeInfinity_throwsIllegalArgumentException() {
    assertThrows(
        IllegalArgumentException.class,
        () -> Interpolator.interpolateLinear(Double.NEGATIVE_INFINITY, 0, 0, 10, 100));
  }

  @Test
  void interpolateLinear_whenXEqualsLowerBound_returnsLowerY() {
    double result = Interpolator.interpolateLinear(0, 0, 0, 10, 100);
    assertEquals(0, result, TOLERANCE);
  }

  @Test
  void interpolateLinear_whenXEqualsUpperBound_returnsUpperY() {
    double result = Interpolator.interpolateLinear(10, 0, 0, 10, 100);
    assertEquals(100, result, TOLERANCE);
  }

  @Test
  void interpolateLinear_whenXIsMidpoint_interpolatesCorrectly() {
    double result = Interpolator.interpolateLinear(5, 0, 0, 10, 100);
    assertEquals(50, result, TOLERANCE);
  }

  @Test
  void interpolateLinear_whenXIsWithinRange_interpolatesCorrectly() {
    double result = Interpolator.interpolateLinear(2.5, 0, 0, 10, 100);
    assertEquals(25, result, TOLERANCE);
  }

  @Test
  void interpolateLinear_whenXRangeIsDescending_interpolatesCorrectly() {
    double result = Interpolator.interpolateLinear(5, 10, 100, 0, 0);
    assertEquals(50, result, TOLERANCE);
  }

  @Test
  void interpolateBilinear_whenXValuesAreEqual_throwsIllegalArgumentException() {
    assertThrows(
        IllegalArgumentException.class,
        () ->
            Interpolator.interpolateBilinear(3000, 3000, 3000, 15, 10, 20, 1050, 1150, 1130, 1240));
  }

  @Test
  void interpolateBilinear_whenYValuesAreEqual_throwsIllegalArgumentException() {
    assertThrows(
        IllegalArgumentException.class,
        () ->
            Interpolator.interpolateBilinear(3200, 3000, 4000, 10, 10, 10, 1050, 1150, 1130, 1240));
  }

  @Test
  void interpolateBilinear_whenXIsOutsideRange_throwsIllegalArgumentException() {
    assertThrows(
        IllegalArgumentException.class,
        () ->
            Interpolator.interpolateBilinear(4500, 3000, 4000, 15, 10, 20, 1050, 1150, 1130, 1240));
  }

  @Test
  void interpolateBilinear_whenYIsOutsideRange_throwsIllegalArgumentException() {
    assertThrows(
        IllegalArgumentException.class,
        () ->
            Interpolator.interpolateBilinear(3200, 3000, 4000, 25, 10, 20, 1050, 1150, 1130, 1240));
  }

  @Test
  void interpolateBilinear_whenInputIsNaN_throwsIllegalArgumentException() {
    assertThrows(
        IllegalArgumentException.class,
        () ->
            Interpolator.interpolateBilinear(
                3200, 3000, 4000, Double.NaN, 10, 20, 1050, 1150, 1130, 1240));
  }

  @Test
  void interpolateBilinear_whenInputIsPositiveInfinity_throwsIllegalArgumentException() {
    assertThrows(
        IllegalArgumentException.class,
        () ->
            Interpolator.interpolateBilinear(
                3200, 3000, 4000, 15, 10, 20, Double.POSITIVE_INFINITY, 1150, 1130, 1240));
  }

  @Test
  void interpolateBilinear_whenInputIsNegativeInfinity_throwsIllegalArgumentException() {
    assertThrows(
        IllegalArgumentException.class,
        () ->
            Interpolator.interpolateBilinear(
                3200, 3000, 4000, 15, 10, 20, 1050, 1150, Double.NEGATIVE_INFINITY, 1240));
  }

  @Test
  void interpolateBilinear_whenXAndYWithinRange_interpolatesCorrectly() {
    double result =
        Interpolator.interpolateBilinear(3200, 3000, 4000, 15, 10, 20, 1050, 1150, 1130, 1240);
    assertEquals(1117, result, TOLERANCE);
  }

  @Test
  void interpolateBilinear_whenAtLowerLeftCorner_returnsLowerLeftValue() {
    double result =
        Interpolator.interpolateBilinear(3000, 3000, 4000, 10, 10, 20, 1050, 1150, 1130, 1240);
    assertEquals(1050, result, TOLERANCE);
  }

  @Test
  void interpolateBilinear_whenAtUpperRightCorner_returnsUpperRightValue() {
    double result =
        Interpolator.interpolateBilinear(4000, 3000, 4000, 20, 10, 20, 1050, 1150, 1130, 1240);
    assertEquals(1240, result, TOLERANCE);
  }
}
