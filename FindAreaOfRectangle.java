package mnc;
import java.util.Scanner;
public class FindAreaOfRectangle {
		public static void main(String[] args) {
			
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter the length of rectangle: ");
			double length=scanner.nextDouble();
			System.out.println("Enter the width of rectangle: ");
			double width=scanner.nextDouble();
			
			double area=length*width;
			System.out.println("Area of rectsngle is:"+area);
		}
}
