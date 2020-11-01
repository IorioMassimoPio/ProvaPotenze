package Prova.Potenza;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PotenzaTest {

	private static Potenza pot;
	
	@BeforeClass
	public static void prepare() {
		System.out.println("Inizio dei test");
		pot = new Potenza();
	}
	
	@AfterClass
	public static void finish() {
		System.out.println("Fine dei test");
	}
	
	@Before
	public void before() {
		System.out.println("Sto per eseguire un test");
	}
	
	@Test
	public void verificaPotenza() {
		//assertFalse se il test deve restituire false
		assertFalse(pot.potenzaGenerica(2, 5));
		//assertTrue se il test deve restituire true
		assertTrue(pot.potenzaGenerica(2, 1));
		assertTrue(pot.potenzaGenerica(3, 27));
		System.out.println("TEST A BUON FINE");
	}
	
	//Test che vede quanto tempo ci mette la funzione per essere eseguita
	@Test(timeout=1000)	//Tempo in millisecondi (1000 millisecondi -> 1 secondo)
	public void testEfficienza() {
		pot.potenzaGenerica(3, 6);
	}
	
	@Test
	public void TestPotenzeDiDue() {
		assertEquals(Arrays.asList(1, 2, 4, 8, 16), pot.potenzeDiDue());
	}
}
