package Fee_management;

public class student
{
	String name;
	int rollNumber;
	String course;
	double totalFees;
	double feesPaid;
	public student(String name, int rollNumber, String course, double totalFees) {
		super();
		this.name = name;
		this.rollNumber = rollNumber;
		this.course = course;
		this.totalFees = totalFees;
		this.feesPaid = 0;
	}
	
	public void payFees(double amount)
	{
		feesPaid  +=amount;
	}
	
	public double getRemainingFees() {
		return totalFees-feesPaid;
	}
	
	public void diplayDetails() {
		System.out.println("Name :"+name);
		System.out.println("Roll Number :"+rollNumber);
		System.out.println("course :"+course);
		System.out.println("totalFees :"+totalFees);
		System.out.println("feesPaid :"+feesPaid);
		System.out.println("Remaining Fees:"+getRemainingFees());
		
	}
	
	
}
