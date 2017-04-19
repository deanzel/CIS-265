/*Dean Choi
CSU ID: 2690159
4). Write a program that repeatedly prompts the user to enter a capital for a state. Upon
receiving the user input, the program reports whether the answer is correct. Assume that 50
states and their capitals are stored in a map structure as shown below. The program prompts
the user to answer all states capitals and displays the total correct count. The users answer
is not case-sensitive. You should use map to store pairs of each state and its capital. Your
program should prompt the user to enter a state and should display the capital for the state.*/

package hw3;

import java.util.*;

public class Problem4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int correct = 0;
        int wrong = 0;
        
        Map<String, String> stateCapitals = new HashMap<>();
        stateCapitals.put("Alabama", "Montgomery"); stateCapitals.put("Alaska", "Juneau");
        stateCapitals.put("Arizona", "Phoenix"); stateCapitals.put("Arkansas", "Little Rock");
        stateCapitals.put("California", "Sacramento"); stateCapitals.put("Colorado", "Denver");
        stateCapitals.put("Connecticut", "Hartford"); stateCapitals.put("Delaware", "Dover");
        stateCapitals.put("Florida", "Tallahassee"); stateCapitals.put("Georgia", "Atlanta");
        stateCapitals.put("Hawaii", "Honolulu"); stateCapitals.put("Idaho", "Boise");
        stateCapitals.put("Illinois", "Springfield"); stateCapitals.put("Indiana", "Indianapolis");
        stateCapitals.put("Iowa", "Des Moines");stateCapitals.put("Kansas", "Topeka");
        stateCapitals.put("Kentucky", "Frankfort"); stateCapitals.put("Louisiana", "Baton Rouge");
        stateCapitals.put("Maine", "Augusta"); stateCapitals.put("Maryland", "Annapolis");
        stateCapitals.put("Massachusetts", "Boston"); stateCapitals.put("Michigan", "Lansing");
        stateCapitals.put("Minnesota", "Saint Paul"); stateCapitals.put("Mississippi", "Jackson");
        stateCapitals.put("Missouri", "Jefferson City"); stateCapitals.put("Montana", "Helena");
        stateCapitals.put("Nebraska", "Lincoln"); stateCapitals.put("Nevada", "Carson City");
        stateCapitals.put("New Hampshire", "Concord"); stateCapitals.put("New Jersey", "Trenton");
        stateCapitals.put("New Mexico", "Santa Fe"); stateCapitals.put("New York", "Albany");
        stateCapitals.put("North Carolina", "Raleigh"); stateCapitals.put("North Dakota", "Bismarck");
        stateCapitals.put("Ohio", "Columbus"); stateCapitals.put("Oklahoma", "Oklahoma City");
        stateCapitals.put("Oregon", "Salem"); stateCapitals.put("Pennsylvania", "Harrisburg");
        stateCapitals.put("Rhode Island", "Providence"); stateCapitals.put("South Carolina", "Columbia");
        stateCapitals.put("South Dakota", "Pierre"); stateCapitals.put("Tennessee", "Nashville");
        stateCapitals.put("Texas", "Austin"); stateCapitals.put("Utah", "Salt Lake City");
        stateCapitals.put("Vermont", "Montpelier"); stateCapitals.put("Virginia", "Richmond");
        stateCapitals.put("Washington", "Olympia"); stateCapitals.put("West Virginia", "Charleston");
        stateCapitals.put("Wisconsin", "Madison"); stateCapitals.put("Wyoming", "Cheyenne");
        

        Set<String> states = stateCapitals.keySet();
        Iterator<String> iterator = states.iterator();
        System.out.println("Here is a quiz for all the capitals of the 50 states in the US "
                + "(not case-sensitive).\n");
        while (iterator.hasNext()) {
            String state = iterator.next();
            System.out.print("What is the capital of " + state + "? ");
            String answer = input.nextLine();
            if (answer.equalsIgnoreCase(stateCapitals.get(state))) {
                correct++;
                System.out.print("Correct! You have " + correct + " correct and " + wrong + 
                        " wrong answers.\n");
            }
            else {
                wrong++;
                System.out.print("Wrong... " + "The correct answer is " + stateCapitals.get(state)
                        + ". You have " + correct + " correct and " + wrong + " wrong answers.\n");
            }
        }
        
        System.out.println("\nCongratulations. You got " + correct + " total correct answers and "
                + wrong + " total wrong answers.");
    }
}
