public class Pawn implements Movement{
	private String kind;

	public Pawn(String kind) {
		setKind(kind);
	}

	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	public void move() {
		System.out.println("Movemento Do Pino Simples.");
	}
	
}
