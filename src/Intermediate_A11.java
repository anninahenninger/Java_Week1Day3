/**
 * Write Java methods to calculate the area of a triangle. Calculate the area of a triangle, given the input values.
 *
 * Expected Output:
 *
 * Input Side-1: 10
 * Input height-1: 15
 * The area of the triangle is 75
 */
public class Intermediate_A11 {

    public static void calcTriangle(int side, int height){
        double area = side * height / 2;
        System.out.println("The area of the triangle is " + area);
    }

    public static void main(String[] args){
        int side1 = 10;
        int height1 = 15;

        calcTriangle(side1, height1);
    }
}
