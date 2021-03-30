package p1;

import java.util.Scanner;
public class Salary {

	public static void main(String[] args) {
		
		System.out.println("Enter Basic Salary: ");
		
		Scanner sc =  new Scanner(System.in);
		
		int basicsalary = sc.nextInt();
		double HRA = 0.40 * basicsalary;
		double DA = 0.60 * (basicsalary + HRA);
		
		if(basicsalary >= 2000000 || basicsalary <= 6000000 )
		{
			double Tax = 0.10 * basicsalary;
			System.out.println("Tax: "+Tax);
		}
		else if(basicsalary > 6000000)
		{
			double Tax = 0.20 * basicsalary;
			System.out.println("Tax: "+Tax);
		}
		System.out.println("HRA :"+HRA);
		System.out.println("DA :"+DA);
		
		
	}
}