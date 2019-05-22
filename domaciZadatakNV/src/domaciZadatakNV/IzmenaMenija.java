package domaciZadatakNV;

import java.util.Scanner;

public class IzmenaMenija {

	public void IzmenaMenija(ListaStudenata listaStudenata) {

		Scanner scanner = new Scanner(System.in);
		char in;

		do {
			System.out.println("a. Izmena podataka o studentu");
			System.out.println("b. Povratak u glavni meni");
			in = scanner.nextLine().charAt(0);
			switch (in) {
			case 'a':
				int brojac = 0;
				int indeksEl = 2222;
				System.out.println("Uneti broj indeksa studenta ciji se podaci menjaju!");
				String brojIndexa;
				brojIndexa = scanner.nextLine();
				for (Student student : listaStudenata.getList()) {
					if (student.getIndex().equals(brojIndexa)) {
						listaStudenata.getList().get(brojac);
						indeksEl = brojac;
					}
					brojac++;
				}
				if (indeksEl == 2222) {
					System.err.println("Ne postoji student sa ovim brojem indeksa!");
					break;
				}
				System.out.println("Menjate podatke studenta: " + listaStudenata.getList().get(indeksEl).getIme() + " "
						+ listaStudenata.getList().get(indeksEl).getPrezime());
				System.out.println("1. Izmeniti ime studenta: ");
				System.out.println("2. Izmeniti prezime studenta: ");
				System.out.println("3. Izmeniti broj indeksa studenta: ");
				int izbor2 = scanner.nextInt();
				switch (izbor2) {
				case 1:
					System.out.println("Upisati novo ime studenta");
					scanner.nextLine();
					String ime = scanner.nextLine();
					listaStudenata.getList().get(indeksEl).setIme(ime);
					break;
				case 2:
					System.out.println("Upisati novo prezime studenta");
					scanner.nextLine();
					String prezime = scanner.nextLine();
					listaStudenata.getList().get(indeksEl).setPrezime(prezime);
					break;
				case 3:
					System.out.println("Upisati novi broj indeksa");
					scanner.nextLine();
					String index = scanner.nextLine();
					listaStudenata.getList().get(indeksEl).setIndex(index);
				case 4:
					break;
				default:
					System.out.println("Nepravilan unos");
					break;
				}
				break;

			case 'b':
				System.out.println("Povratak u glavni meni.");
				System.out.println();
				break;

			default:
				System.out.println("Nepravilan unos");
				break;
			}
		} while (in != 'b');
	}
}