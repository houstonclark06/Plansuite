package io.github.houstonclark06.aircraftperformance.model.performance;

/**
 * Represents a specific short field landing distance.
 *
 * @param landingGroundRollFt
 * @param landingDistanceOver50ftObstacleFt
 */
record ShortFieldLandingDistance(
    double landingGroundRollFt, double landingDistanceOver50ftObstacleFt) {}
