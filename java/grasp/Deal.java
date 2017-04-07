public class Deal {

	// High Cohesion.
	// Indirection.
	// Pure Fabrication. 
	// - Low coupling.
	public void makeDeal(Player player, Square square) {
		square.setOwner(player);
		System.out.println(square.getOwner().getName());
	}
}
