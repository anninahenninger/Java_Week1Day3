//A6: Write a program that converts Fahrenheit degrees to Celsius. Then write a program that convert from Celsius
// to Fahrenheit.
//Note: find the formula on the Internet, then write a program solve this through a method call.
// Add two calls to your method with different Fahrenheit temperature values (40, 50 and 60)

import java.util.Scanner;

public class Basic_A6 {

    public static int cToF (int celc){

        int fahr = celc *9/5+32;
        return fahr;
    }
    public static int fToC (int fahr){

        int celc = (fahr-32)*5/9;

        return celc;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter celcius  ");
        int celc = sc.nextInt();
        System.out.println("Enter fahrenheit  ");
        int fahr = sc.nextInt();

        System.out.println(celc + "C are "+cToF(celc)+"F.");
        System.out.println(fahr + "F are "+fToC(fahr)+"C.");
    }
}
