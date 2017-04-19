/*Dean Choi
CSU ID: 2690159
2). Create two priority queues, {"George"; "Jim"; "John"; "Blake"; "Kevin"; "Michael"} and
{"George"; "Katie"; "Kevin"; "Michelle"; "Ryan"}, and find their union, difference, and intersection.*/
package hw3;
import java.util.*;

public class Problem2 {
    public static void main(String[] args) {
        PriorityQueue<String> queue1 = new PriorityQueue();
        queue1.offer("George"); queue1.offer("Jim"); queue1.offer("John"); queue1.offer("Blake"); 
        queue1.offer("Kevin"); queue1.offer("Michael");
        
        PriorityQueue<String> queue2 = new PriorityQueue();
        queue2.offer("George"); queue2.offer("Katie"); queue2.offer("Kevin"); queue2.offer("Michelle");
        queue2.offer("Ryan");
    
        Iterator<String> queue1Iterator = queue1.iterator();
        Iterator<String> queue2Iterator = queue2.iterator();
        
        //union is a new set that contains elements that are in at least one of the two sets
        PriorityQueue<String> union = new PriorityQueue();
        while (queue1Iterator.hasNext()) {
            String name = queue1Iterator.next();
            if (!union.contains(name))
                union.offer(name);
        }
        while (queue2Iterator.hasNext()) {
            String name = queue2Iterator.next();
            if (!union.contains(name))
                union.offer(name);
        }
        System.out.print("The union of these sets is: ");
        while (union.size() > 0) {
            System.out.print(union.remove() + " ");
        }
        System.out.println();
        
        //difference is a new set that contains elements that are not shared
        PriorityQueue<String> difference = new PriorityQueue();
        queue1Iterator = queue1.iterator();
        queue2Iterator = queue2.iterator();
        while (queue1Iterator.hasNext()) {
            String name = queue1Iterator.next();
            if (!difference.contains(name))
                difference.offer(name);
        }
        while (queue2Iterator.hasNext()) {
            String name = queue2Iterator.next();
            if (difference.contains(name))
                difference.remove(name);
            else
                difference.offer(name);
        }
        System.out.print("The difference of these sets is: ");
        while (difference.size() > 0) {
            System.out.print(difference.remove() + " ");
        }
        System.out.println();
        
        //intersection is a new set elements that are in both sets
        PriorityQueue<String> intersection = new PriorityQueue();
        queue1Iterator = queue1.iterator();
        while (queue1Iterator.hasNext()) {
            String name = queue1Iterator.next();
            if (queue2.contains(name))
                intersection.offer(name);
        }
        System.out.print("The intersection of these sets is: ");
        while (intersection.size() > 0) {
            System.out.print(intersection.remove() + " ");
        }
        System.out.println();
    }
}
