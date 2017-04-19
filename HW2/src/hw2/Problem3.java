/*Dean Choi
CSU ID: 2690159
3). Design a class named Fan.
*/
package hw2;

public class Problem3 {
    public static void main(String[] args){
        Fan fan1 = new Fan(3, true, 10, "yellow");
        Fan fan2 = new Fan(2, false, 5, "blue");
        
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}

class Fan {
    public final static int SLOW = 1;
    public final static int MEDIUM = 2;
    public final static int FAST = 3;
    
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";
    
    public int getSpeed() {return this.speed;}
    public void setSpeed(int speed) {this.speed = speed;}
    public boolean getOn() {return this.on;}
    public void setOn(boolean on) {this.on = on;}
    public double getRadius(){return this.radius;}
    public void setRadius(double radius){this.radius = radius;}
    public String getColor(){return this.color;}
    public void setColor(String color){this.color = color;}
    
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }
    
    public Fan(){
        this(SLOW, false, 5, "blue");
    }
    
    public String toString(){
        if (this.on) {
            return "Fan Speed: " + this.speed + ", Color: " + this.color + ", Radius: " + this.radius;
        }
        else {
            return "Color: " + this.color + ", Radius: " + this.radius + ", fan is off";
        }
    }
}

