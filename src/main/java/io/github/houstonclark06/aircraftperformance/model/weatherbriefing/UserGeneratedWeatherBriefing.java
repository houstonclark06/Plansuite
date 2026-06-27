package io.github.houstonclark06.aircraftperformance.model.weatherbriefing;

import io.github.houstonclark06.aircraftperformance.model.flight.Flight;
import io.github.houstonclark06.aircraftperformance.model.flight.Leg;
import io.github.houstonclark06.aircraftperformance.model.flightportion.FlightPortion;
import io.github.houstonclark06.aircraftperformance.model.weatherbriefing.weatherbriefingdata.AirportWeatherBriefingData.AirportWeatherBriefingDataDraft;
import io.github.houstonclark06.aircraftperformance.model.weatherbriefing.weatherbriefingdata.FlightPortionWeatherBriefingDataDraft;
import io.github.houstonclark06.aircraftperformance.model.weatherbriefing.weatherbriefingdata.FlightWeatherBriefingData.FlightWeatherBriefingDataDraft;
import io.github.houstonclark06.aircraftperformance.model.weatherbriefing.weatherbriefingdata.LegWeatherBriefingData.LegWeatherBriefingDataDraft;
import java.time.Clock;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Objects;

/** Represents a weather briefing entered manually by user. */
class UserGeneratedWeatherBriefing extends WeatherBriefing {
  UserGeneratedWeatherBriefing(UserGeneratedWeatherBriefingDraft draft) {
    super(draft.clock, draft.flight);
  }

  static class UserGeneratedWeatherBriefingDraft {
    private final Clock clock;
    private final Flight flight;

    private final FlightWeatherBriefingDataDraft flightWeatherBriefingDataDraft;

    private final LinkedHashMap<FlightPortion, FlightPortionWeatherBriefingDataDraft>
        routeWeatherBriefingDataDrafts;

    UserGeneratedWeatherBriefingDraft(Clock clock, Flight flight) {
      this.clock = Objects.requireNonNull(clock);
      this.flight = Objects.requireNonNull(flight);

      this.flightWeatherBriefingDataDraft = new FlightWeatherBriefingDataDraft();

      /* TODO: Find a more sophisticated way to do this. Find a better way to link FlightPortion types to their briefings. */
      this.routeWeatherBriefingDataDrafts =
          new LinkedHashMap<FlightPortion, FlightPortionWeatherBriefingDataDraft>();

      // Add departure
      this.routeWeatherBriefingDataDrafts.put(
          this.flight.getDeparture(), new AirportWeatherBriefingDataDraft());

      // Add enroute
      Iterator<Leg> flightLegsIterator = this.flight.getLegs().iterator();
      Leg currentLeg;
      while (flightLegsIterator.hasNext()) {
        currentLeg = flightLegsIterator.next();
        this.routeWeatherBriefingDataDrafts.put(currentLeg, new LegWeatherBriefingDataDraft());
      }

      // Add destination
      this.routeWeatherBriefingDataDrafts.put(
          this.flight.getDestination(), new AirportWeatherBriefingDataDraft());
    }
  }
}
