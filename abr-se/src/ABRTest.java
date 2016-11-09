import static org.junit.Assert.*;


import org.junit.Test;

public class ABRTest {

	@Test
	public void testEmpty() {
		ABR a = new ABR();
		assertTrue(a.isEmpty());
	}
	
	@Test
	public void testInsert(){
		ABR a = new ABR();
		a.insert(3);
		a.insert(5);
		a.insert(1);
		assertFalse(a.isEmpty());
	}
	
	@Test
	public void testNbElements(){
		ABR a = new ABR();
		a.insert(3);
		a.insert(5);
		a.insert(1);
		assertEquals(a.nbElements(),3);
	
	}
	
}
