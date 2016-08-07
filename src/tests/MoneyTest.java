package tests;

import lab1_junit.Money;
import static org.junit.Assert.*;

import org.junit.Test;

public class MoneyTest {

	@Test
	public void whenAddingBRLExpectSumBRL() {
		Money m1 = new Money(10, "BRL");
		Money m2 = new Money(7, "BRL");
		assertTrue(m1.getCurrency().equals(m2.getCurrency()));
		m1 = m1.add(m2);
		assertEquals(m1.getAmount(),17);
	}
	

}
