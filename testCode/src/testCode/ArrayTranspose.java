package testCode;

import java.util.*;

class Transpose11 {
	int a[][] = new int[3][3];
	int i, j;

	void getdat() {
		Scanner sc = new Scanner(System.in);
		for (i = 0; i < 3; i++)
			for (j = 0; j < 3; j++) {
				System.out.println("Enter No:");
				a[i][j] = sc.nextInt();
			}
	}

	void putdata()
	{
		for (i = 0; i < 3; i++)
		{
			for (j = 0; j < 3; j++) 
			{
				System.out.print(a[i][j] + "   ");
			}
			System.out.println();
		}
		
	}

	void Transpose() {
		for (i = 0; i < 3; i++) 
		{
			for (j = 0; j < 3; j++) 
			{
				System.out.print(a[j][i] + "   ");
			}
			System.out.println();
		}
		

	}
}

public class ArrayTranspose {

	public static void main(String[] args) {
		Transpose11 tp = new Transpose11();
		tp.getdat();
		System.out.println();
		System.out.println("Matrix:");
		tp.putdata();
		System.out.println();
		System.out.println("Transpose Matrix:");
		tp.Transpose();

	}

}
