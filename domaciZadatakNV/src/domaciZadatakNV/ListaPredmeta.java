package domaciZadatakNV;

import java.util.ArrayList;

public class ListaPredmeta {
	private ArrayList<Predmet> list;

	public ListaPredmeta() {
		this.list = new ArrayList<>();
	}

	public void dodajPredmet(Predmet predmet) {
		list.add(predmet);
	}

	public void dodajListuPredmeta(ArrayList<Predmet> listaPredmeta) {
		for (Predmet pr : listaPredmeta) {
			this.list.add(pr);
		}
	}

	public Predmet vratiPredmet(int n) {
		return this.list.get(n);
	}

	public ArrayList<Predmet> vratiListuPredmeta() {
		return this.list;
	}

	public void stampajSve() {
		int brojac = 1;
		for (Predmet pr : list) {
			System.out.println(brojac + ". Predmet: " + pr.getNaziv() + ", sifra predmeta: " + pr.getId());
			brojac++;
		}
	}
}
