package colocviu;


public class Manager extends Angajat{

	private Angajat[] ang=new Angajat[10];
	private int contor = 0;
	
	public Manager(String nume, int varsta, int aniDeExperienta, int tarifPerOra ) {
		super(nume,varsta, aniDeExperienta, tarifPerOra);
		
	}
	
	public void addAngajat(Angajat a) {
		ang[contor++] = a;
	}
	
	public void afisareAngajati() {
		System.out.println("Angajatii companiei sunt: ");
		for (Angajat c: ang){
			if(c != null) {
				System.out.print(c.getNume() + " , ");
			}
		}
	}
	
}
