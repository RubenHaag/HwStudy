package Ordentlich;

public class Verkehrssünder extends objekte{
	private String name;
	private String punktestand;
	private String erstellungsdatumDesFührerscheins;

	Verkehrssünder(String name, String punktestand, String b){
		this.name= name;
		this.punktestand= punktestand;
		this.erstellungsdatumDesFührerscheins= b;
	}

	public String getName(){
		return name;
	}
	public String getPrimaryKey(){
		return name;
	}

	public String getpunktestand(){
		return punktestand;
	}

	public String getErstellungsdatumDesFührerscheins(){
		return erstellungsdatumDesFührerscheins;
	}
}
