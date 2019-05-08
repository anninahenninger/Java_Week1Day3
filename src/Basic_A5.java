import java.util.Scanner;

/**
 * You have a hotel elevator whose weight capacity is 1,400 kg. If an average person weighs 75 kg, how many persons can
 * you fit in the elevator?
 *
 * After you solved this, write a generic program that solves this problem for an input of elevator weight capacity
 * and average person weight.
 *
 * Display result as “You can fit 9 persons in this elevator”
 *
 * Note: Once you have an general idea of the solution inside the main(), try to move the computation into a method
 * call that returns a value to the main() method for displaying value.
 */
public class Basic_A5 {

    public static void fitInElevator(int weightCapacity, int avgWeight){
        int persons = weightCapacity / avgWeight;
        System.out.println("You can fit " + persons + " persons in this elevator");
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter weight capacity for elevator");
        int weightCapacitiy = sc.nextInt();
        System.out.println("Enter average weight of persons");
        int avgWeight = sc.nextInt();

        fitInElevator(weightCapacitiy, avgWeight);

    }
}
