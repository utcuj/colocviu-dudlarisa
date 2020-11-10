package colocviu;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		System.out.println("Dati numarul de angajati: ");
		int nrAng = in.nextInt();
		
		System.out.println("Numarul de angajati este: "+nrAng);
		in.close();
		
		Companie comp=new Companie("Home Studio", nrAng);
		
		Developer d1=new Developer("Popescu",24,5,8);
		Developer d2= new Developer("Ionescu", 25,6,9);
		Developer d3=new Developer("Popa",30,5,8);
		Developer d4= new Developer("Ion", 45,9,10);
		
		Manager m1=new Manager("Vlad",34, 7,12);
		
		TeamLeader t1= new TeamLeader("Silviu",23,4,7);
		TeamLeader t2=new TeamLeader("Victor",43,7,4);
		
		d1.setTask("problema1");
		d1.rezolvaTask();
		d2.setTask("problema2");
		d2.rezolvaTask();
		
		m1.addAngajat(d1);
		m1.addAngajat(d2);
		m1.addAngajat(d3);
		m1.addAngajat(d4);
		m1.addAngajat(t1);
		m1.addAngajat(t2);
		m1.afisareAngajati();
		
	}

}
