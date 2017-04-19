/*Dean Choi
CSU ID: 2690159
1). Write a test program that stores 5 million integers in a linked list and test the time to traverse
the list using an iterator vs. using the get(index) method.*/
package hw3;

import java.util.*;

public class Problem1 {
    
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 5000000; i++) {
            linkedList.addLast((int) Math.ceil(Math.random()*5000000));
        }
        
        //Iterator traverse method
        Iterator<Integer> listIterator = linkedList.listIterator();
        long startTime = System.currentTimeMillis();
        while (listIterator.hasNext()) {
            listIterator.next();
        }
        System.out.println("The Iterator test time to traverse the list is " + 
                (System.currentTimeMillis() - startTime) + " milliseconds.");
        
        //get(index) traverse method
        startTime = System.currentTimeMillis();
        for (int i = 0; i < linkedList.size(); i++) {
            linkedList.get(i);
        }
        System.out.println("The get(index) test time to traverse the list is " + 
                (System.currentTimeMillis() - startTime) + " milliseconds.");
    }

}
