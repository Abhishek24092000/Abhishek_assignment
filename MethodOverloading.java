package training.assingments.methods;

public class MethodOverloading {
	
	public int area(int a, int b)
	{
		return(a+b);
	}
	
	public int area(float r)
	{
		int area =((int)(r*r)*(22/7));
		return area;
	}
	
	public int area(int l, long b)
	{
		int area = (int)(l*b);
		return area;
	}
	public int area(int s)
	{
		int area =(s*s);
		return area;
	}

	public static void main(String[] args) {
		
		MethodOverloading d = new MethodOverloading();
		
		int ref = d.area(6, 9);
		System.out.println("Add : "+ ref);
		
		int ref2 = d.area(10);
		System.out.println("area of circle : "+ ref2);
		
		int ref3 = d.area(4,5);
		System.out.println("area of rectangle : "+ ref3);
		
		int ref4 = d.area(4);
		System.out.println("area of square : "+ ref4);

	}

}
