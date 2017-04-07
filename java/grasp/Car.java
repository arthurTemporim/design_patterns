public class Car extends Pawn {
	
	public Car(String kind) {
		super(kind);
	}

	// Polymorphism.
	public void move() {
  	System.out.println("VRUUUUM!");
  }
	
}
