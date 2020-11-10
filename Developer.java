package colocviu;

public class Developer extends Angajat{
	
	private String task;

	public Developer(String nume, int varsta, int aniDeExperienta, int tarifPerOra ) {
		super(nume,varsta, aniDeExperienta, tarifPerOra);
		
	}
	
	
	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public void rezolvaTask() {
		System.out.println(nume+" rezolva "+task);
		
	}

}
