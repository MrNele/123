package domaciZadatakNV;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Podaci {

	public ArrayList<Student> listaStudenata;
	public ArrayList<Predmet> listaPredmeta;

	public Podaci() {
		this.listaStudenata = new ArrayList<>();
		this.listaPredmeta = new ArrayList<>();
		listaStudenata.add(s1);
		listaStudenata.add(s2);
		listaStudenata.add(s3);
		listaStudenata.add(s4);
		listaStudenata.add(s5);
		listaStudenata.add(s6);
		listaStudenata.add(s7);
		listaStudenata.add(s8);
		listaStudenata.add(s9);
		listaStudenata.add(s10);
		listaStudenata.add(s11);
		listaStudenata.add(s12);
		listaStudenata.add(s13);
		listaStudenata.add(s14);
		listaStudenata.add(s15);

		listaPredmeta.add(p1);
		listaPredmeta.add(p2);
		listaPredmeta.add(p3);
		listaPredmeta.add(p4);
		listaPredmeta.add(p5);
		listaPredmeta.add(p6);
		listaPredmeta.add(p7);
	}

	Student s1 = new Student("1/06", 2006, "Milan", "Milanic", new GregorianCalendar(1988, 3, 6));
	Student s2 = new Student("2/06", 2006, "Nenad", "Nenadic", new GregorianCalendar(1988, 4, 25));
	Student s3 = new Student("3/06", 2006, "Gorana", "Petrovic", new GregorianCalendar(1988, 5, 24));
	Student s4 = new Student("4/06", 2006, "Milana", "Jovanovic", new GregorianCalendar(1988, 6, 23));
	Student s5 = new Student("5/06", 2006, "Svetlana", "Pudar", new GregorianCalendar(1988, 7, 22));
	Student s6 = new Student("6/06", 2006, "Marija", "Jotic", new GregorianCalendar(1986, 8, 21));
	Student s7 = new Student("7/06", 2006, "Milos", "Malic", new GregorianCalendar(1987, 9, 20));
	Student s8 = new Student("8/06", 2006, "Masa", "Balota", new GregorianCalendar(1985, 10, 19));
	Student s9 = new Student("9/06", 2006, "Dejan", "Dejanic", new GregorianCalendar(1988, 11, 18));
	Student s10 = new Student("10/06", 2006, "Marko", "Markovic", new GregorianCalendar(1988, 12, 17));
	Student s11 = new Student("11/06", 2006, "Nikola", "Nikolic", new GregorianCalendar(1983, 11, 16));
	Student s12 = new Student("12/06", 2006, "Slobodan", "Milic", new GregorianCalendar(1982, 10, 15));
	Student s13 = new Student("13/06", 2006, "Kosta", "Kostic", new GregorianCalendar(1980, 9, 14));
	Student s14 = new Student("14/06", 2006, "Dragan", "Draganic", new GregorianCalendar(1990, 8, 13));
	Student s15 = new Student("15/06", 2006, "Milen", "Petrovic", new GregorianCalendar(1989, 5, 12));

	Predmet p1 = new Predmet(1, "Mehanika leta 1");
	Predmet p2 = new Predmet(2, "Mehanika leta 2");
	Predmet p3 = new Predmet(3, "Matematika 1");
	Predmet p4 = new Predmet(4, "Numericke metode");
	Predmet p5 = new Predmet(5, "Matematika 2");
	Predmet p6 = new Predmet(6, "Automatsko upravljanje 1");
	Predmet p7 = new Predmet(7, "Automatsko upravljanje 2");

	public ArrayList<Student> getListaStudenata() {
		return listaStudenata;
	}

	public ArrayList<Predmet> getListaPredmeta() {
		return listaPredmeta;
	}
}
