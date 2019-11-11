public class Car {

	private String make,model;
	private int lcNum,engineCapacity,year;
	
	public Car() {
		super();
	}

	public int getLcNum() {
		return lcNum;
	}

	public void setLcNum(int lcNum) {
		this.lcNum = lcNum;
	}

	public int getEngineCapacity() {
		return engineCapacity;
	}

	public void setEngineCapacity(int engineCapacity) {
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