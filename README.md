#BusApp

Bus Class:
Manages the user inputs for distance, age, travel type, and seat number using a Scanner.
Calculates the cost of the trip based on the given inputs.
Provides a method to display the bill with the details of the journey and the calculated cost.

Main Class:
Acts as the entry point for the bus reservation system.
Creates an instance of the Bus class, gets user information, calculates the cost, and displays the bill.
The calculate method uses certain criteria to determine the cost, such as:
-Differentiating between single and double seats with a 20% higher cost for single seats.
-Considering round trips as double the distance and applying a discount of 20% on the cost.
-Offering discounts based on age brackets: 50% off for children under 12, a 10% discount for ages 12-24, and a 30% discount for ages over 65.

This system is a basic representation of a bus reservation system, enabling users to input their details and receive the calculated cost based on various parameters.
