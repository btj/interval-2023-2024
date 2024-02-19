package interval;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IntervalTest {
	
	@Test
	void test() {
		Interval interval = new Interval();
		interval.setOndergrens(3);
		interval.setBovengrens(7);
		int lengte = interval.getLengte();
		assertEquals(4, lengte);
	}

}
