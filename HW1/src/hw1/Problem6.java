/*
Dean Choi; CSU: 2690159
6). Some websites impose certain rules for passwords. Write a method that checks whether a
string is a valid password. Suppose the password rules are as follows:
 A password must have at least eight characters.
 A password consists of only letters and digits.
 A password must contain at least two digits.
Write a program that prompts the user to enter a password and displays Valid Password if
the rules are followed or Invalid Password otherwise.
 */
package hw1;
import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args){
    String password = "";
    int digitCount = 0;
    String pattern = "^[a-zA-Z0-9]*$"; //alphenumeric regex
    
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a password: ");
    password = input.nextLine();
    
    if ((password.length() >= 8) && (password.matches(pattern))) {
        for (int i = 0; i < password.length(); i++){
            if (Character.isDigit(password.charAt(i))) {
                digitCount++;
            }
        }
        if (digitCount >= 2) {
            System.out.println("Valid Password!!");
        }
        else {
            System.out.println("Invalid Password...");
        }
    }
    else {
        System.out.println("Invalid Passowrd...");
    }
    }   
}
