import java.util.*;

public class person {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// BMI operation 
		
		System.out.println("BMI operation ----\n");
		
		System.out.print("Enter your name: "); 
		String name = sc.nextLine();
		
		System.out.print("Enter your weight: ");
		int weight = sc.nextInt();
		
		System.out.print("Enter your height: ");
		double height = sc.nextDouble();
		
		// calling the bmi method 
		
		double bmi = bmi(weight, height);
		
		System.out.println("\nName: " +name);
		System.out.println("Body mass index: " +bmi +"\n");
		
		// Rectangle operation 
		
		System.out.println("\nRectangle operation ----\n");
		System.out.print("Enter the length: ");
		int length = sc.nextInt();
		
		System.out.print("Enter the width: ");
		int width = sc.nextInt();
		
		// calling the rectangle method
		
		rectangle(length, width);
		
		
		
	};
	
	// Method for calculating the BMI index
	
	public static double bmi(double weight, double height) {
		
		return weight / (height * height);
		
	}
	
	// Method for calculating the perimeter and area of rectangle
	
	public static void rectangle(int length, int width){
		
		int perimeter = 2 * (length + width);
		int area = length * width;
		
		System.out.println("\nThe perimeter of the rectangle is: " + perimeter);
		System.out.println("The area of the rectangle is: " + area);
		
	}
	
}
