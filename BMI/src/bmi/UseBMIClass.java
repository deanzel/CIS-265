public class UseBMIClass {
  public static void main(String[] args) {
	 //new BMI first object for "John",18, 145, 70
	 BMI bmi1 = new BMI("John", 18, 145, 70);
         System.out.println("The BMI for " + bmi1.getName() + " is "
      + bmi1.getBMI() + " which is " + bmi1.getStatus());
     
        //new BMI second object for "Peter",215, 70
	 BMI bmi2 = new BMI("Peter", 215, 70);
         System.out.println("The BMI for " + bmi2.getName() + " is "
      + bmi2.getBMI() + " which is " + bmi2.getStatus());
  }
}