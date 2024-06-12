

public class car {
		private String plateNumber;
		private String model;
		private String brand;
		private int cc;
		private String colour;
		private String year;
		private  String number;
		
		public String getNumber() {
			return number;
		}
		public String getPlateNumber() {
			return plateNumber;
		}
		public void setPlateNumber(String plateNumber) {
			this.plateNumber = plateNumber;
		}
		public String getModel() {
			return model;
		}
		public void setModel(String model) {
			this.model = model;
		}
		public String getBrand() {
			return brand;
		}
		public void setBrand(String brand) {
			this.brand = brand;
		}
		public int getCc() {
			return cc;
		}
		public void setCc(int cc) {
			this.cc = cc;
		}
		public String getColour() {
			return colour;
		}
		public void setColour(String colour) {
			this.colour = colour;
		}
		public car(String brand,String model, String plateNumber, String year, String number) {
			super();
			this.plateNumber = plateNumber;
			this.model = model;
			this.brand = brand;
			this.year = year;
			this.number = number;
		}
		
		
		
		
		
		
		
		
		}

