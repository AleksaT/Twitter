package com.twitter.poruke;

public class TwitterPoruka {
	/*
	 * atribut korisnik-ime korisnika
	 */
	private String korisnik;
	/*
	 * atribut poruka-sadrzaj poruke
	 */
	private String poruka;
	/*
	 * metoda getKorisnik
	 * @return String vraca ime korisnika
	 */
	public String getKorisnik() {
	return korisnik;
	}
	/*
	 * metoda setKorisnik postavlja korisnik
	 *@param korisnik unosi se ime korisnika
	 *@throws RuntimeException ukoliko je korisnik nije unet ili je unet prazan String
	 */
	public void setKorisnik(String korisnik) {
	if (korisnik==null || korisnik.equals(""))
	throw new RuntimeException(
	"Ime korisnika mora biti uneto");
	this.korisnik = korisnik;
	}
	/*
	 * metoda getPoruka 
	 * @return String vraca sadrzaj poruke
	 */
	public String getPoruka() {
	return poruka;
	}
	/*
	 * metoda setPoruka
	 * @param poruka unosi se sadrzaj poruke
	 * @throws RuntimeException ukoliko poruka nije uneta ili ima vise od 140 znakova
	 */
	public void setPoruka(String poruka) {
	if (poruka==null || poruka.length()>140){
	throw new RuntimeException(
	"Poruka mora biti uneta i mora imati najvise 140 znakova");}
	this.poruka = poruka;
	}
	
	public String toString(){
	return "KORISNIK:"+korisnik+" PORUKA:"+poruka;
	} 
}
