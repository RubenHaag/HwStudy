public class Verkehrssuendiger extends Objekt {
	private String name;
	private int punkte;
	private String adresse;
	Objekt nächster;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public int getPunkte() {
		return punkte;
	}

	public void setPunkte(int punkte) {
		this.punkte = punkte;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Verkehrssuendiger(String name, int punkte, String adresse) {
		this.name= name;
		this.punkte = punkte;
		this.adresse= adresse;
		
	}

	public Objekt suchen(String n){
		if(n.equals(name)){
			return this;
		}
		else if(nächster != null){
			return nächster.suchen(n);
		}
		else{return null;}
	}
	public void einfügen(Objekt e){
		if(nächster == null){
			this.nächster = e;
		}
		else{
			nächster.einfügen(e);
		}
	}
	public String loeschen(String n){
		if(nächster.getName().equals(n)){
			nächster = nächster.nächster;
			return null;
		}
		else if (nächster != null){
			nächster.loeschen(n);
			return null;
		}
		else {
			return("Error dieser Name ist nicht vorhanden!");
		}
	}
	public String ausgabe(){
		if(nächster != null){
			return (name + "\t" + punkte + "\n"+ nächster.ausgabe());
		}
		else {
			return (name + "\t" + punkte + "\n");
		}
	}
}
