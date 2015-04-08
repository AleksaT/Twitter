/**
 * 
 */
package com.twitter.poruke;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TwitterPorukaTest {

	TwitterPoruka p1;
	
	@Before
	public void setUp() throws Exception {
		 p1 = new TwitterPoruka();
	}

	
	@After
	public void tearDown() throws Exception {
		p1 = null;
	}

	
	@Test
	public void testSetKorisnik() {
		
		p1.setKorisnik("korisnik");
		assertEquals("korisnik", p1.getKorisnik());
	}
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetKorisnik1() {
		
		p1.setKorisnik(null);
		
	}
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetKorisnik2() {
		
		p1.setKorisnik("");
		
	}
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPoruka() {
		
		p1.setPoruka(null);
		
	}
	@Test 
	public void testSetPoruka1() {
		
		p1.setPoruka("poruka");
		assertEquals("poruka", p1.getPoruka());
	}
	
		
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPoruka3() {
		
		p1.setPoruka("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		
	}
	@Test
	public void testToString() {
		
			p1.setKorisnik("korisnik");
			p1.setPoruka("poruka");
				
				assertEquals("KORISNIK:korisnik PORUKA:poruka", "KORISNIK:"+p1.getKorisnik()+" PORUKA:"+p1.getPoruka());
	}

}
