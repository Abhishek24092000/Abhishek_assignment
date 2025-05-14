package training.assingments.methods;

public class Democonstruct {
	
	public int sum(int a,int b)
	{
		return (a+b);
	}
	public int sub(int a, int b)
	{
		return (a-b);
	}

	public static void main(String[] args) {
		Democonstruct  b = new Democonstruct();
		
		int ref = b.sum(5,9);
		System.out.println("The sum of the number "+ ref);
		
		int ref2 = b.sub(8, 5);
		System.out.println("After Sub. the number "+ ref2);
	}

}
