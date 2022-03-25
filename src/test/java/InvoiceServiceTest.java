import org.junit.Test;

import invoicegenerator.InvoiceGenerator;
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
		System.out.println("Total Fare is:"+totalFare);
		Assert.assertEquals(25, totalFare, 0.0);
	}
}
