package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import calculatorPackage.Calculator;

public class CalculatorTest {
	
	/* Indichiamo che sia un test, aggiungiamo un timeout, ovvero il codice oggetto del test 
	 *deve essere eseguito nei millisencondi indicati
	 */
	@Test(timeout=5)
	public void testMultiplication() {
		Calculator c = new Calculator();
		assertEquals(4, c.multiply(2, 2));
	}
	
	@Test
	public void testDivision() {
		Calculator c = new Calculator();
		assertEquals(5, c.division(10,  2));
	}
	
	/*
	 * Indichiamo che il test dovrà causare l'eccezione.
	 */
	@Test(expected = ArithmeticException.class)
	public void zeroDividedZeroTest() {
		Calculator c = new Calculator();
		c.division(0, 0);
	}
}
