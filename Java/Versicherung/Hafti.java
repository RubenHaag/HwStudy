class Hafti extends Policen {
	int alter;
	int schadensdeckung;
	int jährlicheErhöhung;
	int risiko;
	Hafti(String name, String vorname, double minBeitrag, int alter, int schadensdeckung, int risiko){
		this.name =name;
		this.vorname =vorname;
		this.minBeitrag =minBeitrag;
		this.schadensdeckung = schadensdeckung;
	}

	
	double multi;

	public String rechnungStellen(){
		switch(risiko){
			case 4: multi=1.6; break;
			case 3: multi=1.4; break;
			case 2: multi=1.2; break;
			case 1: multi=1; break;
		}
		return ("Die Rechnung von iher Lebensversicherung ist Da.\nSie müssen "+minBeitrag+"€ zahlen.\nDer zu zahlende beitrag ensteht durch ihren Mindesbeiteig ( "+minBeitrag+"€ ), der mit ihrer Risikostufe multipliziert wird\n");
	}
	public String auszahlen(){
		return(" geht nicht");
	}
	public String auszahlen(String beschreibung){
		return(" geht nicht");
	}
	public String auszahlen(String beschreibung, int schaden){
		if(schaden < schadensdeckung){
			return ("Da sie " +name+ " bei Folgendem Unglück ”" + beschreibung + "” Den folgenden Schaden verusacht haben: " + schaden +"\n bekommen sie diesen abzüglich einer Selbstbeteiligung von:" + risiko * 100 +"erstattet\n");
		}
		else{
						return ("Da sie" +name+ "bei Folgendem Unglück ”" + beschreibung + "”Den folgenden Schaden verusacht haben: " + schaden +" , und dieser Schaden ihre maximale Schadensdeckung von " +schadensdeckung+"€ übersteigt bekommen sie jene abzüglich einer Selbstbeteiligung von: " + risiko * 100 +"erstattet\n");
		}
	}
}