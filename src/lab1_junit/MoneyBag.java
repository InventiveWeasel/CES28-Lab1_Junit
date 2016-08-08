package lab1_junit;

import java.util.ArrayList;

public class MoneyBag {
	
	private ArrayList<Money> moneys;
	
	public MoneyBag(){
		moneys = new ArrayList<Money>();
	}
	
	public ArrayList<Money> getMoneys(){
		return this.moneys;
	}
	
	public void addMoney(Money m){
		boolean exist = false;
		int i;
		Money aux;
		
		for(i = 0; i < this.moneys.size(); i++){
			if(this.moneys.get(i).getCurrency().equals(m.getCurrency())){
				exist = true;
				aux = this.moneys.get(i);
				aux.setAmount(aux.getAmount()+m.getAmount());
				break;
			}
		}
		
		if(exist == false){
			this.moneys.add(m);
		}
	}
	
	public void printContent(){
		int i;
		Money aux;
		for(i = 0; i < this.moneys.size(); i++){
			aux = this.moneys.get(i);
			System.out.println(aux.getCurrency()+": "+Integer.toString(aux.getAmount()));
		}
	}
	
	public int amountToBRL(){
		int i;
		Money aux = new Money();
		int total = 0;
		
		for(i = 0; i<this.getMoneys().size(); i++){
			aux = this.getMoneys().get(i);
			if(aux.getCurrency().equals("BRL"))
				total = total + aux.getAmount();
			else if(aux.getCurrency().equals("CHF"))
				total = total + 2*aux.getAmount();
			else if(aux.getCurrency().equals("USD"))
				total = total + 3*aux.getAmount();
		}
		return total;
	}
}
