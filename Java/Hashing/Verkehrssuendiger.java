
public class Verkehrssuendiger extends Objekt {
	private String name;
	private int punkte;
	private String adresse;
	
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
	
	

	

}
