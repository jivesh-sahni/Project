package testCode;
import java.lang.*;
class jivesh extends Thread
{ 
	public void run()
    {
        for(int i=1;i<=50;i++)
        System.out.println("I ="+i);
    }

}
class jivesh2 extends Thread
{
    public void run()
    {
        for(int j=1;j<=50;j++)
        System.out.println("J="+j);
    }
}
class jivesh3 extends Thread
{
    public void run()
    {
        for(int k=1;k<=50;k++)
        System.out.println("K="+k);
    }
}




public class jivesh1122 {
	 public static void main(String[] args)
     {
       new jivesh().start();
       new jivesh2().start();
       new jivesh3().start();
        
       
    }

}
