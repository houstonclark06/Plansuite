"""
Convert CSV performance tables into JSON files.

Input:
    data/raw/*.csv

Output:
    data/converted/*.json

Initial utility scaffold generated with AI assistance and reviewed manually.
"""

import csv
import json
from pathlib import Path


RAW_DIR = Path("data/raw")
OUT_DIR = Path("data/converted")


def convert_value(value: str):
    value = value.strip()

    if value == "":
        return None

    try:
        return int(value)
    except ValueError:
        pass

    try:
        return float(value)
    except ValueError:
        return value


def convert_csv_file(csv_file: Path) -> None:
    rows = []

    with csv_file.open(newline="", encoding="utf-8") as file:
        reader = csv.DictReader(file)

        for row in reader:
            cleaned_row = {
                key.strip(): convert_value(value)
                for key, value in row.items()
            }

            rows.append(cleaned_row)

    output_file = OUT_DIR / f"{csv_file.stem}.json"

    with output_file.open("w", encoding="utf-8") as file:
        json.dump(rows, file, indent=2)

    print(f"Converted {csv_file} -> {output_file}")


def main() -> None:
    OUT_DIR.mkdir(parents=True, exist_ok=True)

    csv_files = sorted(RAW_DIR.glob("*.csv"))

    if not csv_files:
        raise FileNotFoundError(f"No CSV files found in {RAW_DIR}")

    for csv_file in csv_files:
        convert_csv_file(csv_file)

    print("Conversion complete.")


if __name__ == "__main__":
    main()
