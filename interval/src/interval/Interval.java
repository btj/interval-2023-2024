package interval;

public class Interval {

	private int ondergrens;
	private int lengte;
	
	public int getOndergrens() {
		return this.ondergrens;
	}
	
	public int getLengte() {
		return this.lengte;
	}
	
	public void setOndergrens(int nieuweOndergrens) {
		this.ondergrens = nieuweOndergrens;
	}
	
	public void setBovengrens(int nieuweBovengrens) {
		this.lengte = nieuweBovengrens - this.ondergrens;
	}
	
}
