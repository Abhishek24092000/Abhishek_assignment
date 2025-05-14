package training.assingments.methods;

class Employee{
	int Empid;
	String empname;
	float salary;
	
	Employee(int Empid, String empname, float salary){
		this.Empid = Empid;
		this.empname = empname;
		this.salary = salary;
	}
	
	public void display() {
		System.out.println("The emp detal are :" + Empid + " " + empname + " " + salary);
	}
}
class SubEmployee extends Employee{
	int bonus;
	
	SubEmployee(int Empid, String empname, float salary, int bonus){
		super(Empid,empname,salary);
		this.bonus = bonus;
	}
	 public void calculate() {
		 float final_sal = salary + (bonus * salary)/100;
		 System.out.println("The final salaray :" + final_sal);
	 }
 
}

public class EmployeeDemo {

	public static void main(String[] args) {
		
		SubEmployee sb = new SubEmployee(101, "Rahul", 35000f, 5000);
		sb.display();
		sb.calculate();

	}

}
