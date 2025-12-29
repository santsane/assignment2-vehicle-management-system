# Vehicle Management System - Assignment 2

## A. Project Overview
This project is about a Vehicle Management System for the OOP course. The purpose is to show how inheritance and abstract classes work. I made one main class for Vehicles and three other classes for Car, Motorcycle, and Truck. I also added a Driver class to show how a vehicle has a driver.

## B. Class Hierarchy
I organized the classes like this:

* **Vehicle (Abstract Superclass):** This is the top class. It is 'abstract' because we don't make a generic vehicle, only specific ones. It has 'brand' and 'year' fields. I used 'protected' so the children classes can see the variables.
* **Car, Motorcycle, and Truck (Subclasses):** These classes 'extend' the Vehicle class. They use 'super()' in their constructors to give the brand and year back to the parent.
* **Methods:** I overrode 'startEngine()' and 'stopEngine()' in every subclass so they print different messages.

## C. Instructions to Compile and Run
You need to have Java installed. Open the terminal in the 'src' folder and type:

1. Compile:
   'javac *.java'
2. Run:
   'java Main'

## D. Screenshots
Screenshots are in assignment2-vehicle-management-system\docs\screenshots


## E. Reflection Section
Inheritance helped me a lot because I didn't have to write 'brand' and 'year' in every class. I just wrote it once in Vehicle.java and all other classes got it for free. This makes the code shorter and easier to read.
