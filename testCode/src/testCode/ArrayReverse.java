package testCode;
import java.util.*;
public class ArrayReverse {
	public static void main(String args[])
	{
	int a[]=new int[5];
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter 5 No:");
	for(int i=0;i<5;i++)
	
		
			a[i]=sc.nextInt();
			System.out.println("Array element in order:");
			for(int i=4;i>=0;i--)
				System.out.println("a["+i+"]="+a[i]);
				
	
	}


}
