package final_pract;
import java.uitl.*;

public class reactangle {
	
	/*
	 * Write a program in Java with class Rectangle with the data fields width, length, area and colour. 
	 * The length, width and area are of double type and colour is of string type. The methods are get_length(), 
	 * get_width(), get_colour() and find_area(). Create two objects of Rectangle and compare their area and colour. 
	 * If the area and colour both are the same for the objects then display “Matching Rectangles”, otherwise display “Non-matching Rectangle”.  
	 */
	double width,length,area;
	StringBuffer color=new StringBuffer("");
	
	double get_length() {
		
		return length;
	}
	double get_width() {
		
		return width;
	}
	StringBuffer get_color() {
	
		return color;
	}
	double find_area() {
		double area;
		area= length * width;
		return area;
	}
	
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		reactangle r1=new reactangle();
		reactangle r2=new reactangle();
		
		
		System.out.println("Enter the Info about first Reactangle");
		System.out.println("Enter the length ::");
		r1.length=sc.nextDouble;
		System.out.println("Enter the Width ::");
		r1.width=sc.nextDouble;
		System.out.println("Enter the Colour ::");
		r1.color=sc.next;
		System.out.println("Area of first reactangle:"+r1.find_area());
		
		
		
		System.out.println("Enter the Info about Second Reactangle");
		System.out.println("Enter the length ::");
		r2.length=sc.nextDouble;
		System.out.println("Enter the Width ::");
		r2.width=sc.nextDouble;
		System.out.println("Enter the Colour ::");
		r2.color=sc.next;
		System.out.println("Area of Second reactangle:"+r2.find_area());
		
		if(r1.get_color()==r2.get_color()&&r1.get_length()==r2.get_length()&&r1.get_width()==r1.get_width()&&r1.find_area()==r2.find_area()) {
			System.out.println("Both are same");
		}else {
			System.out.println("Both are not same");
		}
		
		Scanner.close();
		
		
	}
	
	

}
