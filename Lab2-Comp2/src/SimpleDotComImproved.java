import java.util.ArrayList;


public class SimpleDotComImproved {
	
	int numeberOfHits = 0;
	private ArrayList<String> locationCells;
	
	public void setLocationCells (ArrayList<String> locs) {
		locationCells = locs;
	}
	
	public String CheckYourSelf(String guess) {
		String result = "miss";
		int index = locationCells.indexOf(guess);
		
		if (index >= 0) {
			locationCells.remove(index);
			
			if (locationCells.isEmpty()) {
				result = "kill";
			}
			
			else {
				result = "hit";
			}
		}
		System.out.println(result);
		return result;
	}

}
