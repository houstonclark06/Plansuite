package io.github.houstonclark06.aircraftperformance.model.performance;

/**
 * Represents a specific short field landing distance.
 *
 * @param landingGroundRollFt the landing ground roll, in feet
 * @param landingDistanceOver50ftObstacleFt the landing distance over a 50-foot obstacle, in feet
 */
record ShortFieldLandingDistance(
    double landingGroundRollFt, double landingDistanceOver50ftObstacleFt) {}
