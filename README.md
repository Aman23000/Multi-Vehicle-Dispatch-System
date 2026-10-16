# Multi-Vehicle Dispatch System

Java implementation of the **Adapter Pattern** — bridges legacy USB-based customer data retrieval to a modern HTTPS interface, enabling unified access to customer records across two incompatible systems.

[![Java](https://img.shields.io/badge/Java-11+-ED8B00?style=flat&logo=java)](https://adoptium.net/)
[![Maven](https://img.shields.io/badge/Maven-3.6+-C71A36?style=flat&logo=apachemaven)](https://maven.apache.org/)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)

## Overview

Legacy systems often expose data through proprietary interfaces incompatible with modern APIs. This project solves that problem using the **Adapter (Wrapper) Pattern**: a `CustomerDataUsbAdapter` wraps the old USB retrieval logic and exposes the same interface as the new HTTPS-based system, so clients need no knowledge of the underlying source.

## Design Pattern — Adapter

| Role | Class |
|---|---|
| Target interface | `CustomerDataHttps` |
| Adaptee (legacy) | `CustomerDataUsb` |
| Adapter | `CustomerDataUsbAdapter` |
| Client | `Main` |
| Repository | `CustomerRepository` |

The adapter delegates all calls to the legacy USB object, transparently converting its output to the HTTPS contract.

## Project Structure

```
src/main/java/edu/bu/met/
├── Main.java                    # Entry point & demo
├── adapter/
│   └── CustomerDataUsbAdapter.java
├── data/                        # HTTPS & USB data source implementations
├── repository/                  # CustomerRepository — unified data access
└── mock/                        # Mock data for testing
```

## Prerequisites

- Java 11+
- Maven 3.6+

## Build & Run

```bash
mvn clean package
java -jar target/*.jar
```

## Run Tests

```bash
mvn test
```