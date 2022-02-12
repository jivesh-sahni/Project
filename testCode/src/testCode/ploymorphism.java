/**
 * 
 */
package testCode;

/**
 * @author HP
 *
 */
class bick{
	
		int speedLimit=80;
		
	
}
 class ploymorphism extends bick
{ 
	

	int speedLimit =140;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		bick obj=new ploymorphism();
	
		System.out.println(obj.speedLimit);
		// TODO Auto-generated method stub

	}

}
