package interval;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IntervalTest {
	
	@Test
	void test() {
		Interval interval = new Interval();
		Interval.setOndergrens(interval, 3);
		Interval.setBovengrens(interval, 7);
		int lengte = Interval.getLengte(interval);
		assertEquals(4, lengte);
	}

}
