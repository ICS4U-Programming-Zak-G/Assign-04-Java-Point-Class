// Import libraries
import java.util.Random;
import java.util.Scanner;

/**.
* This is the main class for the point class program
*
* @author  Zak Goneau
* @version 1.0
* @since   2025-05-21
*/

// Define the main class
class Main {

    /** .
     * MAX is the largest number to be generated.
     */
    private static final int MAX = 50;

    /** .
     * MIN is the smallest number to be generated.
     */
    private static final int MIN = 0;

    // Declare the main method
    public static void main(final String[] args) {
        // Introduce program to user
        System.out.println("This program calculates the distance from the"
        + " origin to a random point as well as the distance from that"
            + " point to a user inputted point!");

        // Create instance of random class
        Random rand = new Random();

        // Generate random number 0-50 for x
        int x = rand.nextInt(MAX - MIN + 1) + MIN;

        // Generate random number 0-50 for y
        int y = rand.nextInt(MAX - MIN + 1) + MIN;

        // Create an instance of a point
        Point coordinate = new Point(x, y);

        // Print point
        System.out.println("The coordinate is: (" + x + ", " + y + ")");

        // Call method to calculate distance from origin to point
        double distance = coordinate.distanceOrigin();

        // Round distance to two decimal places
        String roundedDistance = String.format("%.2f", distance);

        // Print distance to console
        System.out.println("The distance from the origin to this point is: "
            + roundedDistance + " units");

        // Get user input
        System.out.println("Please enter an x-value: ");
        Scanner scanner = new Scanner(System.in);
        String userX = scanner.nextLine();

        // Try casting user input to a double
        try {
            // Cast x-value into double
            double xValue = Double.parseDouble(userX);

            // Get y-value from user
            System.out.println("Please enter a y-value: ");
            String userY = scanner.nextLine();

            // Try casting user input to double
            try {
                // Cast y-value to double
                double yValue = Double.parseDouble(userY);

                // Create second point object
                UserPoint userPoint = new UserPoint(xValue, yValue);

                // Call method to calculate distance between both points
                double distanceResult = userPoint.pointToPointDistance(x, y);

                // Round distance
                String roundedDistancePTP = String.format("%.2f",
                        distanceResult);

                // Print distance between points
                System.out.println("The distance between (" + x
                    + ", " + y + ") and (" + xValue
                        + ", " + yValue + ") is " + roundedDistancePTP);

            // Catch conversion errors
            } catch (NumberFormatException error) {
                System.out.println(userY + " is not a number.");
            }

        // Catch conversion errors
        } catch (NumberFormatException error) {
            System.out.println(userX + " is not a number.");
        }
        // Close scanner
        scanner.close();
    }
}
