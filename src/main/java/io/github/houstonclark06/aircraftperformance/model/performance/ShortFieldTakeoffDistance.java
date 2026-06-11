package io.github.houstonclark06.aircraftperformance.model.performance;

/**
 * Represents a specific short field takeoff distance.
 *
 * @param takeoffGroundRollFt the takeoff ground roll, in feet
 * @param takeoffDistanceOver50ftObstacleFt the takeoff distance over a 50-foot obstacle, in feet
 */
public record ShortFieldTakeoffDistance(
    double takeoffGroundRollFt, double takeoffDistanceOver50ftObstacleFt) {}
