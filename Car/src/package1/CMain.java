package package1;
import java.util.Scanner;

public class CMain {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Car c1 = new Car();
		System.out.print("Enter Car Cost: ");
		c1.setCarCost(input.nextDouble());
		System.out.print("Enter Loan Length: ");
		c1.setLoanLength(input.nextDouble());
		System.out.print("Enter Interest Rate: ");
		c1.setInterestRate(input.nextDouble());
		System.out.println("Monthly Car Payment: " + c1.MonthlyCarPayment());
		System.out.println("Total Spent On Interestt: " + c1.TotalSpentOnInterest());
		input.close();
	}
}