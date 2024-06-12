import java.util.ArrayList;
		import java.util.List;

public class main {

	public static void main(String[] args) {
			
		//δημιουργία καταλόγων για πελάτες, οχήματα,ασφαλιστικά πακέτα.
	
			client_ctlg clientCatalogue = new client_ctlg();
			cars_ctlg carCatalogue = new cars_ctlg();
			InsurancePakcetCatalogue insurancePackets = new InsurancePakcetCatalogue();
			contract_ctlg contractCatalogue = new contract_ctlg();
			//δημιουργία πελατών, οχημάτων, ασφαλιστικών πακέτων.
			client client1 = new client("Maria" ,"Papadopoulou","2310264368","maria.papadopoulou@gmail.com","AO79432");
			client client2 = new client("Evanthia","Papagianni","2310245368","evanthia.papagianni@gmail.com","AO77813");
			client client3 = new client("Vasilis","Karagiannis","2310245668","ioannis.karagiannis@gmail.com","AO45698");
			
			car car1 = new car("Mercedes", "GLC", "XKP8923", "2020","7C3FR76A515072256");
			car car2 = new car("Subaru", "Forester", "NII4269", "2018","7C3FR76A555071465");
			car car3 = new car("Ford", "Ranger", "KOH4681", "2022","7C3FR76A55504645");

			insPackets insPackets1 = new insPackets("ΜI93", "Mikti asfalisi", "6");
			insPackets insPackets2 = new insPackets("B56", "Basiki asfalisi", "6");
			insPackets insPackets3 = new insPackets("O58", "Me odiki", "6");
			//προσθήκη πελατών, οχημάτων.
			clientCatalogue.addClient(client1);
			clientCatalogue.addClient(client2);
			clientCatalogue.addClient(client3);
			
			carCatalogue.addCar(car1);
			carCatalogue.addCar(car2);
			carCatalogue.addCar(car3);
			
			insurancePackets.addInsurancePacket(insPackets3);
			insurancePackets.addInsurancePacket(insPackets2);
			insurancePackets.addInsurancePacket(insPackets1);
		
			//δημιουργία συμβολαίων.
			contract contract1 = new contract(1, client1.getLicence(), car1.getNumber(), insPackets2.getId(), 60);
		    contract contract2 = new contract(2, client2.getLicence(), car2.getNumber(), insPackets1.getId(), 120);
		    contract contract3 = new contract(3, client3.getLicence(), car3.getNumber(), insPackets3.getId(), 80 );
		    
		    contract_ctlg.addContract(contract1);
		    contract_ctlg.addContract(contract2);
		    contract_ctlg.addContract(contract3);
		    
		    for(contract c: contractCatalogue.getContracts()) {
		    	String carId = c.getCarId();
		    	String clientId = c.getClientId();
		    	String packetId = c.getInsPacketId();
		    	int cost = c.getCost();
		    	String name = null;
		    	String plateNumber = null;
		    	String packetName = null;
		    	
		    	for(client cl: clientCatalogue.getClients()) {
		    		if (cl.getLicence().equals(clientId)) {
		    			 name = cl.getName();
		    		}
		    	for(car car: carCatalogue.getAllCars()) {
			    		if (car.getNumber().equals(carId)) {
			    			 plateNumber = car.getPlateNumber();}
			   
			    for(insPackets ip: insurancePackets.getAllInsurancePackets() ) {
			    	if (ip.getId().equals(packetId)) {
			    		packetName = ip.getPacketName();
			    		
			    	}
			    }
		    		
		    	}
		    		    	
		      }
		    	System.out.println("NAME: " + name + "| plate number: " + plateNumber + "| Packet description: "
		    						+ packetName + "| cost: " + cost); 
			}
		    
		    for(client cl: clientCatalogue.getClients()) {
	    		String clientId = cl.getLicence();
	    		int totalCost =0;
	      		System.out.println("Client: " + cl.getName() + " " + cl.getlName());
	    		for(contract c: contractCatalogue.getContracts()) {
	    			if(c.getClientId().equals(clientId)) {
	    				 String carId = c.getCarId();
	    				 totalCost += c.getCost();
	    			for(car car: carCatalogue.getAllCars()) {
	    					if(car.getNumber().equals(carId)) {
	    						System.out.println("VEHICLES|||"+ " Brand: " + car.getBrand()
	    												+ " | Model: " + car.getModel()+ " | Plate Number: "+ car.getPlateNumber()+ "\n");
	    				}
	    				}
	    			
	    			}
	     		}System.out.println("Total cost of contracts: " + totalCost);
	   		}
		    
}
}



