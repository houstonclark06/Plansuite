package io.github.houstonclark06.aircraftperformance.interpolation;

/** Provides interpolation methods for aircraft performance calculations. */
public final class Interpolator {

  private Interpolator() {
    throw new AssertionError("Utility class should not be instantiated.");
  }

  // TODO: Implement bilinear interpolation.

  /**
   * Calculates a linearly interpolated value between two points.
   *
   * @param x the x-value to interpolate
   * @param x0 the lower x-value
   * @param y0 the y-value corresponding to {@code x0}
   * @param x1 the upper x-value
   * @param y1 the y-value corresponding to {@code x1}
   * @return the interpolated y-value at {@code x}
   */
  public static double interpolateLinear(double x, double x0, double y0, double x1, double y1) {
    // TODO: Handle edge cases.

    // Calculate the relative fractional position within the x-range.
    double rangePositionFraction = (x - x0) / (x1 - x0);

    // Calculate the interpolated y-value.
    double y = y0 + (rangePositionFraction * (y1 - y0));

    return y;
  }
}
