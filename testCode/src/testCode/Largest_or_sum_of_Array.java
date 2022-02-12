package testCode;

public class Largest_or_sum_of_Array {

	public static void main(String[] args) {
		double list[]= {1.2,3.4,3.8,2.9,3.6};
		for(int i=0;i<list.length;i++) {
			System.out.println(list[i]);
		
		}
		double sum=0;
		for(int i=0;i<list.length;i++) {
			sum=sum+list[i];
			
			
		}
		System.out.println("Sum of Arry:"+sum);
		double Max=list[0];
		for(int i=1;i<list.length;i++) {
			if(list[i]>Max) {
				Max=list[i];
			}
		}
		System.out.println("Max is "+Max);

	}

}
