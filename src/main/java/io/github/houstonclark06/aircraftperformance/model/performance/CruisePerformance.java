package io.github.houstonclark06.aircraftperformance.model.performance;

/**
 * Represents a specific cruise performance.
 *
 * @param brakeHorsepowerPercent the engine power output, as a percentage of rated brake horsepower
 * @param trueAirspeedKt the true airspeed, in knots
 * @param fuelFlowGph the fuel flow, in gallons per hour
 */
record CruisePerformance(
    double brakeHorsepowerPercent, double trueAirspeedKt, double fuelFlowGph) {}
