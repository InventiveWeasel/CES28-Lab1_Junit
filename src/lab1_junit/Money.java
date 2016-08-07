package lab1_junit;

public class Money {
	
	private int _amount;
	private String _currency;
	
	//Construtor Vazio para o metodo add
	public Money(){
	}

	//Construtor utilizando inicializacao com getter e setter publicos
	public Money(int amount, String currency){
		this.setAmount(amount);
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
		return this._currency;
	}
	
	public void setCurrency(String currency){
		this._currency = currency;
	}
}
