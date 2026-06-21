package io.github.houstonclark06.aircraftperformance.model.weightandbalance;

import io.github.houstonclark06.aircraftperformance.validation.Validation;

/** Represents a Cessna 172S weight and balance profile. */
public class Cessna172SWeightAndBalance implements WeightAndBalance {
  private final double takeoffWeight;

  /**
   * Creates a Cessna172SWeightAndBalance.
   *
   * @param takeoffWeight the takeoff weight, in pounds
   * @throws IllegalArgumentException if {@code takeoffWeight} is not positive and finite
   */
  public Cessna172SWeightAndBalance(double takeoffWeight) {
    this.takeoffWeight = Validation.requirePositiveFinite(takeoffWeight, "takeoffWeight");
  }

  /**
   * Gets the takeoff weight.
   *
   * @return the takeoff weight, in pounds
   */
  public double getTakeoffWeight() {
    return this.takeoffWeight;
  }
}
