//A14:  Student get final grades in five subjects: Physics, Chemistry, Biology, Mathematics and Computer through
//final test (0 to 100 points)
//Calculate percentage and grade for every subject according to following algorithm:
//Percentage >= 90% : Grade A
//Percentage >= 80% : Grade B
//Percentage >= 70% : Grade C
//Percentage >= 60% : Grade D
//Percentage >= 40% : Grade E
//Percentage < 40% : Grade F
//Create a method covering the described logic and test it with calls with several different parameters
public class Advanced_A14 {

   public static String getGrade(int subj){
       if (subj >= 90){
           return ("Grade A");
       }else if (subj >= 80){
           return ("Grade B");
       }else if (subj >=70){
           return ("Grade C");
       }else if (subj >=60){
           return ("Grade D");
       }else if (subj >=40){
           return ("Grade E");
       }else{
           return ("Grade F");
       }
   }

    public static void main (String [] args){

        int phy = 90;
        int che = 70;
        int bio = 60;
        int mat = 50;
        int com = 30;

        System.out.println("In Physics you have "+getGrade(phy));
        System.out.println("In Chemistry you have "+getGrade(che));
        System.out.println("In Biology you have "+getGrade(bio));
        System.out.println("In Math you have "+getGrade(mat));
        System.out.println("In Computer science you have "+getGrade(com));

    }
}
