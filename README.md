# Ch. 5 Challenge 1: Landing Zone

## Mission Briefing

Our rockets are coming back down wherever they happen to land, and Mission Control is worried one will land on someone. Your program asks for the length and width of the area where rockets have been landing, in feet, centered on the launch pad. It then reports the area that must be kept clear. The calculating and displaying happen in a method that `main` calls.

## What You'll Practice

- Writing a `void` method with two parameters (Day 1 notes, P2)
- Calling a method and passing variables as arguments (Day 1 notes, P1)
- A variable declared inside a method to hold a result
- `Scanner` input with `nextDouble()`, and `System.exit(0)` to close the program

## Starter Code

Edit `src/LandingZone.java`. The class is `LandingZone`. Do not rename the file or the class.

The comments in `main` list the steps in order. Below `main`, the documentation comment for `displayData` is already written; write the method under it. The statement that prints the results is in a comment inside the starter: copy it into your method without the `//` marks.

## Inputs

| Order | What it is | Java type |
|---|---|---|
| 1 | The landing zone's length in feet | `double` |
| 2 | The landing zone's width in feet | `double` |

## Rules

### 1. The area

The area is the length times the width:

```
area = length * width
```

### 2. Where the work happens

`main` reads both values, then calls `displayData` once, passing the length and the width **in that order**. `displayData` calculates the area, stores it in a variable inside the method, and prints all three values. It does not send anything back to `main`.

### 3. Closing the program

After the results print, close the program with `System.exit(0);`.

## What to Use

These are suggestions. Any approach that produces the correct output earns full credit, as long as it passes the three source checks (see How It's Checked).

- The method header: `public static void displayData(double length, double width)`. Each parameter has its own type (P2 pattern).
- The call in `main`: `displayData(length, width);`, with the two variables as arguments (P1 pattern).
- Inside the method: `double area = length * width;`, then the `println` statement from the starter.

## Exact Output

Spelling, capitalization, and punctuation must match. Spacing around the `=` signs can differ slightly. Each prompt is printed on its own line; the user types on the next line.

First prompt:

```
Enter the landing zone's length in feet:
```

Second prompt:

```
Enter the landing zone's width in feet:
```

Results, after both values have been entered:

```
The Landing zone's dimensions are as follows:
Length  = [length]
Width = [width]
Area  = [area]
```

All three values print as `double` values, so a length of `5` prints as `5.0`.

## Sample Runs

```text
Enter the landing zone's length in feet:
5
Enter the landing zone's width in feet:
3
The Landing zone's dimensions are as follows:
Length  = 5.0
Width = 3.0
Area  = 15.0
```

```text
Enter the landing zone's length in feet:
12.5
Enter the landing zone's width in feet:
8
The Landing zone's dimensions are as follows:
Length  = 12.5
Width = 8.0
Area  = 100.0
```

## Test Your Program

Run each test before you submit. The autograder uses these and other values.

| Length | Width | Area line |
|---|---|---|
| `5` | `3` | `Area  = 15.0` |
| `42` | `13` | `Area  = 546.0` |
| `1850` | `3650` | `Area  = 6752500.0` |
| `12.5` | `8` | `Area  = 100.0` |

## How It's Checked

| Check | What it looks for | Points |
|---|---|---|
| Prompts | Both prompts appear | 3 |
| 5 by 3 | `Length = 5.0`, `Width = 3.0`, `Area = 15.0` | 5 |
| 42 by 13 | `Length = 42.0`, `Width = 13.0`, `Area = 546.0` | 5 |
| 1850 by 3650 | `Length = 1850.0`, `Width = 3650.0`, `Area = 6752500.0` | 6 |
| Uses a `Scanner` | The source code creates a `Scanner` with `System.in` | 1 |
| `displayData` method | The source code declares `void displayData` with two `double` parameters | 3 |
| Closes the program | The source code calls `System.exit(0);` | 2 |
| **Total** | | **25** |

Any approach that produces the correct output earns full credit, as long as it passes the three source checks. Results must come from the user's input; the tests use sizes you have not seen.

## Where to Look

- Day 1 notes, M1 (Header, body, and call): how a method is written and called.
- Day 1 notes, P1 (Three kinds of argument) and P2 (Two parameters): passing variables, and why the order matters.
- Rule 2 above: which method does which job.
