package testCode;
class Primary{
	int cal;
	Primary(int y){
		cal=y;
	}
	void show() {
		System.out.println("Super class cal:"+cal);
		
	}
}
class Secondary extends Primary{
	int cal;

	Secondary(int x,int z) {
		super(z);
	
		cal=x;
		
		// TODO Auto-generated constructor stub
	}
	
	void display() {
		System.out.println("sub class cal:"+cal);
	}
}

public class TestCode {

	public static void main(String[] args) {
		Secondary jv=new Secondary(10,20);
		jv.show();
		jv.display();
		
	
		

	}

}
