/*Dean Choi
CSU ID: 2690159
5). Write a recursive method that nds the number of occurrences of a specied letter in a string.
 */
package hw2;

import java.util.Scanner;

public class Problem5 {
    static int count = 0;
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str;
        char chr;

        System.out.println("Enter a string: ");
        str = input.nextLine();
        System.out.println("Enter a single character: ");
        chr = input.next().charAt(0);
        
        System.out.printf("The string of \"%s\" has %d occurences of the character of '%c'.\n",
                str, count(str, chr), chr);
    }
    
    public static int count(String str, char a) {
        if (str.length() <= 1) {
            if (str.charAt(0) == a)
                count += 1;
        }
        else {
            if (str.charAt(0) == a)
                count += 1;
            count(str.substring(1), a);
        }
        return count;
    }
}
