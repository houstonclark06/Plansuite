package io.github.houstonclark06.aircraftperformance.model.performance;

record TimeFuelAndDistanceToClimb(
    double climbSpeedKias,
    double rateOfClimbFpm,
    double elapsedTimeFromSeaLevelMin,
    double fuelUsedFromSeaLevelGal,
    double groundDistanceFromSeaLevelNm) {}
