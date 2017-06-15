public class Stack{
	private Objekt erster;

	public String loeschen(String n){
		if(erster.getName().equals(n)){
			erster = erster.nächster;
			return null;
		}
		else{
			return erster.loeschen(n);
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
		if (erster != null){
			return erster.suchen(n);
		}
		else{
			return null;
		}	}
	public String ausgabe(){
		if (erster != null){
			return erster.ausgabe();
		}
		else{
			return "";
		}
	}
}