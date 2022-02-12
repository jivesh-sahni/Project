package testCode;
class employee{
	String ename;
	void getename(String name )
	{
		ename= name;
		
	}
	void print_ename()
	{
		System.out.println("Name="+ename);
	}
	
}
class Gross_salary extends employee{
	float basic,da, hra,gsal;
	void cal_gro_Sal(int b,int dapercent,int hrpercent)
	{
		basic = b;
		da= basic*dapercent/100;
		hra=basic*hrpercent/100;
		gsal=basic+da+hra;
		
		
	 
		
		
	}
	void print_gro_sal()// method
	{
		System.out.println("Grosse Salary="+gsal);
		
	}
}
interface Taxes
{
	float ptax=200f;
	float itexpercent=20f;
	float calc_taxes();       //Abstract methods
	
	
}
class salary extends Gross_salary implements Taxes
{
	public float calc_taxes()// Method From Interface
	{
		return ptax+(gsal*itexpercent/100);
		
	}
	void Display()//Method not from interface
	{ 
		float tax=calc_taxes();
		float nsal=gsal;
		print_ename();
		print_gro_sal();
		System.out.println("Taxes = "+tax);
		System.out.println(" Net Salary "+nsal);
		
		
		
	}
	
}
public class MultipleInheritance {

	public static void main(String[] args) {
		salary sc =new salary ();
		sc.getename("jivesh");
		sc.cal_gro_Sal(9100,50, 10);
		sc.Display();
		// TODO Auto-generated method stub

	}

}
