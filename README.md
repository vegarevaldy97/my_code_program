#Problem Solving Case (Scenario)

I own a parking lot that can hold up to 'n' cars at any given point in time. Each slot is given a number starting at 1 increasing with increasing distance from the entry point in steps of one. I want to create an automated ticketing system that allows my customers to use my parking lot without human intervention.

When a car enters my parking lot, I want to have a ticket issued to the driver. The ticket issuing process includes us documenting the registration number (number plate) and the colour of the car and allocating an available parking slot to the car before actually handing over a ticket to the driver (we assume that our customers are nice enough to always park in the slots allocated to them). The customer should be allocated a parking slot which is nearest to the entry.

At the exit the customer returns the ticket with the time the car was parked in the lot, which then marks the slot they were using as being available. Total parking charge should be calculated as per the parking time. Charge applicable is $10 for first 2 hours and $10 for every additional hour.

We interact with the system via a simple set of commands prompt which produce a specific output. Please take a look at the example below, which includes all the commands you need to support - they're self explanatory. The system should allow input in two ways. Just to clarify, the same codebase should support both modes of input - we don't want two distinct submissions.


###Example: File Input

Input :

create_parking_lot 6

park KA-01-HH-1234 White

park KA-01-HH-9999 Black

park KA-01-BB-0001 Blue

park KA-01-HH-7777 Green

park KA-01-HH-2701 White

park KA-01-HH-3141 Black

leave KA-01-HH-3141 4

status

park KA-01-P-333 White

park DL-12-AA-9999 White

leave KA-01-HH-1234 4

leave KA-01-BB-0001 6

leave DL-12-AA-9999 2

park KA-09-HH-0987 White

park CA-09-IO-1111 Blue

park KA-09-HH-0123 Black

status


Output:

Created a parking lot with 6 slots

Allocated slot number: 1

Allocated slot number: 2

Allocated slot number: 3

Allocated slot number: 4

Allocated slot number: 5

Allocated slot number: 6

Registration number KA-01-HH-3141 Black with Slot number 6 is free with Charge 30

Slot No. Registration No Colour

1 KA-01-HH-1234 White

2 KA-01-HH-9999 Black

3 KA-01-BB-0001 Blue

4 KA-01-HH-7777 Green

5 KA-01-HH-2701 White

Allocated slot number: 6

Sorry, parking lot is full

Registration number KA-01-HH-1234 White with Slot number 1 is free with Charge 30

Registration number KA-01-BB-0001 Blue with Slot number 3 is free with Charge 50

Registration number DL-12-AA-9999 not found

Allocated slot number: 1

Allocated slot number: 3

Sorry, parking lot is full

Slot No. Registration No Colour

1 KA-09-HH-0987 white

2 KA-01-HH-9999 Black

3 park CA-09-IO-1111 Blue

4 KA-01-HH-7777 Green

5 KA-01-HH-2701 White


#Project Requirements

1. Latest version of JDK.
2. Latest version of maven.


#Running the project
1. Open IntelliJ IDEA
2. Click File -> New -> Project from version control -> Copy the url in this site -> Clone
3. Import build script when notification found
4. Run the program
5. Input data like an example