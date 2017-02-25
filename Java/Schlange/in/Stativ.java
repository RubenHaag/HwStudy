public class Stativ {
	private int anzahl;
	private Knoten erster;
	Stativ(String name){
		erster=new Knoten(new Element(name));
		anzahl=1;
	}
	public int getAnzahl() {
		return anzahl;
	}
	public Knoten getErster() {
		return erster;
	}
	public Knoten knotenGeben(int p){
		if(p>=1 && p<=anzahl){
			Knoten k=erster;
			for(int i=1;i<p;i++){
				k=k.naechsterGeben();
			}
			return k;
		}
		else{
			System.out.println("Fehler.");
			return null;
		}
	}
	public int posSuchen(Element e){
		Knoten k=erster;
		for(int i=1;i<=anzahl;i++){
			if(k.getInhalt().equals(e)){
				return i;
			}
			k=k.naechsterGeben();
		}
		System.out.println("Fehler.");
		return -1;
	}
	public void obenEinfuegen(Element e){
		Knoten neuerKnoten= new Knoten(e);
		Knoten alt= erster;
		anzahl++;
		erster= neuerKnoten;
		neuerKnoten.naechsterSetzen(alt);
	}
	public Knoten obenEntnehmen(){
		if (erster!=null){
			Knoten alt=erster;
			erster=erster.naechsterGeben();
			anzahl--;
			return alt;
		}
		else{
			System.out.println("Fehler.");
			return null;
		}
	}
	public void listeInhaltGeben(){
		Knoten k=erster;
		for(int i=0;i<anzahl;i++){
			System.out.println(k.getInhalt().datenGeben());
			k=k.naechsterGeben();
		}
	}
	public void Einfuegen(Element e){
		Knoten k=erster;
		while(k.naechsterGeben()!=null){
			k=k.naechsterGeben();
		}
		k.naechsterSetzen(new Knoten(e));
		anzahl++;
	}

	
	
}
