package testCode;

import java.util.Scanner;

public class arrayDemo {
    public static void main(String[] args) {
        int[] a=new int[10];
        int i;
        Scanner sc= new Scanner(System.in);
        for( i=0;i<10;i++)
        {
            System.out.println("Enter No:");
            a[i]=sc.nextInt();
        }
        for(i=0;i<10;i++)
        {
        
            System.out.print(a[i]);
            System.out.print(" ");
        }
        
        
        
    }
    
}
