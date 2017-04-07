public class Main {
	public static void main(String[] args) {
		Board board = new Board("Monopoly",10);
		Player player1 = new Player("Mutano");
		Player player2 = new Player("Robin");


		System.out.println("------------------------");
		board.printSquares();
		System.out.println("------------------------");
		
		Deal deal = new Deal();
		deal.makeDeal(player1, board.getSquares().get(4));

		System.out.println("------------------------");
		Pawn carro = new Car("carro");
		Doll boneca = new Doll("boneca");
		carro.move();
		boneca.move();
		System.out.println("------------------------");
		
		Pawn pawn = new Pawn("Peão");
		//pawn.move();
	}
}
