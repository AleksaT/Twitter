package com.twitter;
import java.util.LinkedList;
import com.twitter.poruke.TwitterPoruka;
/**
 * Klasa Twitter ima atribut koji predstavlja listu objekata TwitterPoruka
 * sadrzi metode koje unose poruku nekog korisnika, kao i metoda koja vraca poruke sa trazenim tagom 
 * @author Aleksa T
 * @version 0.1
 *
 */
public class Twitter {
	/**
	 * lista poruka korisnika
	 */
private LinkedList<TwitterPoruka> poruke =new LinkedList<TwitterPoruka>();
/**
 * Vraca listu poruka
 * @return vraca sve poruke
 */

public LinkedList<TwitterPoruka> vratiSvePoruke(){
return poruke;
}
/**
 * Unosi se nova poruka na kraj liste. Poruka sadrzi
 * @param korisnik ime korisnika
 * @param poruka sadrzaj poruke koju je korisnik uneo
 */
public void unesi(String korisnik, String poruka) {
      //Pravi se nova poruka i puni podacima.
       TwitterPoruka tp = new TwitterPoruka();
       tp.setKorisnik(korisnik);
       tp.setPoruka(poruka);
      //Poruka se unosi u listu na kraj
      poruke.addLast(tp);
}
/**
 * vraca se odredjen broj poruka sa trazenim tagom
 * @param maxBroj maksimalan broj poruka koji moze da se vrati
 * @param tag string koji predstavlja kljuc pretrage
 * @throws java.lang.RuntimeException ako je uneti tag null ili ako je tag prazan string
 * @return niz poruka sa odgovarajucim tagom
 */
public TwitterPoruka[] vratiPoruke(int maxBroj, String tag) {
       if (tag==null || tag.isEmpty())
          throw new RuntimeException("Morate uneti tag");
//Ako je maxBroj <=0, vraca maxBroj se postavlja na 100 poruka
       if (maxBroj<=0)
          maxBroj = 100;
//Pomocna promenljiva koja predstavlja brojac upisanih poruka
int brojac = 0;
//Pomocni niz koja predstavlja rezultat pretrage tj. sadrzace
//sve poruke koje u sebi imaju zadati tag
       TwitterPoruka[] rezultat = new TwitterPoruka[maxBroj];
//Pretrazuju se poruke i traze se one koje sadrze tag.
//Ako se nadje neka takva, i ako nije prekoracen maxBroj
//ona se upisuje u niz. Ako je prekoracen maxBroj,pretraga
//se prekida.
for (int i = 0; i < poruke.size(); i++)
        if (poruke.get(i).getPoruka().indexOf(tag)!=-1)
        if (brojac < maxBroj){
            rezultat[brojac]=poruke.get(i);
            brojac++;
}
else break;
      return rezultat;
}
}
