package homework_week_4_hiral;

import java.util.Scanner;

import static jdk.nashorn.internal.objects.NativeString.charAt;

/**
 * Write a Java program that takes the user to provide a single character from the
 * alphabet. Print Vowel of Consonant, depending on the user input. If the user input
 * Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
 * error message.
 * For eg:
 * Input an alphabet: p
 * Expected Output:
 * Input letter is Consonant
 */

public class Programme_3_FindVowelOrConsonant {
    public static void checkVowelOrConsonant(String letter) {
        //checks length of String
        //if user enters of more than 1 character an error message is printed
        if (letter.length() > 1) {
            System.out.println("Error. Not a single charactor");
            //if user enters symbol

        } else if (!(isItALetter(letter))) {
            System.out.println("Error.Not a letter. Enter uppercase or lowercase letter");
        } else if (letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("i") ||
                letter.equals("o") || letter.equals("u")) {
            System.out.println("Input letter is a vowel");
        } else {
            System.out.println("Input letter is a consonant");
    }

}
//This method will check is it a letter or not?
public static boolean isItALetter(String l) {
    return l.charAt(0) > 96 && l.charAt(0) < 123;
}

    private static int charAt(int i) {
        return 0;
    }

    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
                System.out.println("Enter any charactor: ");
                String str = scanner.next().toLowerCase();
                //caling static method direct
        checkVowelOrConsonant(str);
        //closing scanner
                scanner.close();
    }
}