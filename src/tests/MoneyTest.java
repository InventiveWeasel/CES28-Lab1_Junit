package tests;

import lab1_junit.Money;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MoneyTest {
	private Money m1;
	
	@Before
	public void setup(){
		m1 = new Money(10, "BRL");
	}
	
	@Test
	public void whenAddingBRLExpectSumBRL() {
		Money m2 = new Money(7, "BRL");
		assertTrue(m1.getCurrency().equals(m2.getCurrency()));
		m1 = m1.add(m2);
		assertEquals(m1.getAmount(),17);
	}
	
	
}
