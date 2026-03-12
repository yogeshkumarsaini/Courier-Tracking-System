# Courier Tracking System

A console-based **Courier Tracking System** built using Java and Object-Oriented Programming concepts.
This project allows administrators to manage parcel bookings, track delivery status, calculate shipping costs automatically, and generate invoices.

---

## Features

* 📦 Parcel booking system
* 📍 Automatic **branch-to-branch distance calculation**
* ⚖ Parcel **weight-based shipping cost**
* 🚚 **Standard and Express shipping categories**
* 🔍 Parcel tracking using **Tracking ID**
* 📄 **Invoice generator**
* 🔄 Parcel **status updates** (Booked, In Transit, Out for Delivery, Delivered)
* 📊 View all parcel records
* 🏢 Multiple courier branches support

---

## Project Structure

```
CourierTrackingSystem/
│
├── Main.java
├── Parcel.java
├── CourierService.java
├── DistanceService.java
└── PriceCalculator.java
```

### File Description

| File                     | Description                                                       |
| ------------------------ | ----------------------------------------------------------------- |
| **Main.java**            | Entry point of the program and menu system                        |
| **Parcel.java**          | Parcel model class containing parcel data                         |
| **CourierService.java**  | Handles booking, tracking, status updates, and invoice generation |
| **DistanceService.java** | Calculates distance between courier branches                      |
| **PriceCalculator.java** | Calculates shipping price based on distance, weight, and category |

---

## Technologies Used

* Java
* Object-Oriented Programming (OOP)
* Collections Framework (ArrayList, HashMap)
* Console-based interface

---

## How to Run the Project

### 1. Clone the repository

```bash
git clone https://github.com/yogeshkumarsaini/courier-tracking-system.git
```

### 2. Navigate to the project folder

```bash
cd courier-tracking-system
```

### 3. Compile the project

```bash
javac *.java
```

### 4. Run the program

```bash
java Main
```

---

## Example Workflow

1. Book a new parcel
2. System automatically calculates delivery distance
3. Shipping price is calculated using parcel weight and category
4. Parcel is assigned a unique **Tracking ID**
5. Admin can track parcel status
6. Invoice can be generated for the shipment

---

## Example Invoice Output

```
===== COURIER INVOICE =====
Tracking ID : 1001
Sender      : Rahul
Receiver    : Aman
Route       : Delhi -> Jaipur
Weight      : 2.5 kg
Category    : Express
Distance    : 280 km
Total Price : ₹1650
===========================
```

---

## Learning Objectives

This project demonstrates:

* Object-Oriented Programming
* Java Collections
* Modular project structure
* Real-world logistics system simulation

---

## Future Improvements

* File handling to save parcel data
* GUI interface using Java Swing / JavaFX
* Database integration (MySQL)
* Customer login system
* Delivery time estimation

---

## Author

**Yogesh Kumar Saini**

---

## License

This project is open-source and available for educational use.
