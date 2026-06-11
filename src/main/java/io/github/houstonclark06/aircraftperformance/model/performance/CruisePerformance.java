package io.github.houstonclark06.aircraftperformance.model.performance;

/**
 * Represents a specific cruise performance.
 *
 * @param brakeHorsepowerPercent
 * @param trueAirspeedKt
 * @param fuelFlowGph
 */
record CruisePerformance(
    double brakeHorsepowerPercent, double trueAirspeedKt, double fuelFlowGph) {}
