/*
Dean Choi
CSU ID: 2690159
CIS 265
 */
package distancebtwnpoints;
import java.util.Scanner;
import java.lang.Math;

public class DistanceBtwnPoints {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of points: ");
        int numOfPoints = input.nextInt();
        
        //initialize the array of points
        double[][] points = new double[numOfPoints][2];
        System.out.println("Enter " + numOfPoints + " points: ");
        for (int i = 0; i < points.length; i++){
            System.out.println("Enter the coordinates of point #"
                    + (i + 1) + ": ");
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }
        
        //find initial smallest distance
        int p1 = 0, p2 = 1;
        double shortestDistance = distance(points[p1][0], points[p1][1],
                points[p2][0], points[p2][1]);
        
        //Calculate and compare distances between all points
        for (int i = 0; i < points.length; i++){
            for (int j = i + 1; j < points.length; j++){
                double distance = distance(points[i][0], points[i][1],
                        points[j][0], points[j][1]);
                
                if (shortestDistance > distance){
                p1 = i;
                p2 = j;
                shortestDistance = distance;
                }
            }
        }
        //Print out result
        System.out.printf("\nThe closest pair of points are (%5.2f, %5.2f)"
                + " and (%5.2f, %5.2f) with a distance of %5.2f.", 
                points[p1][0], points[p1][1], points[p2][0], points[p2][1],
                shortestDistance);
        
    }
    
    //method to calculate the distance between any two points
    public static double distance(double x1, double y1, double x2, double y2){
        return Math.sqrt((Math.pow(x2 - x1, 2))+ Math.pow(y2 - y1, 2));
    }
    
}
