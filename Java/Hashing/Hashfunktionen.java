
public abstract class Hashfunktionen {
	protected Objekt[] liste;
	public int hash (String name){
		return name.hashCode();
	}
	
	public void einfügen(Objekt o){
		int hcode= hash(o.getName());
		hcode = hcode % liste.length;
		hcode = Math.abs(hcode);
		while (liste[hcode]!=null) {
			hcode =  (hcode+1) % liste.length;
			hcode = Math.abs(hcode);
		}
		liste[hcode]= o;
	}
	
	public void loeschen(String name){
		int hcode= hash(name);
		hcode = hcode % liste.length;
		hcode = Math.abs(hcode);
		while(liste[hcode].getName()!=name){
			hcode =  (hcode+1) % liste.length;
			hcode = Math.abs(hcode);
		}
		Objekt x= (Objekt) new LoeschenObj();
		liste[hcode]= null;
		liste[hcode]= x;
		
	}
	
	public Objekt suchen(String name){
		int hcode= hash(name);
		hcode = hcode % liste.length;
		hcode = Math.abs(hcode);
		int pruefen= hcode;
		while(liste[hcode]==null||hcode!=pruefen||liste[hcode].getName()!=name){
			hcode =  (hcode+1) % liste.length;
			hcode = Math.abs(hcode);
		}
		if (liste[hcode]==null||hcode==pruefen){
			System.out.println("Name. Nicht da.");
			return null;
		}
		return liste[hcode];
		
	}
	

}
