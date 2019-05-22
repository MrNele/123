package domaciZadatakNV;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class PrijavaIspita {

	private Predmet predmet;
	private Student student;
	private GregorianCalendar datumPolaganja;
	private int ocena;
	private boolean polozio;

	public PrijavaIspita() {

	}

	public PrijavaIspita(Predmet predmet, Student student, GregorianCalendar datumPolaganja, int ocena) {
		this.predmet = predmet;
		this.student = student;
		this.datumPolaganja = datumPolaganja;
		if (ocena < 5 || ocena > 10) {
			throw new IllegalArgumentException();
		}
		this.ocena = ocena;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (!(PrijavaIspita.class.isAssignableFrom(obj.getClass()))) {
			return false;
		}
		final PrijavaIspita druga = (PrijavaIspita) obj;
		if (!(this.getStudent().getIndex().equals(druga.getStudent().getIndex())
				&& this.getPredmet().getNaziv().equals(druga.getPredmet().getNaziv()))) {
			return false;
		}
		return true;
	}

	public Predmet getPredmet() {
		return predmet;
	}

	public boolean jePolozio() {
		if (ocena > 5) {
			this.polozio = true;
		} else {
			this.polozio = false;
		}
		return polozio;
	}

	public void setPredmet(Predmet predmet) {
		if (predmet == null) {
			throw new IllegalArgumentException();
		} else {
			this.predmet = predmet;
		}
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		if (student == null) {
			throw new IllegalArgumentException();
		} else {
			this.student = student;
		}
	}

	public String getDatumPolaganja() {
		int dan = this.datumPolaganja.get(Calendar.DAY_OF_MONTH);
		int mesec = this.datumPolaganja.get(Calendar.MONTH);
		int godina = this.datumPolaganja.get(Calendar.YEAR);
		return dan + "." + mesec + "." + godina + ".";
	}

	public void setDatumPolaganja(GregorianCalendar datumPolaganja) {
		this.datumPolaganja = datumPolaganja;
	}

	public int getOcena() {
		return ocena;
	}

	public void setOcena(int ocena) {
		if (ocena < 5 || ocena > 10) {
			throw new IllegalArgumentException();
		} else {
			this.ocena = ocena;
		}
	}
}
