
public class Register extends Hashfunktionen {

	public Register() {
		liste= new Verkehrssuendiger[100];
	}
	public Register(int laenge) {
		liste= new Verkehrssuendiger[laenge];
	}
	
	public int getlänge() {
		return liste.length;
		
	}
	public void ausgabe(){
		System.out.println("Name\t\tPunktestand");
		for(int i = 0; i<14; i++){
			System.out.print("--");
		}
		System.out.println("");
		for(int i = 0; i < liste.length; i++){
			if(liste[i] != null){
				System.out.println(liste[i].getName()+ "\t\t" + ((Verkehrssuendiger) liste[i]).getPunkte());
			}
		}
		System.out.println("");
	}
	

}
