package io.github.houstonclark06.aircraftperformance.interpolation;

/** Utility methods for interpolation. */
public final class Interpolator {

  private Interpolator() {
    throw new AssertionError("Utility class should not be instantiated.");
  }

  // TODO: Implement bilinear interpolation.

  /**
   * Calculates linear interpolation between two points.
   *
   * @param x the x-value to interpolate
   * @param x0 the lower x-value
   * @param y0 the y-value corresponding to {@code x0}
   * @param x1 the upper x-value
   * @param y1 the y-value corresponding to {@code x1}
   * @return the interpolated y-value at {@code x}
   * @throws IllegalArgumentException if {@code x0 == x1}
   * @throws IllegalArgumentException if {@code x} is outside of x0 to x1 range
   */
  public static double interpolateLinear(double x, double x0, double y0, double x1, double y1) {

    // Throw IllegalArgumentException if x0 == x1
    if (x0 == x1) {
      throw new IllegalArgumentException("x0 and x1 must be different values (forming a range).");
    }

    // Throw IllegalArgumentException if x is not between x0 and x1.
    double lowerBound = Math.min(x0, x1);
    double upperBound = Math.max(x0, x1);
    if (x < lowerBound || x > upperBound) {
      throw new IllegalArgumentException("x must be within the interpolation range.");
    }

    // Calculate the relative fractional position within the x-range.
    double rangePositionFraction = (x - x0) / (x1 - x0);

    // Calculate the interpolated y-value.
    double y = y0 + (rangePositionFraction * (y1 - y0));

    return y;
  }
}
