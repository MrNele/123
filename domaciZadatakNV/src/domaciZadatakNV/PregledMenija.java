package domaciZadatakNV;

import java.util.Scanner;

public class PregledMenija {

	public void generatePregledMenija(ListaPrijava listaPrijava, ListaStudenata listaStudenata,
			ListaPredmeta listaPredmeta) {
		Scanner scanner = new Scanner(System.in);
		char in;

		do {
			System.out.println("a. Pregled svih predmeta");
			System.out.println("b. Pregled svih studenata");
			System.out.println("c. Pregled svih prijava trazenog studenta");
			System.out.println("d. Prikaz svih studenata koji su polozili odedjeni predmet");
			System.out.println("e. Povratak u glavni meni");
			in = scanner.nextLine().charAt(0);
			switch (in) {
			case 'a':
				System.out.println();
				listaPredmeta.stampajSve();
				System.out.println();
				break;
			case 'b':
				System.out.println();
				listaStudenata.stampajSve();
				System.out.println();
				break;
			case 'c':
				System.out.println();				
				System.out.println("Uneti broj indeksa studenta u formi bbb/gg: ");				
				System.out.println();
				String brojIndexa = scanner.nextLine();
				Student noviStudent = null;
				for (Student student : listaStudenata.getList()) {
					if (student.getIndex().equals(brojIndexa)) {
						noviStudent = student;
					}
				}
				if (noviStudent == null) {
					System.err.println("Nema studenta sa ovim brojem indeksa!");
					System.err.println("Proveriti da li je uneti broj indeksa u sledecoj formi: bbb/gg");
				} else {
					listaPrijava.pregledPrijavaStudenta(brojIndexa);
				}

				break;
			case 'd':
				System.out.println("Uneti sifru jednog od navedenih predmeta: ");
				listaPredmeta.stampajSve();
				int sifraPredmeta = scanner.nextInt();
				scanner.nextLine();
				Predmet noviPredmet = null;
				for (Predmet predmet : listaPredmeta.vratiListuPredmeta()) {
					if (predmet.getId() == sifraPredmeta) {
						noviPredmet = predmet;
					}
				}
				if (noviPredmet == null) {
					System.err.println("Nema predmeta sa unetom sifrom!");
					System.out.println();
				} else {
					listaPrijava.polozenIspit(sifraPredmeta);
				}
				break;
			case 'e':
				System.out.println("Vracanje na glavni meni: ");
				System.out.println();
				break;
			default:
				System.out.println();
				System.err.println("Nije unesena odgovarajuca opcija!");
				System.out.println();
			}
		} while (in != 'e');

	}

}
