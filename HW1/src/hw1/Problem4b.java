/*
Dean Choi; CSU: 2690159
4). What is pass-by-value? Show the result of the following programs.
 */
package hw1;

/*
Java doesn't pass method arguments by reference, rather it is "Pass-by-value". Thus
when you invoke a method with an argument, the value of the argument is passed
to the parameter. If the argument is a variable rather than a literal value, the 
value of the variable is passed to the parameter.
 */
public class Problem4b {
    public static void main(String[] args){
        int i = 1;
        while (i <= 6) {
        method1(i, 2);
        i++;
        }
    }
    
    public static void method1(int i, int num){
        for (int j = 1; j <= i; j++){
            System.out.print(num + " ");
            num *= 2;
        }
        System.out.println();
    }
}
