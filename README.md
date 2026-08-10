# Ch. 5 Challenge 1: Landing Zone

We need some help calculating some landing zones. Our rockets are going up and just coming down wherever. We're really worried that one is going to land on someone. We need you to write a program that asks the user to enter the length and width of the area where rockets have been landing, in feet, centered on the launch pad. The program should then calculate the area that needs to be kept clear so that no rockets land on anyone.

## What You Will Build

A program that:

1. Asks the user for the landing zone's length in feet.
2. Asks the user for the landing zone's width in feet.
3. Calculates the area of the landing zone.
4. Displays the length, width, and area to the user.
5. Closes the program.

## Required Methods

The program should use the following methods, which have not been written yet:

- **getLength** - Asks the user to enter the length of the landing zone in feet and returns that value as a `double`.
- **getWidth** - Asks the user to enter the width of the landing zone in feet and returns that value as a `double`.
- **getArea** - Accepts the landing zone's length and width as arguments and returns the total area of the landing zone.
- **displayData** - Accepts the landing zone's length, width, and area as arguments and displays them in a message on the screen. This method has already been written for you.

## Java Concepts You Will Use

- `Scanner` for reading user input.
- Methods that accept parameters and return values.
- `double` variables.
- Multiplication to calculate area.
- `System.exit()` to close the program.

## Required Input Prompts

Your program must display these exact prompts before reading each value:

```
Enter the landing zone's length in feet:
Enter the landing zone's width in feet:
```

## Area Calculation

```
area = length * width
```

## Required Output

After the length and width have been entered, calculate the area and display all three values using the `displayData` method, which has already been written for you. The values passed into `displayData` must come from the variables holding the user's input and the calculated area - not values typed directly into a message.

For example, if the user enters a length of `5` and a width of `3`, the output will look like this:

```
The Landing zone's dimensions are as follows:
Length  = 5.0
Width = 3.0
Area  = 15.0
```

Your length, width, and area values will change based on what the user enters - minor spacing differences are fine, but the wording and the order of the values shown above will not change.

## Closing the Program

After the results are displayed, close the program using `System.exit(0);`.
