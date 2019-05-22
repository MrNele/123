package domaciZadatakNV;

public class Predmet {

	private int id;
	private String naziv;

	public Predmet() {
	}

	public Predmet(int id, String naziv) {
		this.id = id;
		this.naziv = naziv;
	}

	public Predmet(String naziv) {
		this.naziv = naziv;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
}
