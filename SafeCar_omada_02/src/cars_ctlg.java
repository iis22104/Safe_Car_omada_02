

	import java.util.ArrayList;
	import java.util.List;

public class cars_ctlg {
	    private static ArrayList<car> cars;

	    public cars_ctlg() {
	        this.cars = new ArrayList<>();
	    }

	    public boolean addCar(car car) {
	        for (car v : cars) {
	            if (v.getNumber().equals(car.getNumber())) {
	                System.out.println("Υπάρχει ήδη όχημα με αυτόν τον αριθμό πλαισίου: " + car.getNumber());
	                return false;
	            }
	        }
	        cars.add(car);
	        return true;
	    }

	    public void removeCar(String plateNumber) {
	        cars.removeIf(car -> car.getPlateNumber().equals(plateNumber));
	    }

	    public List<car> getAllCars() {
	        return new ArrayList<>(cars);
	    }

	    public car getCarByPlateNumber(String plateNumber) {
	        return cars.stream()
	                .filter(car -> car.getPlateNumber().equals(plateNumber))
	                .findFirst()
	                .orElse(null);
	    }

	    public List<car> getCarsByBrand(String brand) {
	        List<car> result = new ArrayList<>();
	        for (car car : cars) {
	            if (car.getBrand().equalsIgnoreCase(brand)) {
	                result.add(car);
	            }
	        }
	        return result;
	    }
}


