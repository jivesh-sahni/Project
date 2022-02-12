// include two programs 
//1. sum of Array

//2.product of Array
package testCode;
import java.util.*;

public class sumofArray {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size,i,sum=0,product=1;
		System.out.println("Enter Size of array:");
		size=sc.nextInt();
		int a[]=new int[size];
		
		for(i=0;i<size;i++)
		{
		System.out.println("Enter No:");
		a[i]=sc.nextInt();
		}
		for(i=0;i<size;i++)
		{
			sum=sum+a[i];
			product=product*a[i];
		}
		System.out.println("Sum of Array:"+sum);
		System.out.println("Product of Array:"+product);

	}

}
