/* Justin Victoria
   Liri Labs
   Telephone.java: Create a terminal-based program that gathers a valid telephone number and
   outputs accordingly.
*/

import java.util.Scanner;

public class Telephone {
    public static void main(String[] args) {
        // Used to validate that input is numerical and to gather input.
        String input = "empty";

        while (!input.matches("[0-9]+")) {
            System.out.print("Please enter a valid US phone number (Numbers Only): ");
            Scanner in = new Scanner(System.in);
            input = in.nextLine();
        }

        /* Input is currently a String. Convert to char array to be able to check
         * if when 11 digits have been entered, that the first digit is '1'.
         */
        char[] number = input.toCharArray();
        if (number.length == 10 || number.length == 11 && number[0] == '1') {
            System.out.println("Success!"); 
        }
        else {
            System.out.println("Failure!");
        }
    }
}
