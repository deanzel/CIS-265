/*
Name: Dean Choi
CSU ID: 2690159
CIS 265: Assignment #1
Description: Determining the number of good and bad data in a HR.txt file via exception handling
*/
package demoex;

import java.io.*;
import java.util.*;


public class DemoEx {

    /*
    Summary Info : java main console method that reads values in the HR.txt file and counts the number of good and bad results.
    Also, this method declares that it may throw an IOException error (type of checked exception that must be declared).
    Parameters : String array args are passed into this main console method
    Return type : void (no return)
    */
    public static void main(String[] args) throws IOException {
        //Scanner object that reads the values from the HR.txt file located in the current working directory of the program
        Scanner in  = new Scanner(new FileReader("HR.txt"));
        
        int badData = 0;    //int variable that keeps count of the # of Bad Data 
        int goodData = 0;   //int variable that keeps count of the # of Good Data
        
        //code used to locate the file path of the current working directory and thus where to place HR.txt file
        //System.out.println(System.getProperty("user.dir"));
        
        //while loop that reads each line in the HR.txt file while there is another line to read
        while (in.hasNext()) {
            try {
                //the scanner object will parse the data in the current line to an int value (if it is not an int value,
                //an InputMismatchException will be thrown
                int value = in.nextInt();
                
                if (value < 0) {
                    //throws a HRIllegalValueException error with a specific string message in the constructor if int is below 0
                    throw new HRIllegalValueException("HR cannot be a negative value.");
                }
                else {                   
                    //Increases the Good Data count by 1
                    goodData++;
                }
            }
            
            //catches any InputMismatchException exceptions which in our particular case will be if the scanner object tries to read a non-integer value 
            catch (InputMismatchException ex) {
                //code used to consume the non-integer string data so the next line of input can be read
                in.next();
                //increases the Bad Data count by 1
                badData++;
            }
            
            //catches our custom HRIllegalValueException exceptions which in our case gets thrown when the int value read by the scanner object is below 0
            catch (HRIllegalValueException ex) {
                //increases the Bad Data count by 1
                badData++;
            }
        }
        
        //prints out the number of Good Data and Bad Data
        System.out.println("Good Data: " + goodData);
        System.out.println("Bad Data: " + badData);
        
    }
    
}
