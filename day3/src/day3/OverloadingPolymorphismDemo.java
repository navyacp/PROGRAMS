package day3;

public class OverloadingPolymorphismDemo {
	
	void adiition(int a ,int b, int c)
	{
		System.out.println("result:"+(a+b));
	}
	void addition(int a,int b,double c)
	{
		
	}
	void addition(int a ,int b,int c,int d) 
	{
		System.out.println("result:"+ (a+b+c+d));
	}
	void addition(int a,int b)
	{
		System.out.println("result:"+(a+b));
	}
	public OverloadingPolymorphismDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args)
	{
		OverloadingPolymorphismDemo olpd = new OverloadingPolymorphismDemo();
		olpd.addition(2, 5);
		olpd.addition(2, 5,5,6);
		
		
		// TODO Auto-generated method stub

	}

}
