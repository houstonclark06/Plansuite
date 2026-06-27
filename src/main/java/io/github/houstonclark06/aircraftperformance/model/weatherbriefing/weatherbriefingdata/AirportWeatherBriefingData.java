package io.github.houstonclark06.aircraftperformance.model.weatherbriefing.weatherbriefingdata;

/** Represents weatherbriefingdata that applies to an Airport. */
public final record AirportWeatherBriefingData() implements FlightPortionWeatherBriefingData {

  /**
   * Represents a mutable draft for AirportWeatherBriefingData, based on the Java builder pattern.
   */
  public static final class AirportWeatherBriefingDataDraft
      implements FlightPortionWeatherBriefingDataDraft {

    /** Creates a AirportWeatherBriefingDataDraft. */
    public AirportWeatherBriefingDataDraft() {}

    /**
     * Builds the AirportWeatherBriefingData according to Java builder pattern.
     *
     * @return the built AirportWeatherBriefingData
     */
    public AirportWeatherBriefingData build() {
      // TODO: Validate that data is present and valid.

      return new AirportWeatherBriefingData();
    }
  }
}
