package method;

import java.util.Scanner;

public class SumNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number 1 : ");
		int num1=sc.nextInt();
		
		System.out.print("Enter Number 2 : ");
		int num2=sc.nextInt();
		
		sum(num1, num2);
		sum(3,4,5);
		sum(106, 109);
		sum(2.5,5.5);
	//	int result=num1+num2;
	//	System.out.println("Sum of these two numbers : " +result);
		
		sc.close();
	}
	public static void sum(double d, double e) {
		// TODO Auto-generated method stub
		System.out.println("Sum of the double numbers : " +(d+e));
	}
	public static void sum(int i, int j, int k) {
		// TODO Auto-generated method stub
		System.out.println("Sum of the numbers : " +(i+j+k));
	}
	public static void sum(int n1, int n2)
	{
		int result=n1+n2;
		System.out.println("Sum of the numbers : " +result);
	}

}
