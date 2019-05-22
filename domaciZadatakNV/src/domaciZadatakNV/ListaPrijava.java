package domaciZadatakNV;

import java.util.ArrayList;

public class ListaPrijava {

	private ArrayList<PrijavaIspita> list = new ArrayList<PrijavaIspita>();

	public void dodajPrijavu(PrijavaIspita prijavaIspita) {

		if (!(list.contains(prijavaIspita) && prijavaIspita.jePolozio())) {
			list.add(prijavaIspita);
		} else {
			throw new IllegalArgumentException();
		}
	}

	public void printAll() {
		for (PrijavaIspita pr : list) {
			System.out.println(pr.getStudent() + " " + pr.getPredmet());
		}
	}

	public void pregledPrijavaStudenta(String index) {
		int brojac = 1;
		String indexCheck = "Empty";
		for (PrijavaIspita pr : list) {
			if (pr.getStudent().getIndex().equals(index)) {
				System.out.println("Student: " + pr.getStudent().getIme() + " " + pr.getStudent().getPrezime()
						+ " broj indexa: " + pr.getStudent().getIndex() + " je prijavio: ");
				indexCheck = pr.getStudent().getIndex();
				break;
			}
		}
		for (PrijavaIspita pr : list) {
			if ((pr.getStudent().getIndex()).equals(index)) {
				System.out.println(brojac + ". Predmet: " + pr.getPredmet().getNaziv() + ", Ocena: " + pr.getOcena()
						+ ", datum polaganja: " + pr.getDatumPolaganja());
				brojac++;
			}
		}
		if (indexCheck.equals("Empty")) {
			System.err.println(
					"Student sa brojem indeksa: " + index + " postoji u podacima, ali nije polagao nijedan ispit.");
			System.out.println();
		}
	}

	public void polozenIspit(int sifraIspita) {

		ArrayList<Student> listaStudenata = new ArrayList<>();
		for (PrijavaIspita prijava : list) {
			if ((prijava.getPredmet().getId() == sifraIspita) && prijava.jePolozio()) {
				listaStudenata.add(prijava.getStudent());
			}
		}
		if (listaStudenata.isEmpty()) {
			System.err.println("Nijedan student nije polozio ovaj ispit.");
		} else {
			System.out.println("Predmet su polozili sledeci studenti: ");
			for (Student student : listaStudenata) {
				System.out.println("Student: " + student.getIme() + " " + student.getPrezime() + ", broj indeksa: "
						+ student.getIndex());
			}
		}
	}
}
