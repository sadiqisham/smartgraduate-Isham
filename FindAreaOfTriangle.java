package mnc;

import java.util.Scanner;
 class FindAreaOfTriangle {

	 	public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
			
			
			System.out.println("Enter the width of the triangle: ");
			double base=scanner.nextDouble();
			
			System.out.println("Enter the height of the triangle: ");
			double height=scanner.nextDouble();
			
			double area=(base*height)/2;
			System.out.println("Area of a triangle is: "+ area);
			
		}

}
