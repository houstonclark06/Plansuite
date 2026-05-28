# Aircraft Performance

Aircraft Performance is a Java project for aircraft performance calculations.

## Project Goals

This project is being developed to explore:
- desktop application development in Java
- integration of online aviation weather data

The long-term goal is to create a useful desktop app that can be deployed in general aviation FBOs and flight schools to assist with aircraft performance calculations for routine general aviation operations, thus increasing flight planning compliance and overall safety.

## Status

Early development.

## Current Functionality

- Linear interpolation utility
- Bilinear interpolation utility
- Unit tests for interpolation behavior and edge cases
- Initial project structure for Cessna 172S performance data processing

## Planned Features

- Performance calculations based on Cessna 172S aircraft POH
- Integration of data from Aviation Weather Center

## Data Sources

Performance data is derived from Cessna 172S Pilot's Operating Handbook performance tables for development and educational purposes.

## Project Structure
```text
aircraft-performance/
├── LICENSE
├── README.md
├── pom.xml
├── data
│   ├── converted
│   └── raw
├── docs
├── src
│   ├── main
│   │   ├── java
│   │   │   └── io/github/houstonclark06/aircraftperformance
│   │   │       └── interpolation
│   │   │           └── Interpolator.java
│   │   └── resources
│   └── test
│       ├── java
│       │   └── io/github/houstonclark06/aircraftperformance
│       │       └── interpolation
│       │           └── InterpolatorTest.java
│       └── resources
└── tools
```

## Tech Stack

- Java
- Maven
- Java Swing or JavaFX (depending on final GUI choice)

## Requirements

- Java 21 or newer
- Maven 3.9+

## Building and Testing

Build the project:

```bash
mvn clean install
```

Run tests:

```bash
mvn test
```

## Disclaimer

This software is not FAA-approved and must not be used as the sole source for flight planning or operational decisions.

Always verify calculations using the official aircraft POH.

## Acknowledgements

- Portions of this README file generated and edited by ChatGPT (OpenAI)
- Codex and ChatGPT (OpenAI) assistance used for portions of debugging, design suggestions, tests, Maven setup and Java documentation search

## License

This project is licensed under the MIT License.
