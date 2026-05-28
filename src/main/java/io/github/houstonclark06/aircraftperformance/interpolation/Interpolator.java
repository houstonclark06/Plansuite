package io.github.houstonclark06.aircraftperformance.interpolation;

/** Utility methods for interpolation. */
public final class Interpolator {

  private Interpolator() {
    throw new AssertionError("Utility class should not be instantiated.");
  }

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
    if (Double.compare(x0, x1) == 0) {
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

  /**
   * Calculates bilinear interpolation between four points.
   *
   * @param x the x-value to interpolate
   * @param x0 the lower x-value
   * @param x1 the upper x-value
   * @param y the y-value to interpolate
   * @param y0 the lower y-value
   * @param y1 the upper y-value
   * @param q11 the value at {@code (x0, y0)}
   * @param q12 the value at {@code (x0, y1)}
   * @param q21 the value at {@code (x1, y0)}
   * @param q22 the value at {@code (x1, y1)}
   * @return the interpolated value at {@code (x, y)}
   * @throws IllegalArgumentException if {@code x0 == x1} or {@code y0 == y1}
   * @throws IllegalArgumentException if {@code x} is outside of x0 to x1 range or {@code y} is
   *     outside of y0 to y1 range
   */
  public static double interpolateBilinear(
      double x,
      double x0,
      double x1,
      double y,
      double y0,
      double y1,
      double q11,
      double q12,
      double q21,
      double q22) {
    double q1 = interpolateLinear(y, y0, q11, y1, q12);
    double q2 = interpolateLinear(y, y0, q21, y1, q22);
    return interpolateLinear(x, x0, q1, x1, q2);
  }
}
