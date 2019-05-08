//A10. Write a Java method to compute the average of three numbers.
//Test Data:
//Input the first number: 25
//Input the second number: 45
//Input the third number: 65
//Expected Output:
//The average value is 45.0

import java.util.Scanner;

public class Intermediate_A10 {

    public static double calculateAvg (int first,int second,int third){
        int calc = (first + second + third)/3;
        return (calc);
    }

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number  ");
        int first = sc.nextInt();
        System.out.println("Enter second number  ");
        int second = sc.nextInt();
        System.out.println("Enter third number  ");
        int third = sc.nextInt();

        System.out.println("The average number is " +calculateAvg(first,second,third));
    }
}
