/*Dean Choi
CSU ID: 2690159
4a). Please explain and show the output for each problem. Explanation is next to
each method instantiation.
 */
package hw2;

class Animal {
    void walk() {
        System.out.println("I am walking");
    }
}
class Bird extends Animal {
    void fly() {
        System.out.println("I am flying");
    }
}

public class Problem4a {
    public static void main(String[] args){
        //instantiating a Bird subclass object which extends the superclass of Animal.
        Bird bird = new Bird();
        
        /*Output: "I am walking". Calls the 'void walk()' superclass method in the inherited Animal 
        class due to there being no matching method signature and return type in the Bird subclass. 
        It goes up the inheritance chain and calls the present super method.*/
        bird.walk();
        
        /*Output: "I am flying". Calls the 'void fly()' subclass method in the Bird subclass. Since 
        the matching method signature and return type is present in the subclass, there is no need 
        for JVM to go up the inheritance chain.*/
        bird.fly();
    }
}
