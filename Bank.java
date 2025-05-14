package training.assingments.methods;

//Method overriding 
class Bankk{
	float roi = 3.4f;
	
	void print() {
		System.out.println("The roi is :" + roi);
	}
}
class Axisbank extends Bankk{
		float roi = 4.4f;
		
		void print() {
			System.out.println("The roi is :" + roi);
		}
}
class SBIbank extends Bankk{
			float roi = 6.4f;
			
			void print() {
				System.out.println("The roi is :" + roi);
			}
}
class icic extends Bankk{
			float roi = 2.5f;
			
			void print() {
				System.out.println("The roi is :" + roi);
			}
}
public class Bank {

	public static void main(String[] args) {
		Bankk b;
		b = new Axisbank();
		b.print();
		
		b = new SBIbank();
		b.print();
		
		b = new icic();
		b.print();
	}
}

