# Aircraft Performance

Aircraft Performance is a Java project for aircraft performance calculations. It uses POH tables and interpolation to calculate important flight data. 

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

## Data Format

Aircraft performance data is stored in JSON format.

## Data Sources

Performance data is derived from Cessna 172S Pilot's Operating Handbook performance tables for development and educational purposes.

## Tech Stack

- Java 21
- Maven
- Jackson (JSON processing)
- Logback (logging)
- JUnit 5

## Development Tools

- Spotless (code formatting)
- Google Java Format
- Maven Enforcer Plugin
- Codex (OpenAI)
- ChatGPT (OpenAI)

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

Run tests and formatting checks:

```bash
mvn verify
```

## Disclaimer

This software is not FAA-approved and must not be used as the sole source for flight planning or operational decisions.

Always verify calculations using the official aircraft POH.

## Acknowledgements

OpenAI tools assisted with validation utility scaffolding, portions of unit test generation, debugging, documentation review, and project organization feedback. The core design, package structure, domain model, and performance calculation approach are the author’s own work.

## License

This project is licensed under the MIT License.
