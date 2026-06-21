package io.github.houstonclark06.aircraftperformance.model.performance;

/**
 * Represents a specific maximum rate of climb.
 *
 * @param bestRateClimbSpeedKias the best-rate climb speed, in knots indicated airspeed
 * @param rateOfClimbFpm the rate of climb, in feet per minute
 */
record MaximumRateOfClimb(double bestRateClimbSpeedKias, double rateOfClimbFpm) {}
