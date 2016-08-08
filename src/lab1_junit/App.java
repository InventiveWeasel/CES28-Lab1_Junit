package lab1_junit;

public class App {
	
	public static void main(String[] args){
		Money m;
		MoneyBag bag = new MoneyBag();
		
		m = new Money(10, "BRL");
		bag.addMoney(m);
		m = new Money(37, "USD");
		bag.addMoney(m);
		m = new Money(250, "CHF");
		bag.addMoney(m);
		m = new Money(78, "EUR");
		bag.addMoney(m);
		m = new Money(54, "USD");
		bag.addMoney(m);
		
		bag.printContent();
		
	}

}
