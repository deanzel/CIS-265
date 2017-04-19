/*Dean Choi
CSU ID: 2690159
1). Suppose the weekly hours for all employees are stored in a two-dimensional array. Each row
records an employees seven-day work hours with seven columns. For example, the following
array stores the work hours for eight employees. Write a program that displays employees
and their total hours in decreasing order of the total hours:*/
package hw2;

public class Problem1 {
    public static void main(String[] args){
        double[][] hours = {
            {2, 4, 3, 4, 5, 8, 8},
            {7, 3, 4, 3, 3, 4, 4},
            {3, 3, 4, 3, 3, 2, 2},
            {9, 3, 4, 7, 3, 4, 1},
            {3, 5, 4, 3, 6, 3, 8},
            {3, 4, 4, 6, 3 ,4, 4},
            {3, 7, 4, 8, 3, 8, 4},
            {6, 3, 5, 9, 2, 7, 9}
        };
        displayAllHours(hours);
    }
    
    public static void displayAllHours(double[][] hours){
        //columns employee #, total hours
        double[][] totals = new double[hours.length][2];
        
        for (int i=0; i < hours.length; i++){
            double sum = 0;
            double employee = i;
            for (double t : hours[i]){
                sum += t;
            }
            
            //compare hours and reorder in the totals array
            for (int j = 0; j <= i; j++){
                //if the sum is greater than than the current j top total
                if (sum > totals[j][1]){
                    //push down the following totals and add in the new total
                    for (int k = i; k > j; k--){
                        totals[k][0] = totals[k - 1][0];
                        totals[k][1] = totals[k - 1][1];
                    }
                    totals[j][0] = employee;
                    totals[j][1] = sum;
                    break;
                }
                if (j == i){
                totals[j][0] = employee;
                totals[j][1] = sum;
                }
            }
        }
        
        for (int i = 0; i < totals.length; i++){
            System.out.println("Employee #" + (int)totals[i][0] + " - " + totals[i][1] + " hours");
        }
    }
}
    
    

