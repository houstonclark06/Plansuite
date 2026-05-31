package io.github.houstonclark06.aircraftperformance.model.performance;

public record TimeFuelAndDistanceToClimb(
    double climbSpeedKias,
    double rateOfClimbFpm,
    double elapsedTimeFromSeaLevelMin,
    double fuelUsedFromSeaLevelGal,
    double groundDistanceFromSeaLevelNm) {}
