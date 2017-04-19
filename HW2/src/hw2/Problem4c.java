/*Dean Choi
CSU ID: 2690159
4c). Please explain and show the output for each problem. Explanation is next to
each method instantiation.
 */
package hw2;

public class Problem4c {
    public static void main(String[] args){
        /*Output: "Person". This statement instantiates a new Person class object and calls the printPerson()
        method of that object. The output in this case is "Person" as the "void printPerson()" method present
        in the Person class is run. In that "printPerson()" method, the private method of "getInfo()" in the
        Person class is run to return the string of "Person" to be printed out by the system.*/
        new Person().printPerson();
        
        /*Output: "Person". This statement instantiates a new Student subclass object and calls the 
        printPerson() supermethod of that object. The output in this case is also "Person" as the "void 
        printPerson()" public method present in the Person superclass is run. There is no matching/overriding
        method present in the Student subclass. Since the superclass method in the Person class is being run,
        the "getInfo()" private method of the superclass Person is run/prioritized returning the string of 
        "Person" to again be printed. Because the "getInfo()" method in the Person class is given the 'private' 
        visibility modifier, it can't be overriden in its inherited subclasses. Each "private String getInfo()" 
        method is unique to each class of Person and Student, in this case, and can only be accessed by methods 
        directly within that class (and not by inheritance). In order to print out the "Student" string in this 
        case, either a "public void printPerson()" method must also be included in the Student subclass or the 
        visibility modifier of the "getInfo()" method in the Person superclass must be increased to 'public', 
        'default' or 'protected' (which also means the accompanying "getInfo()" method in the Student subclass
        must have at least that corresponding level of visibility or more).*/
        new Student().printPerson();
    }
}

class Student extends Person {
    private String getInfo() {
        return "Student";
    }
    /*public void printPerson() {
        System.out.println(getInfo());
    }*/
}

class Person {
    private String getInfo() {
        return "Person";
    }
    public void printPerson() {
        System.out.println(getInfo());
    }
}