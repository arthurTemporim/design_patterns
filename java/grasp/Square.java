public class Square {
	private String name;
	private double value;
	private Player owner;

	public Square(String name, double value) {
		setName(name);
		setValue(value);
	}

	public Player getOwner() {
		return this.owner;
	}
	public void setOwner(Player owner) {
		this.owner = owner;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
}

