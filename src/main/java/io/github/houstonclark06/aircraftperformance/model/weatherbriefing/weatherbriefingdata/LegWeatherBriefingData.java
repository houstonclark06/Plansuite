package io.github.houstonclark06.aircraftperformance.model.weatherbriefing.weatherbriefingdata;

/** Represents weatherbriefingdata that applies to a Leg. */
public final record LegWeatherBriefingData() implements FlightPortionWeatherBriefingData {

  /** Represents a mutable draft for LegWeatherBriefingData, based on the Java builder pattern. */
  public static final class LegWeatherBriefingDataDraft
      implements FlightPortionWeatherBriefingDataDraft {

    /** Creates a LegWeatherBriefingDataDraft. */
    public LegWeatherBriefingDataDraft() {}

    /**
     * Builds the LegWeatherBriefingData according to Java builder pattern.
     *
     * @return the built LegWeatherBriefingData
     */
    public LegWeatherBriefingData build() {
      // TODO: Validate that data is present and valid.

      return new LegWeatherBriefingData();
    }
  }
}
