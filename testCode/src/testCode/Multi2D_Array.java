package testCode;

public class Multi2D_Array {

	public static void main(String[] args) {
		int k=0;
		// TODO Auto-generated method stub
		int TowD[][]=new int[4][5];
		for(int i=0;i<4;i++)
			for(int j=0;j<5;j++) {
				TowD[i][j]=k;
				k++;
			}
		int i,j;
		for(i=0;i<4;i++)
		{
			for(j=0;j<5;j++)
			
				System.out.print(TowD[i][j]+"  ");
				System.out.println();

			}

	}

}
