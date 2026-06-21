# Tools

Utility scripts used for development workflows and data preparation.

---

## convert_csv_to_json.py

Converts raw aircraft performance CSV tables into JSON files.

### Input

```text
data/raw/*.csv
```

### Output

```text
src/main/resources/pohperformancedata/cessna172s/*.json
```

### Purpose

The generated JSON files are intended for use as application runtime
resources within the performance calculation system.

Raw CSV files remain the editable source-of-truth format.
