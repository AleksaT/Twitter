/**
 * 
 */
package com.twitter;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author ASUS
 *
 */
public class TwitterTest {

	Twitter t;
	@Before
	public void setUp() throws Exception {
		t = new Twitter();
	}

	
	@After
	public void tearDown() throws Exception {
		t=null;
	}

	
	@Test
	public void testVratiSvePoruke() {
		t.unesi( "korisnik1", "poruka1");
				t.unesi("korisnik2", "poruka2");
				
				assertEquals("korisnik1", t.vratiSvePoruke().getFirst().getKorisnik());
				assertEquals("poruka1", t.vratiSvePoruke().get(0).getPoruka());
				
				assertEquals(2, t.vratiSvePoruke().size());
	}

	
	@Test
	public void testUnesi() {
		t.unesi("korisnik3", "poruka");
		assertEquals("korisnik3",t.vratiSvePoruke().getFirst().getKorisnik());
		assertEquals("poruka",t.vratiSvePoruke().getFirst().getPoruka());
	}
	@Test (expected = java.lang.RuntimeException.class)
		public void test1() {
			t.unesi(null, "poruka");
	}
	@Test (expected = java.lang.RuntimeException.class)
	public void test2() {
		t.unesi("korisnik", null);
}
	@Test (expected = java.lang.RuntimeException.class)
	public void test3() {
		t.unesi("", null);}
	@Test (expected = java.lang.RuntimeException.class)
	public void test4() {
		t.unesi("korisnik", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");}
	@Test
	public void testVratiPoruke() {
		
	}

}
