/**
 * 
 */
package com.twitter;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.twitter.poruke.TwitterPoruka;

/**
 * @author AleksaT
 * @version 0.1
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
		t.unesi("k1", "p1");
			t.unesi("k2", "p2");
				t.unesi("k3", "p3");
				
				TwitterPoruka[] rezultat = t.vratiPoruke(7,"p");
				
				assertEquals(7 , rezultat.length);
				assertEquals("p1", rezultat[0].getPoruka());
				assertEquals("k1", rezultat[0].getKorisnik());
				assertEquals("p2", rezultat[1].getPoruka() );
				assertEquals("k2", rezultat[1].getKorisnik());
				assertEquals(null, rezultat[5]);
	}

	@Test (expected = java.lang.RuntimeException.class)
		public void test7() {
			t.vratiPoruke(6, null);
		}
	@Test (expected = java.lang.RuntimeException.class)
		public void test8() {
			t.vratiPoruke(6, "");
}}
