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
}
