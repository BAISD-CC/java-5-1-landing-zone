import java.util.Scanner;

// INFO: Ch. 5 Challenge 1: Landing Zone
// INFO: main is already written. You write four methods below main,
//       and the call for each one inside main.
// INFO: Work one TODO at a time: write the method, write its call,
//       then run the program and check the output before moving on.
// INFO: Lines marked GIVEN are provided. Do not change them.

public class LandingZone {

    public static void main(String[] args) {
        // GIVEN: The Scanner for keyboard input.
        Scanner keyboard = new Scanner(System.in);

        // TODO 1 (call): Call showBanner.

        // GIVEN: Read the landing zone's length and width.
        System.out.println("Enter the landing zone's length in feet:");
        double length = keyboard.nextDouble();
        System.out.println("Enter the landing zone's width in feet:");
        double width = keyboard.nextDouble();
        keyboard.close();

        // GIVEN: Mission Control sweeps the zone three times before a landing.
        for (int sweep = 1; sweep <= 3; sweep++) {
            // TODO 2 (call): Call showSweep, passing sweep.

        }

        // TODO 3 (call): Call displayData, passing length and width,
        //                in that order.

        // GIVEN: One beacon for every full 10 feet of the zone's edge.
        double beacons = (2 * length + 2 * width) / 10;

        // TODO 4 (call): Call showBeacons, passing beacons.
        // INFO: showBeacons has an int parameter, but beacons is a double.

        // GIVEN: The last line of the report.
        System.out.println("Landing zone report complete.");

        // GIVEN: Close the program.
        System.exit(0);
    }

    // TODO 1 (method): Write the showBanner method.
    //   Modifiers:   public static
    //   Return type: void
    //   Parameters:  none
    //   Body:        prints === Landing Zone Clearance Report ===

    // TODO 2 (method): Write the showSweep method.
    //   Modifiers:   public static
    //   Return type: void
    //   Parameters:  one int, the sweep number
    //   Body:        prints Sweep [number] complete: zone clear.

    // TODO 3 (method): Write the displayData method.
    //   Modifiers:   public static
    //   Return type: void
    //   Parameters:  two doubles, the length first and the width second
    //   Body:        calculates the area (length times width), stores it in
    //                a local variable named area, then prints three lines:
    //                  Length = [length] feet
    //                  Width = [width] feet
    //                  Area = [area] square feet

    // TODO 4 (method): Write the showBeacons method.
    //   Modifiers:   public static
    //   Return type: void
    //   Parameters:  one int, the number of beacons
    //   Body:        prints Beacons needed: [number]

}
