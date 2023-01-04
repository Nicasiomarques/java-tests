package learning_test;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

class CalcTest {
	Calc calc = new Calc();
	
	@Test
	void ShouldSum2PositiveNumbers() {
		assertEquals(10, calc.sum(7, 3));
	}
}
