/**
 * Calculate and return the area of a circle, given the radius
 */
public class Basic_A7 {

    public static double calcAreaOfCircle(double radius){
        double area = radius * radius * Math.PI;
        return area;
    }

    public static void main(String[] args){
        int r = 3;

        System.out.println("The area of a circle with radius " + r + " is " + calcAreaOfCircle(r));
    }
}
