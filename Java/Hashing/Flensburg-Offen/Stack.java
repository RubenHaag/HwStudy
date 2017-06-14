public class Stack{
	private int anzahl;
	private Objekt erster;
	Stack(){
	}

	public String loeschen(String n){
		if(erster.name.isEqual(n)){
			erster = erster.nächster;
		}
		else{

		}
	}
	public void einfügen(Objekt e){
		if(erster == null){
			erster = e;
		}
		else{
			erster.einfügen(e);
		}
	}
	public Objekt suchen(String n){
		return erster.suchen();
	}
}