import org.junit.Test;

import invoicegenerator.InvoiceGenerator;
import invoicegenerator.Ride;
import junit.framework.Assert;

public class InvoiceServiceTest {
	/**
	 * Test method to calculate total fare of the ride by given distance and time as
	 * the input parameters
	 */
	@Test
	public void whenGivenDistanceAndTimeShouldReturnTotalFare() {
		double distance = 2.0;
		int time = 5;
		InvoiceGenerator cabInvoiceGenerator = new InvoiceGenerator();
		double totalFare = cabInvoiceGenerator.calculateFare(distance, time);
		System.out.println("Total Fare is:" + totalFare);
		Assert.assertEquals(25, totalFare, 0.0);
	}

	/**
	 * Method to calculate minimum fare for the given ride for that minimum fare we
	 * have taken distance as 0.1 and time is 2.
	 */
	@Test
	public void whenGivenLessDistanceOrTimeShouldReturnMinimumFare() {
		double distance = 0.1;
		int time = 1;
		InvoiceGenerator cabInvoiceGenerator = new InvoiceGenerator();

		double fare = cabInvoiceGenerator.calculateFare(distance, time);
		System.out.println("Minimum Fare = " + fare);
		Assert.assertEquals(5, fare, 0.0);
	}
	@Test
	public void whenGivenMultipleRidesShouldReturnTotalFare() {
	Ride[] rides = { new Ride(2.0, 5), new Ride(0.1, 1)};
	InvoiceGenerator cabInvoiceGenerator = new InvoiceGenerator();
	double totalFare = cabInvoiceGenerator.calculateTotalFare(rides);
	System.out.println("Total Fare = "+totalFare);
    Assert.assertEquals(30, totalFare,0.0);
	}
	
}
