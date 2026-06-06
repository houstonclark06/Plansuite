package io.github.houstonclark06.aircraftperformance.model.aircraft;

import io.github.houstonclark06.aircraftperformance.model.weightandbalance.Cessna172SWeightAndBalance;
import java.util.Objects;

/** Represents a Cessna 172S aircraft. */
public class Cessna172S extends Aircraft {
  private final Cessna172SWeightAndBalance weightAndBalanceProfile;

  public Cessna172S(String tailNumber, Cessna172SWeightAndBalance weightAndBalanceProfile) {
    super(tailNumber);

    this.weightAndBalanceProfile =
        Objects.requireNonNull(weightAndBalanceProfile, "weightAndBalanceProfile cannot be null");
  }

  public Cessna172SWeightAndBalance getWeightAndBalanceProfile() {
    return this.weightAndBalanceProfile;
  }
}
