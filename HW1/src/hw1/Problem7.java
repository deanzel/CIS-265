/*
Dean Choi; CSU 2690159
7). What are the differences between a while loop and a do-while loop? Convert the following
while loop into a do-while loop.
 */
package hw1;
import java.util.Scanner;

/*
The difference between a while loop and a do-while loop is when the comparison is done.
In a do-while loop, the comparison/boolean statement is at the end of the loop so you 
will do at least one interation of the code in the loop. A while loop has the comparison 
before the loop.
 */
public class Problem7 {
    public static void main(String[] ars) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int number = 0;
        
        do {
            System.out.println("Enter an integer (the input ends if it is a 0)");
            number = input.nextInt();
            sum += number;
        }
        while (number != 0);
        
        System.out.println("The sum of the integers is " + sum);
    }   
}
