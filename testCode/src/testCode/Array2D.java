package testCode;
import java.util.*;
class MultiD{
	int TwoD[][]=new int[3][3];
	void getdata() {
		Scanner sc=new Scanner(System.in);
		int i,j ;
		for(i=0;i<3;i++)
			for( j=0;j<3;j++)
			{
				System.out.println("Enter No:");
				TwoD[i][j]=sc.nextInt();
			}
			
	}
	void putdata()
	{
		int i,j;
		
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
				System.out.print(TwoD[i][j]+"  ");
			System.out.println();
		}
	}
}

public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiD md=new MultiD();
		md.getdata();
		md.putdata();

	}

}
