package learning_test.tests;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

import learning_test.Calc;

class CalcTest {
	Calc calc = new Calc();

	@Test
	void shouldSum2PositiveNumbers() {
		assertEquals(10, calc.sum(7, 3));
	}

	@Test
	void shouldSum2NegativeNumbers() {
		assertEquals(-10, calc.sum(-7, -3));
	}

	@Test
	void shouldSum1PositiveAnd1NegativeNumber() {
		assertEquals(0, calc.sum(-7, 7));
	}

	@Test
	void shouldSum1PositiveAnd1NegativeNumber2() {
		assertEquals(0, calc.sum(7, -7));
	}

	@Test
	void shouldReturn0WhenSumming0And0() {
		assertEquals(0, calc.sum(0, 0));
	}
}
