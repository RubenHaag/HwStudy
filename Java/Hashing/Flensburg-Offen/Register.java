
public class Register extends Hashfunktionen {

	public Register() {
		liste= new Stack[100];
		for(int i = 0; i <liste.length; i++){
			liste[i] = new Stack();
		}
	}
	public Register(int laenge) {
		liste= new Stack[laenge];
		for(int i = 0; i <liste.length; i++){
			liste[i] = new Stack();
		}
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
			if (!(liste[i].ausgabe().equals(""))) {
				System.out.println(liste[i].ausgabe());				
			}
		}
		System.out.println("");
	}
	

}
