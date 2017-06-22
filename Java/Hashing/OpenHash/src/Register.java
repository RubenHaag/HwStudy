
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
	public String ausgabe(){
		String n = "Name\tPunktestand\tAddresse\n";
		n+=("---------------------------------------------------------");
		n+=("\n");
		for(int i = 0; i < liste.length; i++){
			if (!(liste[i].ausgabe().equals(""))) {
				n += (liste[i].ausgabe()+"\n");				
			}
		}
		n+=("\n");
		return n;
	}
	
	public String einfügen(String o){
		
		String name;
		int  punkte;
		String address;
		
		String [] os = o.split(",");
		if(os.length == 3){
			name = os[0];
			punkte = Integer.parseInt(os[1]);
			address = os[2];
		}
		else{return "Bitte auf die Richtige Eingabe achten";}
		
		int hcode = hash(name);
		hcode = hcode % liste.length;
		hcode = Math.abs(hcode);
		System.out.println(hcode);
		liste[hcode].einfügen(new Verkehrssuendiger(name, punkte, address));
		
		return "Erfolgreich eingefügt an Stelle " + hcode;
	}
}
