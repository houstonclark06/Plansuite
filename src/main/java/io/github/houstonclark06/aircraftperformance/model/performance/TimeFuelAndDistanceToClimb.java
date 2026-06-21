package io.github.houstonclark06.aircraftperformance.model.performance;

/**
 * Represents a specific time, fuel, and distance to climb.
 *
 * @param climbSpeedKias the climb speed, in knots indicated airspeed
 * @param rateOfClimbFpm the rate of climb, in feet per minute
 * @param elapsedTimeFromSeaLevelMin the elapsed climb time from sea level, in minutes
 * @param fuelUsedFromSeaLevelGal the fuel used from sea level, in gallons
 * @param groundDistanceFromSeaLevelNm the ground distance from sea level, in nautical miles
 */
record TimeFuelAndDistanceToClimb(
    double climbSpeedKias,
    double rateOfClimbFpm,
    double elapsedTimeFromSeaLevelMin,
    double fuelUsedFromSeaLevelGal,
    double groundDistanceFromSeaLevelNm) {}
