
package Sesson5;

import java.util.Scanner;

public class codesnippet11 {
    /**
     *@param args the command line arguments
     */
    public static void main(String[] args) {
        int cnt, number; // cnt variable is a counter variable

        for (cnt = 1, number = 0; cnt <= 10; cnt++) {
            // Scanner class is used to accept data from the keyboard
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a number: ");
            number = input.nextInt();
            if (number == 0) {
                // break statement terminates the loop
                break;
            } // End if statement
        } // End of for statement
    }
}
