package domaciZadatakNV;

import java.util.GregorianCalendar;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GlavniMeni {

	public ListaPrijava listaPrijava = new ListaPrijava();
	public Podaci podaci = new Podaci();
	public ListaPredmeta listaPredmeta = new ListaPredmeta();
	public ListaStudenata listaStudenata = new ListaStudenata();

	public void generateGlavniMeni() {
		listaStudenata.dodajListuStudenata(podaci.getListaStudenata());
		listaPredmeta.dodajListuPredmeta(podaci.getListaPredmeta());
		Scanner scanner = new Scanner(System.in);
		int in;
		do {
			System.out.println("1. Pregled");
			System.out.println("2. Unos nove prijave ispita");
			System.out.println("3. Izmena");
			System.out.println("0. Kraj programa");

			in = scanner.nextInt();

			switch (in) {
			case 1:
				PregledMenija pregledMenija = new PregledMenija();
				pregledMenija.generatePregledMenija(listaPrijava, listaStudenata, listaPredmeta);
				break;
			case 2:
				Student student = null;
				Predmet predmet = null;
				PrijavaIspita prijava = new PrijavaIspita();
				System.out.println("Uneti sifru predmeta: ");
				listaPredmeta.stampajSve();
				int idPredmeta = 0;
				try {
					idPredmeta = scanner.nextInt();
				} catch (InputMismatchException e) {
					System.err.println("Moraju se uneti iskljucivo celi brojevi kao sifre predmeta!");
					scanner.nextLine();
					break;
				}

				for (Predmet predmet1 : listaPredmeta.vratiListuPredmeta()) {
					if (predmet1.getId() == idPredmeta) {
						predmet = predmet1;
					}
				}
				try {
					prijava.setPredmet(predmet);
				} catch (IllegalArgumentException e) {
					System.err.println("Ne postoji predmet sa unetom sifrom.");
					break;
				}
				scanner.nextLine();

				System.out.println("Uneti broj indeksa studenta: ");
				String brojIndexa = scanner.nextLine();
				for (Student student1 : listaStudenata.vratiListuStudenata()) {
					if (student1.getIndex().equals(brojIndexa)) {
						student = student1;
					}
				}
				try {
					prijava.setStudent(student);

				} catch (IllegalArgumentException e) {
					System.err.println("Ne postoji student sa unetim brojem indeksa.");
					break;
				}

				System.out.println("Uneti godinu polaganja ispita: ");
				int godina = scanner.nextInt();
				if (godina < 2005 || godina > 2050) {
					System.err.println("Godine mogu biti od 2005 - 2050!");
					break;
				}

				System.out.println("Uneti redni broj meseca polaganja: ");
				int mesec = scanner.nextInt();
				if (mesec > 12 || mesec == 0) {
					System.err.println("Redni broj meseca moze biti od 1 - 12!");
					break;
				}

				System.out.println("Uneti dan polaganja: ");
				int dan = scanner.nextInt();
				if (dan > 31 || dan == 0) {
					System.err.println("Dan u mesecu je od 1 - 31!");
				}

				try {
					GregorianCalendar datum = new GregorianCalendar();
					datum.set(godina, mesec, dan);
					prijava.setDatumPolaganja(datum);
				} catch (Exception e) {
					System.err.println("Nepravilan datum!");
					break;
				}

				System.out.println("Uneti ocenu: ");
				int ocena = scanner.nextInt();
				try {
					prijava.setOcena(ocena);
				} catch (IllegalArgumentException e) {
					System.err.println("Ocena mora biti izmedju 6 i 10.");
					break;
				}

				try {
					listaPrijava.dodajPrijavu(prijava);
				} catch (IllegalArgumentException e) {
					System.err.println("Student je vec polozio ovaj ispit.");
					break;
				}
				System.out.println("Uspesno uneta prijava.");
				System.out.println();
				break;
			case 3:
				IzmenaMenija izmenaMenija = new IzmenaMenija();
				izmenaMenija.IzmenaMenija(listaStudenata);
				break;
			case 0:
				in = 0;
				break;
			default:
				System.err.println("Pogresna opcija.");
				System.out.println();
			}
		} while (in != 0);
	}
}
