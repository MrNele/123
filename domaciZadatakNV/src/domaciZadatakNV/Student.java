package domaciZadatakNV;

import java.util.GregorianCalendar;

public class Student {

	private String index;
	private int godinaUpisa;
	private String ime;
	private String prezime;
	private GregorianCalendar datumRodj;

	public Student(String index, int godUpisa, String ime, String prezime, GregorianCalendar datumRodj) {
		this.index = index;
		this.godinaUpisa = godUpisa;
		this.ime = ime;
		this.prezime = prezime;
		this.datumRodj = datumRodj;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (!(Student.class.isAssignableFrom(obj.getClass()))) {
			return false;
		}
		final Student drugi = (Student) obj;
		if (!(this.ime.equals(drugi.ime) && this.prezime.equals(drugi.prezime) && this.index.equals(drugi.index))) {
			return false;
		}
		return true;
	}

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public int getGodUpisa() {
		return godinaUpisa;
	}

	public void setGodUpisa(int godUpisa) {
		this.godinaUpisa = godUpisa;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public GregorianCalendar getDatumRodj() {
		return datumRodj;
	}

	public void setDatumRodj(GregorianCalendar datumRodj) {
		this.datumRodj = datumRodj;
	}
}
