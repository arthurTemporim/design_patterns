public class Deal {

	public void makeDeal(Player player, Square square) {
		square.setOwner(player);
		System.out.println(square.getOwner().getName());
	}
}
