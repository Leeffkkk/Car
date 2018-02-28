package packagetest;

import static org.junit.Assert.*;

import org.junit.Test;

import package1.Car;

import java.util.Random;

public class CarTest {

	@Test
	public void TestCar() {
		
		
		
		for (int a = 0; a<10000; a++) {
			Random rand = new Random();
			Car c = new Car();
			c.setCarCost((double)rand.nextInt(100000)+1);
			c.setInterestRate((rand.nextInt(50)+1)*0.01);
			c.setLoanLength((double)rand.nextInt(100)+1);
			assertTrue(c.MonthlyCarPayment() < 0);
			assertTrue(c.TotalSpentOnInterest() < 0);
			assertTrue(c.MonthlyCarPayment()*c.getLoanLength() < c.TotalSpentOnInterest());
		}
	}
}
