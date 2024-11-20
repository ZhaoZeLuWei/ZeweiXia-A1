# OOP-ZeweiXia-A1
 SCU OOP Assignment1
# Appointment Management System

This project implements an **Appointment Management System** in Java, leveraging `ArrayList` and object-oriented programming to handle the creation, management, and cancellation of medical appointments.

## Features

- **Create Appointments**: Add new appointments with patient details, date and time, and a health professional.
- **View Appointments**: List all existing appointments or notify users if none are available.
- **Cancel Appointments**: Remove appointments using the patient's phone number.
- **Robust Data Validation**: Ensure input correctness for patient details, dates, and associated health professionals.
- **Object-Oriented Design**: Employ encapsulation and polymorphism for flexible and maintainable code.

## Key Classes

### `Appointment`

- Stores details of an appointment, including:
  - Patient Name
  - Patient Phone Number
  - Appointment Date and Time
  - Associated `HealthProfessional`
- Provides:
  - Getters and setters with validation.
  - A `toString` method for easy display and debugging.

### `HealthProfessional`

- Abstract base class for various health professional types, such as:
  - General Practitioners
  - Other Health Professionals

### Management Methods

- **`creatAppointment`**: Creates and adds a new appointment to the system.
- **`printExistingAppointments`**: Lists all appointments or displays a message if none exist.
- **`cancelBooking`**: Cancels an appointment based on the patient's phone number.

## Example Usage

```java
creatAppointment("John Doe", "123456789", LocalDateTime.of(2024, 11, 25, 15, 0), new GeneralPractitioner());
printExistingAppointments();
cancelBooking("123456789");
