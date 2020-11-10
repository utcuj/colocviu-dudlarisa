package colocviu;

public class Angajat {
	
	 String nume;
	private int varsta;
	private int aniDeExperienta;
	private int nrDeOreLucrate;
	
	private int tarifPerOra;
	private int salariu;
	//private int nivel;
	//private int bonusNivel;
	
	//public static

	public Angajat(String nume, int varsta, int aniDeExperienta, int tarifPerOra ) {
		this.nume=nume;
		this.varsta=varsta;
		this.aniDeExperienta=aniDeExperienta;
		this.tarifPerOra=tarifPerOra;
	}
	
	
	public int getNrDeOreLucrate() {
		return nrDeOreLucrate;
	}


	public void setNrDeOreLucrate(int nrDeOreLucrate) {
		this.nrDeOreLucrate = nrDeOreLucrate;
	}


	public String getNume() {
		return nume;
	}
	

}
