package testCode;

class raja implements Runnable
{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println("Thread of raja:"+i);
        }
        System.out.println("End of thread");

    }
} 
public class runnable {
    public static void main(String[] args) {
        raja rj=new raja();
        Thread tt=new Thread(rj);
        tt.start();
        System.out.println("End of Main Thread");
        
    }
    
}
