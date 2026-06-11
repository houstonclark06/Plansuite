package io.github.houstonclark06.aircraftperformance.model.navigationpoint;

import io.github.houstonclark06.aircraftperformance.validation.Validation;

/** Represents a generic navigable point on a pilot map. */
public abstract class NavigationPoint {
  private final String label;

  /**
   * Creates a NavigationPoint.
   *
   * @param label the label of the NavigationPoint
   * @throws IllegalArgumentException if {@code label} is null or blank
   */
  public NavigationPoint(String label) {
    Validation.requireNonBlank(label, "label");
    this.label = label.strip();
  }

  /**
   * Gets the label.
   *
   * @return the label of the NavigationPoint
   */
  public String getLabel() {
    return label;
  }
}
