package Ordentlich;

public class Punktehash extends Hashtable{
	Verkehrssünder[] s;
	int länge;
	
	public Punktehash(int i) {
		länge = i;
		s = new Verkehrssünder [länge];
	}
	public Punktehash() {
		länge = 100;
		s = new Verkehrssünder [länge];
	}
	
	void ausgabe(){
		System.out.println("Name\t\tPunktestand\t\tErstellungsdatum des Führerscheins");
		for(int i = 0; i<37; i++){
			System.out.print("--");
		}
		System.out.println("");
		for(int i = 0; i < länge; i++){
			if(s[i] != null){
				System.out.println(s[i].getName()+ "\t\t" + s[i].getpunktestand() + "\t\t\t" + s[i].getErstellungsdatumDesFührerscheins());
			}
		}
		System.out.println("");
	}
}

