public class Car {

	private String lcNum;
	private String engineCapacity,make,model;
	private int year;
	
	public Car() {
		super();
	}

	public String getLcNum() {
		return lcNum;
	}

	public void setLcNum(String lcNum) {
		this.lcNum = lcNum;
	}

	public String getEngineCapacity() {
		return engineCapacity;
	}

	public void setEngineCapacity(String engineCapacity) {
		this.engineCapacity = engineCapacity;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
}