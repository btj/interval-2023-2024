package interval;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IntervalTest {
	
	@Test
	void test() {
		Interval interval = new Interval(3, 7);
		interval.setOndergrens(2);
		interval.setBovengrens(8);
		
		int lengte = interval.getLengte();
		assertEquals(6, lengte);
	}

}
