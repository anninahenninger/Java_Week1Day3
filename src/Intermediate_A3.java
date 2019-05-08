/**
 *  Create examples that demonstrates the usage of following String methods:
 *
 * indexOf(), startsWith(), compareTo(), trim(), replace(), replaceAll() and split()
 *
 * As a test data, use following string from “Alice in Wonderland:
 */
public class Intermediate_A3 {
    public static void main(String[] args){
        String aliceInWonderland = "     Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, `and what is the use of a book,' thought Alice " +
                "`without pictures or conversation?    ";

        System.out.println(aliceInWonderland.indexOf("pictures"));
        System.out.println(aliceInWonderland.startsWith("Alice"));
        System.out.println(aliceInWonderland.compareTo("Abc"));
        System.out.println(aliceInWonderland.trim());
        System.out.println(aliceInWonderland.replace("was","mäh"));
        System.out.println(aliceInWonderland.replaceAll("was", "mäh"));
        String[] occurrences = (aliceInWonderland.split("a", 5));
        System.out.println(occurrences[0]);
        System.out.println(occurrences[1]);
        System.out.println(occurrences[2]);
        System.out.println(occurrences[3]);
        System.out.println(occurrences[4]);


    }
}
