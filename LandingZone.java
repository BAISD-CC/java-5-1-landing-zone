import java.util.Scanner;

public class LandingZone {

    public static void main(String[] args) {
        // Make your variables and scanner.

        // Get the landing zone's length from the user using a method.
        // Pass the keyboard into this method.

        // Get the landing zone's width from the user using a method.
        // Pass the keyboard into this method.

        // Close the keyboard
        
        // Get the landing zone's area and store it in area using a method.

        // Display the landing zone's data using a method.

    }

    /**
    The getLength method prompts the user for the landing zone's length.
     @return The value entered by the user.
     */


    /**
     The getWidth method prompts the user for the landing zone's width.
     @return The value entered by the user.
     */


    /**
     The getArea method calculates the landing zone's area.
     @param length The landing zone's length.
     @param width The landing zone's width.
     @return The area of the landing zone.
     */


    /**
     The displayData displays the landing zone's length, width, and area.
     @param length The landing zone's length.
     @param width The landing zone's width.
     @param area The landing zone's area.
     */

    public static void displayData(double length, double width, double area) {
        System.out.println("The Landing zone's dimensions are as follows:" +
                           "\nLength  = " + length +
                           "\nWidth = " + width +
                           "\nArea  = " + area);
    } 
}
