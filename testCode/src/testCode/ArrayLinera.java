package testCode;

import java.util.*;

class linear
{
	int a[] = new int[10], key, flag,position;

	void getdata()
	{
		int i;
		Scanner sc = new Scanner(System.in);
		for (i = 0; i < 5; i++)
		{
			System.out.println("Enter No:");
			a[i] = sc.nextInt();
		}
		System.out.println("Enter No to search:");
		key = sc.nextInt();

	}



	void search() {
		int i;
		for(i=0;i<5 && flag==0;i++)
		{
			if(a[i]==key)
			{
				flag=1;
				position=i+1;
			}
			
				
		}
		if(flag==1)
			System.out.println("Number Founded:"+position);
		else
			System.out.println("Number Not Founded:");

	}
}

public class ArrayLinera {

	public static void main(String[] args) {
		linear lr=new linear();
		// TODO Auto-generated method stub
		lr.getdata();
		lr.search();
		
		
			
		
		
	   

	}

}
