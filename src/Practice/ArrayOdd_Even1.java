package Practice;

import java.util.Scanner;

public class ArrayOdd_Even1 {


	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("enter num : ");
		n = sc.nextInt();
		if(isEven(n)==0)
			System.out.println("even");
		else
			System.out.println("odd");
	
	}
	public static int isEven(int n) {
		return(n & 1);
	}
}

