import java.util.ArrayList;
import java.util.List;

public class contract_ctlg {
	

	
	   private static  ArrayList<contract> contracts;

	    public contract_ctlg() {
	        this.contracts = new ArrayList<>();
	    }

	    public static  void addContract(contract contract) {
	        contracts.add(contract);
	    }

	    public void removeContract(int id) {
	        contracts.removeIf(contract -> contract.getId() == id);
	    }

	  
	    public ArrayList<contract> getContracts() {
	        return contracts;
	    }
}
