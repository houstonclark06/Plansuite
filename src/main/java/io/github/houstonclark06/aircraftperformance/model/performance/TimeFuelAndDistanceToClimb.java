package io.github.houstonclark06.aircraftperformance.model.performance;

/**
 * Represents a specific time, fuel, and distance to climb.
 *
 * @param climbSpeedKias
 * @param rateOfClimbFpm
 * @param elapsedTimeFromSeaLevelMin
 * @param fuelUsedFromSeaLevelGal
 * @param groundDistanceFromSeaLevelNm
 */
record TimeFuelAndDistanceToClimb(
    double climbSpeedKias,
    double rateOfClimbFpm,
    double elapsedTimeFromSeaLevelMin,
    double fuelUsedFromSeaLevelGal,
    double groundDistanceFromSeaLevelNm) {}
