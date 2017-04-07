public class Square {
	private String name;
	private double value;
	
	public Square(String name, double value) {
		setName(name);
		setValue(value);
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public double getValue() {
		return this.value;
	}
	public void setValue(double value) {
		this.value = value;
	}
}
