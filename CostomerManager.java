package inheritance;

public class CostomerManager {
	public void add(Costomer costomer) {
		System.out.println(costomer.costomerNumber + " Kaydedildi. ");
	}
	
	//Bulk insert 
	public void addMultiple (Costomer [] costomers) {
			for (Costomer costomer : costomers) {
			add(costomer);			
		}
	}
	
}
