package io.github.houstonclark06.aircraftperformance.model.aircraft;

import io.github.houstonclark06.aircraftperformance.model.weightandbalance.Cessna172SWeightAndBalance;
import java.util.Objects;

/** Represents a Cessna 172S aircraft. */
public class Cessna172S extends Aircraft {
  private final Cessna172SWeightAndBalance weightAndBalanceProfile;

  /**
   * Creates a Cessna172S.
   *
   * @param tailNumber the tail number
   * @param weightAndBalanceProfile the weight and balance profile
   * @throws NullPointerException if {@code weightAndBalanceProfile == null}
   */
  public Cessna172S(String tailNumber, Cessna172SWeightAndBalance weightAndBalanceProfile) {
    super(tailNumber);

    this.weightAndBalanceProfile =
        Objects.requireNonNull(weightAndBalanceProfile, "weightAndBalanceProfile cannot be null");
  }

  /**
   * Returns the weight and balance profile.
   *
   * @return the weight and balance profile of the Cessna172S
   */
  public Cessna172SWeightAndBalance getWeightAndBalanceProfile() {
    return this.weightAndBalanceProfile;
  }
}
