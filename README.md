# Ch. 5 Challenge 1: Landing Zone

## Mission Briefing

Our rockets are coming back down wherever they happen to land, and Mission Control is worried one will land on someone. Before each landing, the zone has to be swept, measured, and marked with beacons. `main` is already written: it reads the zone's size and runs the report. Your job is to write the four methods it needs, and the call to each one.

## What You'll Practice

- Writing a method header: modifiers, return type, name, and parameter list (Day 1 notes, M1)
- Writing call statements, including one inside a loop (Day 1 notes, M1 and M2)
- Passing a variable as an argument (Day 1 notes, P1)
- Two parameters, matched by position (Day 1 notes, P2)
- Passing a `double` to an `int` parameter with a cast (Day 1 notes, P3)

## How This Challenge Works

Edit `src/LandingZone.java`. The class is `LandingZone`. Do not rename the file or the class.

The comments in the code are tagged:

| Tag | Meaning |
|---|---|
| `INFO:` | Background information. Nothing to do. |
| `GIVEN:` | Code that is already written. Don't change it. |
| `TODO n:` | Your work. Each TODO has two parts: `(method)` below `main`, and `(call)` inside `main`. |

Work one TODO at a time:

1. Write the method at `TODO n (method)`.
2. Write its call at `TODO n (call)`.
3. Run the program and compare your output to this README.

The program runs at every step, so you can test each method as soon as it's written. IntelliJ lists every TODO in its TODO window (**View > Tool Windows > TODO**).

## Inputs

The GIVEN code reads these. You don't need to write any input code.

| Order | What it is | Java type |
|---|---|---|
| 1 | The landing zone's length in feet | `double` |
| 2 | The landing zone's width in feet | `double` |

## Your TODOs

### TODO 1: showBanner

- **Header:** `public static`, return type `void`, named `showBanner`, no parameters
- **Body:** prints `=== Landing Zone Clearance Report ===`
- **Call:** at `TODO 1 (call)`, before the prompts, so the banner is the first line of output

<details>
<summary>Hint for TODO 1</summary>

Look at `showBriefing` in Day 1 notes, M1. It has the same shape as `showBanner`: no parameters, nothing sent back. A call statement is the method's name, its parentheses, and a semicolon. It never repeats `void` or the modifiers.

</details>

### TODO 2: showSweep

- **Header:** `public static`, return type `void`, named `showSweep`, one `int` parameter (the sweep number)
- **Body:** prints `Sweep [number] complete: zone clear.`
- **Call:** at `TODO 2 (call)`, inside the GIVEN loop, passing the loop variable `sweep`

<details>
<summary>Hint for TODO 2</summary>

A call is a statement, so a loop can repeat it (Day 1 notes, M2). Each time through the loop, `sweep` holds a different number. Pass the variable itself, the way `displayBurn(seconds)` does in P1. In the header, the parameter needs a data type and a name.

</details>

### TODO 3: displayData

- **Header:** `public static`, return type `void`, named `displayData`, two `double` parameters: the length first, then the width
- **Body:** calculates the area (length times width) and stores it in a local variable named `area`, then prints three lines:
  ```
  Length = [length] feet
  Width = [width] feet
  Area = [area] square feet
  ```
- **Call:** at `TODO 3 (call)`, passing `length` and `width`, in that order

<details>
<summary>Hint for TODO 3</summary>

Every parameter needs its own data type: `(int high, int low)`, never `(int high, low)` (Day 1 notes, P2). Arguments match parameters by position, not by name, so if your length and width come out swapped, check the order in your call.

</details>

### TODO 4: showBeacons

- **Header:** `public static`, return type `void`, named `showBeacons`, one `int` parameter (the number of beacons)
- **Body:** prints `Beacons needed: [number]`
- **Call:** at `TODO 4 (call)`, passing the GIVEN variable `beacons`

`beacons` is a `double`, but the parameter must stay an `int`. That's on purpose.

<details>
<summary>Hint for TODO 4</summary>

If IntelliJ shows `possible lossy conversion from double to int`, the call needs a cast. Passing a `double` to an `int` parameter is a narrowing conversion (Day 1 notes, P3). Look at how `showThrust` is called with `precise`. A cast drops the decimal part: `(int) 1.6` is `1`. Don't round.

