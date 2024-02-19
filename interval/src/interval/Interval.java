package interval;

/**
 * Elke instantie van deze klasse slaat een interval op de gehele as op.
 * 
 * @invar De lengte is niet negatief. (Abstractetoestandsinvariant)
 *     | 0 <= getLengte()
 * @invar De bovengrens is gelijk aan de ondergrens plus de lengte.
 *     | getBovengrens() == getOndergrens() + getLengte()
 */
public class Interval {

	/**
	 * @invar Het veld `lengte` is niet negatief. (Concretetoestandsinvariant)
	 *     | 0 <= lengte
	 */
	private int ondergrens;
	private int lengte;
	
	public int getOndergrens() {
		return ondergrens;
	}
	
	public int getBovengrens() {
		return ondergrens + lengte;
	}
	
	public int getLengte() {
		return lengte;
	}
	
	/**
	 * Initialiseert dit object met de gegeven ondergrens en bovengrens.
	 * 
	 * @pre De gegeven bovengrens is niet kleiner dan de gegeven ondergrens.
	 *     | initiëleOndergrens <= initiëleBovengrens
	 * @post De ondergrens van het nieuwe object is gelijk aan de gegeven ondergrens.
	 *     | getOndergrens() == initiëleOndergrens
	 * @post De bovengrens van het nieuwe object is gelijk aan de gegeven bovengrens.
	 *     | getBovengrens() == initiëleBovengrens
	 */
	public Interval(int initiëleOndergrens, int initiëleBovengrens) {
		this.ondergrens = initiëleOndergrens;
		this.lengte = initiëleBovengrens - initiëleOndergrens;
	}
	
	/**
	 * Stelt de ondergrens van dit object in op de gegeven waarde.
	 * @pre De gegeven ondergrens is niet groter dan de bovengrens van dit object.
	 *     | nieuweOndergrens <= getBovengrens()
	 * @mutates | this
	 * @post De ondergrens van dit object is gelijk aan de gegeven ondergrens.
	 *     | this.getOndergrens() == nieuweOndergrens
	 * @post De lengte blijft ongewijzigd.
	 *     | getLengte() == old(getLengte())
	 */
	public void setOndergrens(int nieuweOndergrens) {
		this.ondergrens = nieuweOndergrens;
	}
	
	/**
	 * @pre | getOndergrens() <= nieuweBovengrens
	 * @post | getBovengrens() == nieuweBovengrens
	 * @post | getOndergrens() == old(getOndergrens())
	 */
	public void setBovengrens(int nieuweBovengrens) {
		this.lengte = nieuweBovengrens - this.ondergrens;
	}
	
}
