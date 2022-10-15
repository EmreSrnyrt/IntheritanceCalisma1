 package inheritance;

public class Main {

	public static void main(String[] args) {
		
		IndividualCostomer engin = new IndividualCostomer();
		engin.costomerNumber = "12345";
		
	
		CorporateCostomer hepsiBurada = new CorporateCostomer();
		hepsiBurada.costomerNumber = "78910";
		
		
		SendikaCostomer abc = new SendikaCostomer();
		abc.costomerNumber = "99999";
		
		
		CostomerManager costomerManager = new CostomerManager();
		//costomerManager.add(hepsiBurada);
		//costomerManager.add(engin);
		//costomerManager.add(abc);
		
		
		Costomer[] costomers = {engin,hepsiBurada,abc};
		
		costomerManager.addMultiple(costomers);
		
		
		
		
	}

}