</details>

## Exact Output

Spelling, capitalization, and punctuation must match. Extra spaces don't count against you, but missing spaces do.

The lines your methods print:

```
=== Landing Zone Clearance Report ===
Sweep [number] complete: zone clear.
Length = [length] feet
Width = [width] feet
Area = [area] square feet
Beacons needed: [number]
```

The length, width, and area are `double` values, so a length of `5` prints as `5.0`. The beacon count is an `int`, so it has no decimal.

## Sample Runs

All four TODOs finished:

```text
=== Landing Zone Clearance Report ===
Enter the landing zone's length in feet:
5
Enter the landing zone's width in feet:
3
Sweep 1 complete: zone clear.
Sweep 2 complete: zone clear.
Sweep 3 complete: zone clear.
Length = 5.0 feet
Width = 3.0 feet
Area = 15.0 square feet
Beacons needed: 1
Landing zone report complete.
```

```text
=== Landing Zone Clearance Report ===
Enter the landing zone's length in feet:
12.5
Enter the landing zone's width in feet:
8
Sweep 1 complete: zone clear.
Sweep 2 complete: zone clear.
Sweep 3 complete: zone clear.
Length = 12.5 feet
Width = 8.0 feet
Area = 100.0 square feet
Beacons needed: 4
Landing zone report complete.
```

Only TODO 1 and TODO 2 finished. The program still runs; the rest of the report is just missing:

```text
=== Landing Zone Clearance Report ===
Enter the landing zone's length in feet:
5
Enter the landing zone's width in feet:
3
Sweep 1 complete: zone clear.
Sweep 2 complete: zone clear.
Sweep 3 complete: zone clear.
Landing zone report complete.
```

## Test Your Program

Run each test before you submit. The autograder uses these and other values.

| Length | Width | Area line | Beacons line |
|---|---|---|---|
| `5` | `3` | `Area = 15.0 square feet` | `Beacons needed: 1` |
| `42` | `13` | `Area = 546.0 square feet` | `Beacons needed: 11` |
| `12.5` | `8` | `Area = 100.0 square feet` | `Beacons needed: 4` |
| `1850` | `3650` | `Area = 6752500.0 square feet` | `Beacons needed: 1100` |

## How It's Checked

| Check | What it looks for | Points |
|---|---|---|
| TODO 1: showBanner header | A `void` method named `showBanner` with no parameters | 2 |
| TODO 1: Banner prints before the prompts | The banner, right before the length prompt | 2 |
| TODO 2: showSweep header | A `void` method named `showSweep` with one `int` parameter | 2 |
| TODO 2: Three sweeps | `Sweep 1`, `Sweep 2`, and `Sweep 3` lines, in order | 3 |
| TODO 3: displayData header | A `void` method named `displayData` with two `double` parameters | 2 |
| TODO 3: Data for 5 by 3 | `Length = 5.0 feet`, `Width = 3.0 feet`, `Area = 15.0 square feet` | 2 |
| TODO 3: Data for 42 by 13 | `Length = 42.0 feet`, `Width = 13.0 feet`, `Area = 546.0 square feet` | 2 |
| TODO 3: Data for a hidden size | The three lines for a size you haven't seen | 2 |
| TODO 4: showBeacons header | A `void` method named `showBeacons` with one `int` parameter | 2 |
| TODO 4: Beacons for 5 by 3 | `Beacons needed: 1` | 2 |
| TODO 4: Beacons for 12.5 by 8 | `Beacons needed: 4` | 2 |
| TODO 4: Beacons for a hidden size | The beacon count for a size you haven't seen | 2 |
| **Total** | | **25** |

- Header checks score even if your program doesn't compile. Output checks need it to compile.
- Hidden tests run when you submit, not in the Iteryx window.

## Where to Look

- Day 1 notes, M1 (Header, body, and call): writing a method and calling it.
- Day 1 notes, M2: calling a method from inside a loop.
- Day 1 notes, P1 (Three kinds of argument) and P2 (Two parameters): passing variables, and why the order matters.
- Day 1 notes, P3 (Widening and a cast): passing a `double` to an `int` parameter.
