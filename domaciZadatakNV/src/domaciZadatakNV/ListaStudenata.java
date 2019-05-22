package domaciZadatakNV;

import java.util.ArrayList;

public class ListaStudenata {

	private ArrayList<Student> list;

	public ListaStudenata() {
		this.list = new ArrayList<>();
	}

	public ArrayList<Student> getList() {
		return list;
	}

	public void dodajStudenta(Student student) {
		this.list.add(student);
	}

	public void dodajListuStudenata(ArrayList<Student> listaStudenata) {
		for (Student st : listaStudenata) {
			this.list.add(st);
		}
	}

	public void stampajSve() {
		int brojac = 1;
		for (Student st : list) {
			System.out.println(
					brojac + ". Student: " + st.getIme() + " " + st.getPrezime() + ", broj indeksa: " + st.getIndex());
			brojac++;
		}
	}

	public ArrayList<Student> vratiListuStudenata() {
		return this.list;
	}

	public Student vratiStudenta(int n) {
		return this.list.get(n);
	}

}
