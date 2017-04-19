/*
Dean Choi; CSU: 2690159
3). Write a method that displays an n-by-n matrix using the following header:
public static void printMatrix(int n)
 */
package hw1;
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args){
        int size = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n: ");
        size = input.nextInt();
        
        printMatrix(size);
    }
    
    
    public static void printMatrix(int n){
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(Math.round(Math.random()) + " ");
            }
            System.out.print("\n");
        }
}

}

