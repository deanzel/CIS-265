/*Dean Choi
CSU ID: 2690159
1). Write a program that randomly generates 1,000,000 integers and sorts them using radix sort.*/
package hw4;
import java.util.*;

public class RadixSort {
    public static void main(String[] args) {
        final int SIZE = 1000000;
        final int LIMIT = 1000000;
        int[] list = new int[SIZE];
        Random r = new Random();
        for (int i = 0; i < list.length; i++) {
            list[i] = r.nextInt(LIMIT);
        }

        radixSort(list, SIZE);
        System.out.println("\nElements after sorting ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }
    
    static int getMax(int[] list, int n)
    {
        int max = list[0];
        for (int i = 1; i < n; i++)
            if (list[i] > max)
                max = list[i];
        return max;
    }
 
    static void countSort(int[] list, int n, int exp)
    {
        int output[] = new int[n];
        int i;
        int count[] = new int[10];
        Arrays.fill(count,0);
 
        for (i = 0; i < n; i++)
            count[ (list[i]/exp)%10 ]++;
        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];
        for (i = n - 1; i >= 0; i--)
        {
            output[count[ (list[i]/exp)%10 ] - 1] = list[i];
            count[ (list[i]/exp)%10 ]--;
        }
        for (i = 0; i < n; i++)
            list[i] = output[i];
    }
 
    static void radixSort(int[] list, int n)
    {
        int m = getMax(list, n);
        for (int exp = 1; m/exp > 0; exp *= 10)
            countSort(list, n, exp);
    }

}
