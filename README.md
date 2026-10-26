# Mukono Hospital Medical Staff Management System

A robust Java-based Object-Oriented Programming (OOP) solution designed to manage diverse medical personnel at Mukono Hospital, including doctors, nurses, pharmacists, and laboratory technicians. 

This project demonstrates core OOP principles—specifically **abstraction**, **inheritance**, and **polymorphism**—to ensure code organization, consistency, and extensibility in healthcare software systems.

---

## Key Features & Requirements Addressed

1. **Generalized Parent Structure:** Encapsulates shared attributes (`employeeId`, `department`, `workingHours`) and reporting methods (`displayBaseDetails`) within an abstract base class to eliminate code duplication.
2. **Prevention of Undefined Generic Instantiation:** Declares the base class as `abstract`, ensuring the compiler strictly blocks the creation of generic, undefined medical staff objects.
3. **Specialized Patient-Care Responsibilities:** Enforces a mandatory contract via abstract methods (`performDuties()`), requiring every subclass to implement its own unique clinical duties.
4. **Polymorphic Execution:** Processes different medical staff roles uniformly using a single base-type array and runtime method dispatch.

---

## Project Structure

```text
├── MedicalStaff.java         # Abstract base class modeling common employee features
├── Doctor.java               # Subclass handling clinical diagnostics and treatments
├── Nurse.java                # Subclass handling shift schedules and bedside care
├── Pharmacist.java           # Subclass handling prescriptions and inventory
├── LabTechnician.java        # Subclass handling specimen collection and lab tests
└── MukonoHospitalSystem.java # Main execution and polymorphism testing harness
