import java.util.ArrayList;

public class accident_ctlg {
	public class Catalogue {
	    private ArrayList<accident> accidents;

	    public Catalogue() {
	        this.accidents = new ArrayList<>();
	    }

	    public void addAccident(accident accident) {
	        accidents.add(accident);
	    }

	    

	    public ArrayList<accident> getAccidents() {
	        return new ArrayList<>(accidents);
	    }
}
}
