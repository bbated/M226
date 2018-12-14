package Arbeitsblatt_6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class KontoTest {

	@Test
	void einzahlen() {
		Konto konto1 = new Konto("Meier");
		konto1.einzahlen(100);
		assertEquals(100, konto1.getSaldoNum());
		
		
	}
	
	@Test
	void verzinsen() {
		Konto konto1 = new Konto("Meier");
		konto1.einzahlen(50000);
		konto1.verzinsen(365);
		assertEquals(50250, konto1.getSaldoNum());
		Konto konto2 = new Konto("Weber");
		konto2.einzahlen(500000);
		konto2.verzinsen(365);
		assertEquals(500000, konto2.getSaldoNum());
		Konto konto3 = new Konto("inter");
		konto3.einzahlen(100);
		konto3.verzinsen(365);
		assertEquals(101, konto3.getSaldoNum());
		
		
	}
	


}
