package day3;

public class InheritanceUsedForOverridingPolymorphismDemo 
{
	int a=2;
	int b=3;
	int c;
	
	void sum()
	{
		c=a+b;
		System.out.println("result:"+c);
	}
		void multiplication(int a,double b)
		{
			System.out.println("parent result of multipliation");
			System.out.println("hello child");
		}
		void display()
		{
			System.out.println("hello child");
		}
		
public static void main(String[] args) 
	{
		InheritanceUsedForOverridingPolymorphismDemo iufopd = new InheritanceUsedForOverridingPolymorphismDemo();
		iufopd.sum();
		iufopd.multiplication(3, 2.5);
		A a = new A();
		a.display();
		iufopd.display();
	}

class A

{
	void multiplication(int a,double b)
	{
	System.out.println("parent result of multiplication:"+(a*b));
     }
		void display()
			{
				System.out.println("hello PArent");
			}
}
}


