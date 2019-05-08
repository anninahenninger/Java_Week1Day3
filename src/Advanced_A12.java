//A12: A couple married on February 29, so they have one anniversary every four years.
// Write a program with variables named currentYear and weddingYear. Based on those values, write
// the program that displays the number of anniversaries they had.
//For example, if the value of years is 2019 and 2015, the program displays the sentence
// Number of anniversaries: 1 . If difference of the years is 7, the program still displays
// Number of anniversaries: 1 . But if the difference is 8, the program displays Number of anniversaries: 2 .

import java.util.Scanner;

public class Advanced_A12 {

    public static int calcAnn (int currentYear, int weddingYear){
        int anniversaries = 0;
        for (int i = weddingYear; i<=currentYear; i++){
            if ((( i % 4 == 0)&&(i % 100 !=0))|| (i % 400 == 0)){
                anniversaries++;
            }
        }
        return anniversaries;
    }

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter current Year  ");
        int cY = sc.nextInt();
        System.out.println("Enter wedding Year  ");
        int wY = sc.nextInt();

        System.out.println("Number of Anniversaries" + calcAnn(cY, wY));
    }
}
