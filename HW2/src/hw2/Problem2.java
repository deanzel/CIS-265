/*Dean Choi
CSU ID: 2690159
2). Write a method to multiply two matrices.*/
package hw2;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args){
        double[][] matrix1 = new double[3][3];
        double[][] matrix2 = new double[3][3];
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter two 3x3 matrices.\nEnter matrix1: ");
        for (int i = 0; i < matrix1.length; i++){
            for (int j = 0; j < matrix1[i].length; j++){
                matrix1[i][j] = input.nextDouble();
            }
        }
        System.out.print("Enter matrix2: ");
        for (int i = 0; i < matrix2.length; i++){
            for (int j = 0; j < matrix2[i].length; j++){
                matrix2[i][j] = input.nextDouble();
            }
        }
        
        System.out.println("The multiplication of the matrices is");
        
        double[][] result = multiplyMatrix(matrix1, matrix2);
        
        for (int i = 0; i < result.length; i++){
            for (int j = 0; j < result[0].length; j++){
                System.out.printf("%5.1f ", result[i][j]);
            }
            System.out.println("");
        }
    }
    
    public static double[][] multiplyMatrix(double[][] a, double[][] b){
        double[][] result = new double[a.length][b[0].length];
        
        for (int i = 0; i < a.length; i++){
            for (int j= 0; j < b[0].length; j++){
                double tempSum = 0;
                for (int k = 0; k < a[0].length; k++){
                    tempSum += a[i][k] * b[k][j];
                }
                result[i][j] = tempSum;
            }
        }
        return result;
    }
}
