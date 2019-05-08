import java.util.Scanner;

/**
 Given an age in seconds, calculate how old someone is in terms of years in a method.
 */
public class Intermediate_A9 {

    public static long calcYears(long age){
        long ageInYears = age / 60 / 60 / 24 / 365;
        return  ageInYears;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age in seconds");
        long ageInSec = sc.nextLong();

        System.out.println("The age in years is " + calcYears(ageInSec));
    }

}
