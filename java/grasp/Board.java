import java.util.*;

public class Board {
	private String name;
	private List<Square> squares;

	public Board(String name) {
		setName(name);
	}
	
	public Board(String name, int squareAmount) {
		setName(name);
		makeBoard(squareAmount);
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public List<Square> getSquares() {
		return this.squares;
	}
	public void setSquares(List<Square> squares) {
		this.squares = squares;
	}

	public void makeBoard(int squareAmount) {
		squares = new ArrayList<Square>();
		Square aux;

		for(int i=0;i<squareAmount;i++) {
 			aux = new Square("Propriedade", 700.12);
			squares.add(aux);
		}
	setSquares(squares);		
	}
}
