package Fee_management;

import java.util.Scanner;

public class FeesManagementsytem
{
 public static void main(String[] args) 
 {
	 Scanner nc  =new  Scanner(System.in);
	 student student  =new student("divya",11,"computer Science",5000);
		System.out.println("Enter the amount to pay:");
		double paymentAmount = nc.nextDouble();
		student.payFees(paymentAmount);
		student.diplayDetails();
		nc.close();
 }
}
