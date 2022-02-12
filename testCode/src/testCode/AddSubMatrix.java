package testCode;
import java.util.*;
class Addition{
	int a[][]=new int[3][3];
	int b[][]=new int[3][3];
	int c[][]=new int[3][3];
	void getdata()
	{
		Scanner sc=new Scanner(System.in);
		int i,j;
		System.out.println(".........Enter No of First Matrix..............");
		for(i=0;i<3;i++)
			for(j=0;j<3;j++)
			{
				System.out.println("Enter No :");
				a[i][j]=sc.nextInt();
			}
		System.out.println("..........Enter No of Second Metrix............");
		for(i=0;i<3;i++)
			for(j=0;j<3;j++)
			{
				System.out.println("Enter No :");
				b[i][j]=sc.nextInt();			
			}
	}
	void Result()
	{
		int i ,j;
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+"   ");
			}
			System.out.println();
		}
			
		
	}
	void display()
	{
		int i,j;
		System.out.println("First Metrix");
		
		for(i=0;i<3;i++) 
		{
			for(j=0;j<3;j++) 
			{
				System.out.print(a[i][j]+"   ");
			}
		System.out.println();
		}
		System.out.println();
		System.out.println("Second Matrix");
	
	    
	for(i=0;i<3;i++) 
	{
		for(j=0;j<3;j++) 
		{
			System.out.print(b[i][j]+"   ");
		}
	System.out.println();
	}
}
}

public class AddSubMatrix {

	public static void main(String[] args){
		Addition ad=new Addition();
		ad.getdata();
		ad.display();
		System.out.println();
		System.out.println("Addition of Two Matrix");
		ad.Result();
		
		

	}

}
