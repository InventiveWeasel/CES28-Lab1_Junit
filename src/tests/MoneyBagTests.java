package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import lab1_junit.*;

public class MoneyBagTests {
	private MoneyBag bag;
	private Money m;

	@Before
	public void setup(){
		bag = new MoneyBag();
		m = new Money(10, "BRL");
		bag.addMoney(m);
	}
	
	@Test
	public void whenAddingBRLHavingBRLexpectedSumBRL() {
		System.out.println("whenAddingBRLHavingBRLexpectedSumBRL()");
		m = new Money(27, "BRL");
		bag.addMoney(m);
		Money aux = new Money();
		int i;
		
		for(i = 0; i < bag.getMoneys().size(); i++){
			if(bag.getMoneys().get(i).getCurrency().equals(m.getCurrency())){
				aux = bag.getMoneys().get(i);
				break;
			}
		}
		bag.printContent();
		assertEquals(aux.getAmount(),37);
		System.out.println("-----------------------------------");
	}
	
	
	@Test
	public void whenAddingUSDHavingBRLexpectedAddUSDInBag(){
		System.out.println("whenAddingUSDHavingBRLexpectedAddUSDInBag()");
		m = new Money(27, "USD");
		bag.addMoney(m);
		Money aux = new Money();
		int i;
		
		for(i = 0; i < bag.getMoneys().size(); i++){
			if(bag.getMoneys().get(i).getCurrency().equals(m.getCurrency())){
				aux = bag.getMoneys().get(i);
				assertEquals(aux.getAmount(),27);
			}
			if(bag.getMoneys().get(i).getCurrency().equals("BRL")){
				aux = bag.getMoneys().get(i);
				assertEquals(aux.getAmount(),10);
			}
		}
		bag.printContent();
		System.out.println("-----------------------------------");
	}

	@Test
	public void whenConvertingTotalToBRLExpectedToApplyExchangeFactors(){
		int total;
		
		System.out.println("whenConvertingTotalToBRLExpectedToApplyExchangeFactors");
		m = new Money(10,"CHF");
		bag.addMoney(m);
		m = new Money(10,"USD");
		bag.addMoney(m);
		total = bag.amountToBRL();
		System.out.println("Total in BRL: R$"+Integer.toString(total));
		assertEquals(total,60);
		System.out.println("-----------------------------------");
	}
}
