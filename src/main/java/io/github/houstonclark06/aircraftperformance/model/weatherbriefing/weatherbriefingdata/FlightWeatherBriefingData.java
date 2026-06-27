package io.github.houstonclark06.aircraftperformance.model.weatherbriefing.weatherbriefingdata;

/** Represents weatherbriefingdata that applies to an entire Flight. */
public final record FlightWeatherBriefingData() {

  /**
   * Represents a mutable draft for FlightWeatherBriefingData, based on the Java builder pattern.
   */
  public static class FlightWeatherBriefingDataDraft {

    /** Creates a FlightWeatherBriefingDataDraft. */
    public FlightWeatherBriefingDataDraft() {}

    /**
     * Builds the FlightWeatherBriefingData according to Java builder pattern.
     *
     * @return the built FlightWeatherBriefingData
     */
    public FlightWeatherBriefingData build() {
      // TODO: Validate that data is present and valid.

      return new FlightWeatherBriefingData();
    }
  }
}
