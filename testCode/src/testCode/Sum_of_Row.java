package testCode;
import java.util.*;
class sumRow{
	int a[][]=new int[3][3];
	int i,j;
	void getdat()
	{
		Scanner sc=new Scanner(System.in);
		for(i=0;i<3;i++)
			for(j=0;j<3;j++)
			{
				System.out.println("Enter No:");
				a[i][j]=sc.nextInt();
			}
	}
	void displayMatrix()
	{
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(a[i][j]+"   ");
			}
			System.out.println();
		}
	}
	void sumofRow()
	{
		int i,j,sum;
		for(i=0;i<3;i++)
		{
			sum=0;
			for(j=0;j<3;j++)
			{
				sum=sum+a[j][i];
			}
			System.out.println((i+1)+" Row Sum :"+sum);
		}
	}
}

public class Sum_of_Row {

	public static void main(String[] args) {
		sumRow sr=new sumRow();
		sr.getdat();
		System.out.println();
		System.out.println("Matrix:");
		sr.displayMatrix();
		System.out.println();
		System.out.println("Sum of Row:");
		sr.sumofRow();
		// TODO Auto-generated method stub

	}

}
