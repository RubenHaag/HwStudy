
public abstract class Hashfunktionen{
	protected Stack[] liste;
	public int hash (String name){
		return name.hashCode();
	}
	
	public void einfügen(Objekt o){
		int hcode = hash(o.getName());
		hcode = hcode % liste.length;
		hcode = Math.abs(hcode);
		System.out.println(hcode);
		liste[hcode].einfügen(o);
	}
	
	public String loeschen(String name){
		int hcode = hash(name);
		hcode = hcode % liste.length;
		hcode = Math.abs(hcode);
		if(liste[hcode]!= null){
			liste[hcode].loeschen(name);
			return null;

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
			return liste[hcode].suchen(name);
		}
		else {
			return null;
		}		
	}
}
