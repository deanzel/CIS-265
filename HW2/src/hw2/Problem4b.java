/*Dean Choi
CSU ID: 2690159
4b). Please explain and show the output for each problem. Explanation is next to
each method instantiation.
 */
package hw2;

public class Problem4b {
    public static void main(String[] args){
        /*Output: false. Here the 'matches' method acts very similarly to the 'equals' method
        and checks to see if the inputed string matches the string of "ABC " exactly. It does not
        so the output is printed as 'false'.*/
        System.out.println("Hi, ABC, good".matches("ABC "));
        
        /*Output: true. Here the 'matches' method is more powerful and uses a regex string pattern 
        for matching a set of strings. In the regex pattern of ".*ABC.*", the '.' matching symbol means
        to match any character, while the '*' quantifier symbol means occurs zero or more times. Since the 
        regex pattern of ".*" surrounds the string of "ABC", the system will search the string to find if it
        contains the string "ABC" surrounded by any nunber or type of other characters. This is 'true' for our
        given string phrase as it contains the "ABC" string within it.*/
        System.out.println("Hi, ABC, good".matches(".*ABC.*"));
        
        /*Output: A,B;C. Here the 'replaceAll' string method is just searching for any occurence of the exact 
        string pattern of ",;" and replacing it with the string of "#". There is no case of an exact match of
        the ",;" pattern, so the string remains unchanged.*/
        System.out.println("A,B;C".replaceAll(",;", "#"));
        
        /*Output: A#B#C. Here the 'replaceAll' string method is used with the regular expression pattern of 
        "[,;]". The "[,;]" sets the definition of the pattern that any of the characters enclosed within the
        'square brackets' (in this case, ',' and ';') will be matched and replaced by the given string of "#". 
        Thus, every ',' or ';' character is replaced with the string of "#" to give us "A#B#C".*/
        System.out.println("A,B;C".replaceAll("[,;]", "#"));
        
        /*Output: A B C . Here the 'split' string method is used with the regex string pattern of "[,;]". This
        regular expression specifies a pattern that matches either ',' or ';' and each of these characters is a 
        delimeter for splitting the string. Thus, the "A,B;C" string is split into an array of strings that is 
        ["A", "B", "C"]. The for-loop below basically iterates through the string array and prints it out each
        string entry followed by a space mark. Thus, we get the string of "A B C " printed out.*/
        String[] tokens = "A,B;C".split("[,;]");
        for (int i = 0; i < tokens.length; i++)
            System.out.print(tokens[i] + " ");
    }
}
