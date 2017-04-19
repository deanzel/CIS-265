/*
Dean Choi; CSU: 2690159
4). What is pass-by-value? Show the result of the following programs.
5). Debugged with breakpoints to show the variables in the call stack.
 */
package hw1;

/*
4). Java doesn't pass method arguments by reference, rather it is "Pass-by-value". Thus
when you invoke a method with an argument, the value of the argument is passed
to the parameter. If the argument is a variable rather than a literal value, the 
value of the variable is passed to the parameter.
5). Before method max is invoked: int max = 0;
Just as max is entered: int max = 0, int value1 = 1, int value2 = 2;
Just before max is returned: int max = 2, int value1 = 1, int value2 = 2;
Right after max is returned: int max = 0;

 */
public class Problem4a {
    public static void main(String[] args){
        int max = 0;
        max(1, 2, max);
        
        /*Since this is pass-by-value, only the value of the variable "max" is passed
        into the method. So the value of "max" within the static method changes but 
        the variable "max" outside the method remains 0.
        */
        System.out.println(max);
    }
    
    public static void max(int value1, int value2, int max){
        if (value1> value2)
            max = value1;
        else
            max = value2;
    }
}
