/**
 * Consider the following string:
 *
 * String hannah = "Did Hannah see bees? Hannah did.";
 *
 *     What is the value displayed by the expression hannah.length()?
 *
 *     What is the value returned by the method call hannah.charAt(12)?
 *
 *     Write an expression that refers to the letter b in the string referred to by hannah.
 */
public class Basic_A1 {

    public static void main(String[] args) {
        String hannah = "Did Hannah see bees? Hannah did.";

        System.out.println(hannah.length());

        System.out.println(hannah.charAt(12));

        System.out.println(hannah.indexOf("b"));
    }
}
