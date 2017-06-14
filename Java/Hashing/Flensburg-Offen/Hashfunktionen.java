
public abstract class Hashfunktionen{
	protected Stack[] liste;
	public int hash (String name){
		return name.hashCode();
	}
	
	public void einfügen(Objekt o){
		liste[hcode].einfügen(o);
	}
	
	public String loeschen(String name){
		int hcode= hash(name);
		hcode = hcode % liste.length;
		hcode = Math.abs(hcode);
		if(liste[hcode]!= null){
			liste[hcode].loeschen(name);
		}
		else {
			return("Error dieser Name ist nicht vorhanden!");
		}
	}
	
	public Objekt suchen(String name){
		int hcode= hash(name);
		hcode = hcode % liste.length;
		hcode = Math.abs(hcode);
		liste[hcode].suchen(name);

		if(liste[hcode]!= null){
			liste[hcode].suchen(name);
		}
		else {
			return null;
		}		
	}
	

}
