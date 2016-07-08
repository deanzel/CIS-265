/*
Name: Dean Choi
CSU ID: 2690159
CIS 265: Assignment #1
Description: class for our custom exception created called HRIllegalValueException
*/
package demoex;


public class HRIllegalValueException extends Exception {
    
    /*Summary: Constructor that accepts a single String message that will be printed out in addition to the class name
    Parameters: one String corresponding to the error message
    Return: none
    */
    public HRIllegalValueException(String m) {
        System.out.println("HRIllegalValueException: " + m);    
    }
    
}
