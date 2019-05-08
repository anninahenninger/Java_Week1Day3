import java.util.Scanner;

public class Intermediate_A8 {

    public static double BMI (double height, double weight){

        double hM = height/100;
        double calc = weight / Math.pow(hM,2);
        return calc;
    }

    public static void main (String[] args){ // do not forget to have static void...

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter weight  ");
        int kg = sc.nextInt();
        System.out.println("Enter height  ");
        int m = sc.nextInt();

        System.out.println("Your BMI is "+ BMI(m, kg)); //call parameter in accordance to calculation!!!

    }
}
