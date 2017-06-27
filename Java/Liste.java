public class Liste {
	Listenobjekt startpunkt;
	public String loeschen(String n){
		if(startpunkt.getName().equals(n)){
			startpunkt.nachbarn.referenzEntfernen();
			startpunkt = startpunkt.nachbarn.startpunkt;
			return null;
		}
		else{
			return startpunkt.loeschen(n);
		}
	}
	public void referenzEntfernen(Listenobjekt o){
		//entfernt bei allen nachbarn die Referenzen auf ein bestimmtes Objekt
		
	}
	public void einfügen(Objekt e){
		if(startpunkt == null){
			startpunkt = e;
		}
		else{
			startpunkt.einfügen(e);
		}
	}
	public Objekt suchen(String n){
		if (startpunkt != null){
			return startpunkt.suchen(n);
		}
		else{
			return null;
		}
	}
}
