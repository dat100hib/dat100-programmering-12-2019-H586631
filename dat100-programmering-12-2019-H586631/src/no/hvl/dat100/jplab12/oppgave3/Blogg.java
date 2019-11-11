package no.hvl.dat100.jplab12.oppgave3;

import no.hvl.dat100.jplab12.common.TODO;
import no.hvl.dat100.jplab12.oppgave1.*;

public class Blogg {

	private Innlegg[] innleggstabell;
	private int nesteledig;

	public Blogg() {
		innleggstabell = new Innlegg[20];

	}

	public Blogg(int lengde) {
		innleggstabell = new Innlegg[lengde];
		nesteledig = 0;
	}

	public int getAntall() {
		return nesteledig;
	}

	public Innlegg[] getSamling() {
		return innleggstabell;

	}

	public int finnInnlegg(Innlegg innlegg) {
		int pos = -1;
		for (int i = 0; i < innleggstabell.length; i++) {
			if (innlegg.erLik(innleggstabell[i])) {
				pos = i;
			} else
				i++;
		}
return pos ;
	}

	public boolean finnes(Innlegg innlegg) {
		boolean funnet = false;
		int pos = 0;
		for (int i = 0; i < innleggstabell.length; i++) {
			if (innlegg.erLik(innleggstabell[i])) {
				funnet = true;
			} else
				pos++;
		}
return funnet;
	}

	public boolean ledigPlass() {

		boolean ledig = false;
		
			if (nesteledig < innleggstabell.length) {
				ledig = true;
			}
		
		return ledig;
	}

	public boolean leggTil(Innlegg innlegg) {

		boolean ny = false;
		if(finnes(innlegg) == false && ledigPlass() == true) {
			innleggstabell[nesteledig] = innlegg;
			nesteledig++;
			ny = true;
		} 
		return ny;
	}

	public String toString() {
             String str = innleggstabell.length + "\n";
             for (int i = 0; i <innleggstabell.length; i++) {
            	 str = str + innleggstabell[i].toString();
             }
             return str;
	}

	// valgfrie oppgaver nedenfor

	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}

	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());

	}

	public boolean slett(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
	}

	public int[] search(String keyword) {

		throw new UnsupportedOperationException(TODO.method());

	}
}