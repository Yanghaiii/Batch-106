package method;

import java.util.Scanner;

public class Recursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n=sc.nextInt();
		int result=sum(n);
		System.out.println("Sum of the number : " +result);
	}

	public static int sum(int n) {
		// TODO Auto-generated method stub
		if(n==1) {
			return 1;
		}
		else {
			return n+sum(n-1);
		}
	//	return 0;
	}

}
