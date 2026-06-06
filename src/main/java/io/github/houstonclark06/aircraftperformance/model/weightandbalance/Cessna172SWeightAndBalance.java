package io.github.houstonclark06.aircraftperformance.model.weightandbalance;

import io.github.houstonclark06.aircraftperformance.validation.Validation;

/** Represents a Cessna 172S weight and balance profile. */
public class Cessna172SWeightAndBalance implements WeightAndBalance {
  private final double takeoffWeight;

  public Cessna172SWeightAndBalance(double takeoffWeight) {
    this.takeoffWeight = Validation.requirePositiveFinite(takeoffWeight, "takeoffWeight");
  }

  public double getTakeoffWeight() {
    return this.takeoffWeight;
  }
}
