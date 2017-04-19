/*
Dean Choi
CSU ID: 2690159
1). Write a program that prompts the user to enter an integer and determines whether it is
divisible by 5 and 6, whether it is divisible by 5 or 6, and whether it is divisible by 5 or 6,
but not both.
 */
package hw1;
import java.util.Scanner;
/**

 */
public class Problem1 {
    public static void main(String[] args){
	Scanner input = new Scanner(System.in);
        int number = 0;
        System.out.println("Enter an integer: ");
        number = input.nextInt();
        
        System.out.println("Is " + number + " divisble by 5 and 6? ");
        if ((number % 5 == 0) && (number % 6 == 0)){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
        
        System.out.println("Is " + number + " divisble by 5 or 6? ");
        if ((number % 5 == 0) || (number % 6 == 0)){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
        
        System.out.println("Is " + number + " divisble by 5 or 6, but not both? ");
        if ((number % 5 == 0) ^ (number % 6 == 0)){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
