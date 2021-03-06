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
	
	@Test
	public void testContains(){
		ABR a = new ABR();
		a.insert(7);
		a.insert(5);
		a.insert(1);
		a.insert(10);
		a.insert(120);
		a.insert(6);
		a.insert(14);
		a.insert(9);
		a.insert(6);
		assertTrue(a.contains(7));
		assertTrue(a.contains(120));
		assertTrue(a.contains(6));
		assertTrue(a.contains(1));
		assertTrue(a.contains(14));
		assertFalse(a.contains(130));
		assertFalse(a.contains(0));
		assertFalse(a.contains(11));
	
	}
	
}
