import java.util.*;

public class Board {
	private String name;
	private List<Square> squares;

	public Board(String name, int squareAmount) {
		setName(name);
		setSquares(squareAmount);
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
	public void setSquares(int squareAmount) {
		squares = new ArrayList<Square>();
		Square aux;
		for(int i=0;i<squareAmount;i++) {
			aux = new Square("Propriedade", 300.50);
			squares.add(aux);
		}
		this.squares = squares;
	}

	public void printSquares(){
		for(int i=0;i<getSquares().size();i++) {
			System.out.print(i + ": ");
			System.out.print(getSquares().get(i).getName() + " ");
			System.out.println(getSquares().get(i).getValue());
		}
		
	}

}
