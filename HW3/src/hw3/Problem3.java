/*Dean Choi
CSU ID: 2690159
3). Write a program that prompts the user to enter a text file name and displays the number of
vowels and consonants in the file. Use a set to store the vowels 'A', 'E', 'I', 'O', and 'U'.*/
package hw3;

import java.util.*;

public class Problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numVowels = 0;
        int numConsonants = 0;
        
        Character[] vowelsKey = {'A', 'E', 'I', 'O', 'U'};
        //Character[] consonantsKey = {'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S',
        //    'T', 'V', 'W', 'X', 'Y', 'Z'};
        Set<Character> vowels = new HashSet<>(Arrays.asList(vowelsKey));
        //Set<Character> consonants = new HashSet<>(Arrays.asList(consonantsKey));
        
        System.out.println("Please enter a text file name: ");
        String textFileName = input.next();
        
        for (int i = 0; i < textFileName.length(); i++) {
            Character n = textFileName.charAt(i);
            if (Character.isLetter(n)) {
                if (vowels.contains(Character.toUpperCase(n)))
                    numVowels++;
                else
                    numConsonants++;
            }
        }
        
        System.out.println("The text file name of " + textFileName + " contains " + numVowels + " vowels and " + 
                numConsonants + " consonants.");
    }

}

