/**
 * 
 */
package com.twitter.poruke;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TwitterPorukaTest {

	
	@Before
	public void setUp() throws Exception {
	}

	
	@After
	public void tearDown() throws Exception {
	}

	
	@Test
	public void testSetKorisnik() {
		TwitterPoruka p1 = new TwitterPoruka();
		p1.setKorisnik("korisnik");
		assertEquals("korisnik", p1.getKorisnik());
	}
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetKorisnik1() {
		TwitterPoruka p1 = new TwitterPoruka();
		p1.setKorisnik(null);
		
	}
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetKorisnik2() {
		TwitterPoruka p1 = new TwitterPoruka();
		p1.setKorisnik("");
		
	}
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPoruka() {
		TwitterPoruka poruka = new TwitterPoruka();
		poruka.setPoruka(null);
		
	}
	@Test 
	public void testSetPoruka1() {
		TwitterPoruka poruka = new TwitterPoruka();
		poruka.setPoruka("poruka");
		assertEquals("poruka", poruka.getPoruka());
	}
	
		
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPoruka3() {
		TwitterPoruka poruka = new TwitterPoruka();
		poruka.setPoruka("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		
	}
	@Test
	public void testToString() {
		TwitterPoruka poruka = new TwitterPoruka();
			poruka.setKorisnik("korisnik");
			poruka.setPoruka("poruka");
				
				assertEquals("KORISNIK:korisnik PORUKA:poruka", "KORISNIK:"+poruka.getKorisnik()+" PORUKA:"+poruka.getPoruka());
	}

}
