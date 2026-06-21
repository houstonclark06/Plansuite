package io.github.houstonclark06.aircraftperformance.model.flight;

import io.github.houstonclark06.aircraftperformance.model.airport.Airport;
import io.github.houstonclark06.aircraftperformance.model.navigationpoint.NavigationPoint;
import io.github.houstonclark06.aircraftperformance.model.weatherbriefing.WeatherBriefing;
import io.github.houstonclark06.aircraftperformance.validation.Validation;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Optional;

/** Represents a flight between two airports. */
public class Flight {
  private final Airport departure;

  // The route is made up of NavigationPoints and Legs.
  private final LinkedList<NavigationPoint> enrouteNavigationPoints;
  private final LinkedList<Leg> legs;

  private final Airport destination;

  private final LinkedHashMap<String, Airport> alternateAirports;

  private WeatherBriefing briefing;

  /** Private constructor for flight, supports FlightDraft based on Java builder pattern. */
  private Flight(FlightDraft draft) {
    Objects.requireNonNull(draft);

    this.departure = draft.departure;

    this.enrouteNavigationPoints = new LinkedList<NavigationPoint>(draft.enrouteNavigationPoints);

    // Generate legs.
    this.legs = new LinkedList<Leg>();
    LinkedList<NavigationPoint> allNavigationPoints =
        new LinkedList<NavigationPoint>(draft.enrouteNavigationPoints);
    allNavigationPoints.addFirst(draft.departure);
    allNavigationPoints.addLast(draft.destination);
    ListIterator<NavigationPoint> iterator = allNavigationPoints.listIterator();
    NavigationPoint thisPoint;
    NavigationPoint nextPoint = iterator.next();
    do {
      thisPoint = nextPoint;
      nextPoint = iterator.next();
      legs.add(new Leg(thisPoint, nextPoint));
    } while (iterator.hasNext());

    this.destination = draft.destination;
    this.alternateAirports = new LinkedHashMap<String, Airport>(draft.alternateAirports);
  }

  /** Represents a mutable draft for a Flight, based on the Java builder pattern. */
  public static class FlightDraft {
    private final Airport departure;
    private final LinkedList<NavigationPoint> enrouteNavigationPoints;
    private final Airport destination;
    private final LinkedHashMap<String, Airport> alternateAirports;

    /**
     * Creates a FlightDraft.
     *
     * @param departure the departure Airport
     * @param destination the destination Airport
     * @throws NullPointerException if {@code departure == null}
     * @throws NullPointerException if {@code destination == null}
     */
    public FlightDraft(Airport departure, Airport destination) {
      this.departure = Objects.requireNonNull(departure);
      this.enrouteNavigationPoints = new LinkedList<NavigationPoint>();
      this.destination = Objects.requireNonNull(destination);
      this.alternateAirports = new LinkedHashMap<String, Airport>();
    }

    /**
     * Adds a NavigationPoint at a given index. The index refers to position within the list of
     * enroute navigation points, which is supported by and indexed according to java.List.
     *
     * @param index the index to insert {@code newPoint}
     * @param newPoint the new NavigationPoint to be added
     * @throws NullPointerException if {@code newPoint == null}
     * @throws IndexOutOfBoundsException if {@code index} is negative or greater than the number of
     *     enroute navigation points
     */
    public void addEnrouteNavigationPointAt(int index, NavigationPoint newPoint) {
      if (index < 0 || index > enrouteNavigationPoints.size()) {
        throw new IndexOutOfBoundsException(
            "index must be between 0 and the number of enroute navigation points.");
      }
      enrouteNavigationPoints.add(index, Objects.requireNonNull(newPoint));
    }

    /**
     * Removes a NavigationPoint at a known index.
     *
     * @param index the index of the point to remove
     * @throws IndexOutOfBoundsException if {@code index} is negative or greater than or equal to
     *     the number of enroute navigation points
     */
    public void removeEnrouteNavigationPoint(int index) {
      Objects.checkIndex(index, enrouteNavigationPoints.size());
      enrouteNavigationPoints.remove(index);
    }

    /**
     * Adds an alternate airport.
     *
     * @param alternateAirport the alternate airport to add
     * @throws NullPointerException if {@code alternateAirport == null}
     * @throws IllegalArgumentException if {@code alternateAirport} is already added
     */
    public void addAlternateAirport(Airport alternateAirport) {
      Objects.requireNonNull(alternateAirport);
      if (alternateAirports.get(alternateAirport.getLabel()) == null) {
        alternateAirports.put(alternateAirport.getLabel(), alternateAirport);
      } else {
        throw new IllegalArgumentException(
            "alternateAirport is already added, duplicates are not permitted.");
      }
    }

    /**
     * Removes an alternate airport.
     *
     * @param labelOfAlternateAirport the label of the alternate airport to remove
     * @throws IllegalArgumentException if {@code labelOfAlternateAirport} is null, blank, or does
     *     not match a valid alternate airport
     */
    public void removeAlternateAirport(String labelOfAlternateAirport) {
      Validation.requireNonBlank(labelOfAlternateAirport, "labelOfAlternateAirport");
      if (alternateAirports.remove(labelOfAlternateAirport) == null) {
        throw new IllegalArgumentException(
            "labelOfAlternateAirport does not match a valid alternate airport.");
      }
    }

    /**
     * Builds the flight according to Java builder pattern.
     *
     * @return the built Flight
     */
    public Flight build() {
      return new Flight(this);
    }
  }

  /**
   * Sets the weather briefing.
   *
   * @param briefing the new briefing
   * @throws NullPointerException if {@code briefing == null}
   */
  public void setWeatherBriefing(WeatherBriefing briefing) {
    this.briefing = Objects.requireNonNull(briefing);
  }

  /**
   * Gets the briefing.
   *
   * @return an Optional containing the current weather briefing, or an empty Optional if no
   *     briefing has been generated or attached to the flight plan
   */
  public Optional<WeatherBriefing> getWeatherBriefing() {
    return Optional.ofNullable(this.briefing);
  }
}
