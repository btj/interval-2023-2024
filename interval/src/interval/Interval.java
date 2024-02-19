package interval;

public class Interval {

	private int ondergrens;
	private int bovengrens;
	
	public static int getLengte(Interval interval) {
		return interval.bovengrens - interval.ondergrens;
	}
	
	public static void setOndergrens(Interval interval, int nieuweOndergrens) {
		interval.ondergrens = nieuweOndergrens;
	}
	
	public static void setBovengrens(Interval interval, int nieuweBovengrens) {
		interval.bovengrens = nieuweBovengrens;
	}
	
}
