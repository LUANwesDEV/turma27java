package TesteAULA;

import junit.framework.TestCase;

public class SomaTest2 extends TestCase {
	Soma exemplo1 = new Soma();
	
	
	
	public void testSomar() {

		int somatorio = exemplo1.somar(10,30);
		
		
		assertEquals(40,somatorio);
	}

}
