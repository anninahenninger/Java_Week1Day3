import java.util.Scanner;

/**
 * Insurance of a car is based on characteristics of the owner. Base insurance is 500 EUR.
 *
 * The algorithm introduces cumulative changes in insurance (one step after another)
 *
 *     A male below 25, insurance is 20% higher
 *     Age is over 65, insurance is 15% higher
 *     Motor: If kW < 50, decrease insurance (by  100 EUR). if power characteristics of the motor are between 50 and 75,
 *     there is no change in insurance. If kW > 75, additional insurance percentage is calculated like this:
 *         Additional Percentage(kW) = (kW - 75) / 200
 *     If car type is Mercedes, BMW or Ferrari, insurance will be 20% higher.
 *
 * All changes to the base  are cumulative and done in the order presented (meaning,  a 25 old male with Ferrari
 * (>100 kW) will first get 20%, then new 20%, and so on.  )
 *
 * Create a method covering the described logic and test it with calls with several different parameters
 */
public class Advanced_A13 {

    public static double maleUnder25(double base){
        double newBase = base * 1.2;
        return newBase;
    }
    public static double ageOver65(double base){
        double newBase = base * 1.15;
        return newBase;
    }
    public static double kWUnder50(double base2){
        double newBase2 = base2 - 100;
        return newBase2;
    }
    public static double kWOver75(double base2, double kw){
        double perc = ((kw - 75) / 200);
        double newBase = base2 +(base2 * perc);
        return newBase;
    }
    public static double typeIssue(double base3){
        double newBase3 = base3 * 1.2;
        return newBase3;
    }

    public static void main(String[] args) {
        double base1 = 500;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter gender");
        String gender = sc.nextLine();
        System.out.println("Enter age");
        int age = sc.nextInt();
        System.out.println("Enter kw");
        int kw = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter car type");
        String type = sc.nextLine();
        double newBase;
        double insurance;

        if ((gender.equals("male")) && (age < 25)) {
            newBase = maleUnder25(base1);
        } else if (age > 65) {
            newBase = ageOver65(base1);
        } else {
            newBase = base1;
        }

        if(kw < 50){
            newBase = kWUnder50(newBase);
        }else if(kw > 75){
            newBase = kWOver75(newBase, kw);
        }

        if(type.equals("Ferrari") || type.equals("BMW") || type.equals("Mercedes")){
            insurance = typeIssue(newBase);
        }else{
            insurance = newBase;
        }
        System.out.println("The insurance is " + insurance);
    }

}
