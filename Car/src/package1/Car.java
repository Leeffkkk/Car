package package1;

import org.apache.poi.ss.formula.functions.FinanceLib;

public class Car {
	private double CarCost;
	private double LoanLength;
	private double InterestRate;
	
	public double MonthlyCarPayment() {
		return FinanceLib.pmt(InterestRate/12, LoanLength, CarCost, 0.0, false);
	}
	public double TotalSpentOnInterest() {
		return (this.MonthlyCarPayment() * LoanLength) + CarCost;
	}
	public void setCarCost(double carCost) {
		CarCost = carCost;
	}
	public double getLoanLength() {
		return LoanLength;
	}
	public void setLoanLength(double loanLength) {
		LoanLength = loanLength;
	}
	public void setInterestRate(double interestRate) {
		InterestRate = interestRate;
	}
	
}