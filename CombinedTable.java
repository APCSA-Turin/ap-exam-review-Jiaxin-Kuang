
public class CombinedTable{
	SingleTable firstTable; 
	SingleTable secondTable;
	
	public CombinedTable(SingleTable firstTable, SingleTable secondTable){
		this.firstTable = firstTable;
		this.secondTable = secondTable;
	}

	public boolean canSeat(int people){
		if(people <= firstTable.getNumSeats() + secondTable.getNumSeats() - 2){
		return true;
	}
	else{
		return false;
	}
}
	public double getDesirability(){
		double baseDesirability = (firstTable.getViewQuality() + secondTable.getViewQuality())/ 2;
		if(firstTable.getHeight() == secondTable.getHeight()){
			return baseDesirability;
		}
		else{
			return baseDesirability - 10;
		}
	}
}
