/*
Sum Of Digits.java 
Created by: Lucas Noritomi-Hartwig
Created on: April 17, 2020
Last edited on: April 17, 2020
Given a non-negative integer n, this program will return
the sum of its digits using a recursive function.
*/
package sum.of.digits;

import javax.swing.JOptionPane;

public class SumOfDigits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // Prompting user for input integer
            int input = Integer.parseInt(JOptionPane.showInputDialog("Enter a " +
                    "non-negative integer"));
            if (input >= 0) { // Ensuring that the integer is non-negative
                System.out.println("The sum of the digits of " + input + " is " +
                        addDigits(input, 0) + ".");
            } else {
                System.out.println("Please enter a non-negative integer.");
            }
        } catch (NumberFormatException e) { // Catch in case input is not an integer
            System.out.println("Please enter a non-negative integer.");
        }
    }

    public static int addDigits(int n, int sum) {
        // Recursive function adding the digits of the input
        if (n < 9 && n >= 0) { // Base case where input has one digit
            sum += n;
            return sum;
        } else { // Case where input has more than one digit
            sum += (n % 10);
            n = n / 10;
            return addDigits(n, sum);
        }
    }
}
