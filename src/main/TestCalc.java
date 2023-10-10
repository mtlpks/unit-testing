package main;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestCalc {
	
	double delta = 1e-15;
	@Test
	public void testDoisSomaDoisEsperaQuatro() {
		Calc c = new Calc();
		assertEquals(4, c.Soma(2, 2), delta);
	}
	
	@Test
	public void testTresSomaSeteEsperaDez() {
		Calc c = new Calc();
		assertEquals(10, c.Soma(3, 7), delta);
		
	}
	
	@Test
	public void testSubtracao() {
		Calc c = new Calc();
		assertEquals(4, c.Subtracao(7, 3), delta);
	}
	
	@Test
	public void testMultiplicacao() {
		Calc c = new Calc();
		assertEquals(24, c.Multiplicacao(6, 4), delta);
	}
	
	@Test
	public void testDivisao() {
		Calc c = new Calc();
		assertEquals(4, c.Divisao(8, 2), delta);
	}
}
