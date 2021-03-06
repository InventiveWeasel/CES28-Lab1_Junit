package lab1_junit;

public class Money extends AbstractCurrency{
	
	private int _amount;
	private Currency _currency;
	
	//Construtor Vazio para o metodo add
	public Money(){
		this._currency = new Currency();
	}

	//Construtor utilizando inicializacao com getter e setter publicos
	public Money(int amount, String currency){
		this.setAmount(amount);
		this._currency = new Currency();
		this.setCurrency(currency);	
	}
	
	public Money add(Money m){
		Money money = new Money();
		money.setAmount(this.getAmount() + m.getAmount());
		return money;
	}
	
	public int getAmount(){
		return this._amount;
	}
	
	public void setAmount(int amount){
		this._amount = amount;
	}
	
	public String getCurrency(){
		return this._currency.getCurrency();
	}
	
	public void setCurrency(String currency){
		this._currency.setCurrency(currency);
	}
}
