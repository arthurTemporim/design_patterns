public class Pawn implements Movement {
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
		if(this.getKind() == "carro") {
			System.out.println("VRUUUUM!");
		} else if(this.getKind() == "boneca") {
			System.out.println("Barbie!");
		} else {
			System.out.println("Esse Pino não existe!");
		}
	}
}
