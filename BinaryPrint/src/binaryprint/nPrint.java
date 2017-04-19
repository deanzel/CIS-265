/*
Name: Dean Choi
CSU ID: 2690159
CIS 265: Assignment #2
Description: Recursive method that prints the binary form a given non-negative integer
*/
package binaryprint;


public class nPrint {
    
    public String strBinary;
    
    public String intToBinary(int n) {
        if (n < 2 && n > -1) {
            strBinary = "" + n;
            return strBinary;
        }
        else {
            if (n != 0) {
                //strBinary += ""+ n%2;
                intToBinary(n/2);
                strBinary += ""+ n%2;
            }
        return strBinary;
        }
    }
}
