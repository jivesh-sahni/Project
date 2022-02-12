package testCode;

public class Array_Odd_Even {

	public static void main(String[] args) {
		int My_array[]= {10,23,54,61,32,22};
		System.out.println("Even Array Element");
		for(int i=0;i<My_array.length;i++)
		{
			if(My_array[i]%2==0) {
				System.out.println(My_array[i]);
			}
		}
		System.out.println("Odd Array element:");
		for(int i=0;i<My_array.length;i++)
		{
			if(My_array[i]%2!=0) {
				System.out.println(My_array[i]);
			}
		}
		

	}

}
