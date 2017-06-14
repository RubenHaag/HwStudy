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
		if(n.isEqual(name)){
			return this;
		}
		else if(nächster != null){
			return nächster.suchen(n);
		}
		else{return null};
	}
	public void hintenAnfügen(Objekt e){
		if(nächster == null){
			this.nächster == e;
		}
		else{
			nächster.hintenAnfügen(e);
		}
	}
	public String loeschen(String n){
		if(nächster.getName().isEqual(n)){
			nächster = nächster.nächster;
		}
		else if (nächster != null){
			nächster.loeschen();
		}
		else {
			return("Error dieser Name ist nicht vorhanden!");
		}
	}	
}
