/**.
* This is the coordinate class for the point class program
*
* @author  Zak Goneau
* @version 1.0
* @since   2025-05-21
*/

// Define the point class
public class Point {
    // Declare attributes
    double x;
    double y;
    double distance = 0;

    /**
    * This is the constructor for the coordinate.
    *
    * @param x X-coordinate of the point
    * @param y Y-coordinate of the point
    */

    public Point(final double x, final double y) {
        // Create unique fields of an object
        this.x = x;
        this.y = y;
    }

    /**
    * This is a method for calculating the distance.
    * @return distance Distance from origin
    */

    public double distanceOrigin() {
        // Calculate the distance
        distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

        // Return distance
        return distance;
    }
}

// Create child class of point class
class UserPoint extends Point {

    /**
    * This is the constructor for the user point.
    *
    * @param x X-coordinate of the point
    * @param y Y-coordinate of the point
    */

    UserPoint(final double x, final double y) {
        // For point subclass
        super(x, y);
    }

    /**
    * This is a method for calculating the distance.
    * @param xValue X-value from user
    * @param yValue Y-value from user
    * @return distance Distance from origin
    */

    public double pointToPointDistance(final double xValue,
             final double yValue) {
        // Calculate the distance
        distance = Math.sqrt(Math.pow((xValue - x), 2)
            + Math.pow((yValue - y), 2));

        // Return distance
        return distance;
    }
}
