package no.hvl.dat100.jplab12.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.jplab12.oppgave3.*;

import no.hvl.dat100.jplab12.oppgave1.Innlegg;

public class SkrivBlogg {

	private static String MAPPE = System.getProperty("user.dir") + "/src/no/hvl/dat100/jplab12/tests/";

	public static boolean skriv(Blogg samling, String filnavn) {

		boolean utskrift = false;
		Innlegg[] tab = samling.getSamling();
		try {
			PrintWriter Skriver = new PrintWriter(MAPPE + filnavn);
			for (int i = 0; i < samling.getAntall(); i++) {
				Skriver.printf(tab[i].toString());
			}
			utskrift = true;
			Skriver.close();
		} catch (FileNotFoundException e) {
			System.out.print("Filen ble ikke funnet");
			utskrift = false;
		}
		return utskrift;
	}
}