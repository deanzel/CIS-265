/*Dean Choi
CSU ID: 2690159
6). Write a recursive method that computes the sum of the digits in an integer.
 */
package hw2;

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = 0;
        System.out.println("Enter an integer: ");
        number = input.nextInt();
        
        System.out.printf("The sum of the digits of %d is %d.\n", number, sumDigits(number));
        
    }
    
    public static int sumDigits(long n) {
        if (n < 10) {
            return (int) n;
        }
        else {
            return (int) ((n % 10) + sumDigits(n/10));
        }
    }
}
