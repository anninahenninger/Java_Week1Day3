//A4: Write a program that computes your initials from your full name and displays them.
//
// For "John Doe", the output should be:
//
//JD



public class Advanced_A4 {
    public static void main(String[] args) {
        String initials = "Annina Henninger";
        char first = initials.charAt(0);
        char second = initials.charAt(7);

        System.out.println(first + "" + second);

        String judith = "Judith Lang-Ladurner";
        char jFirst = judith.charAt(0);
        char jSecond = judith.charAt(7);
        char jThird = judith.charAt(12);

        System.out.println(jFirst + "" + jSecond + "" + jThird);
    }

}
