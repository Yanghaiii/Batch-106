package method;

import java.util.Scanner;

public class Rectangle_Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter height of a Rectangle : ");
		int h=sc.nextInt();
		
		System.out.print("Enter width of a Rectangle : ");
		int w=sc.nextInt();
		
		multiply(h, w);
		sc.close();
		
	}
	public static void multiply(int num1, int num2)
	{
		int result=num1*num2;
		System.out.println("The Area of that Rectangle : " +result);
	}

}