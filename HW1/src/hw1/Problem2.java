/*
Dean Choi
CSU ID: 2691059
2). After the break statement in (a) is executed in the following loop, which statement is executed?
Show the output. After the continue statement in (b) is executed in the following loop, which
statement is executed? Show the output.
 */
package hw1;

/**
 *
 * @author deanchoi
 */
public class Problem2 {
    public static void main(String[] args){
        
        //2a: break means “stop and exit the loop”.
        //After the break statement is excuted, the System.out.println(i) is executed.
        System.out.println("Problem 2a:");
        for (int i = 1; i < 4; i++){
            for (int j = 1; j < 4; j++){
                if (i*j > 2)
                    break;
                System.out.println(i*j);
            }
            System.out.println(i);
        }
        
        System.out.println("Problem 2b:");
        //2b: continue means “skip the current loop and go on to the next time loop”.
        //After continue statement in (b), for(int j=1; j<4; j++) is executed.
        for (int i = 1; i < 4; i++){
            for (int j = 1; j < 4; j++){
                if (i*j > 2)
                    continue;
                System.out.println(i*j);
            }
            System.out.println(i);
        }
    }
}
