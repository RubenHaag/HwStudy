class Hafti extends Policen {
	int alter;
	int schadensdeckung;
	int jährlicheErhöhung;
	int risiko
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
		return ("Die Rechnung von iher Lebensversicherung ist Da.\nSie müssen "+minBeitrag+"€ zahlen.\nDer zu zahlende beitrag ensteht durch ihren Mindesbeiteig ( "+minBeitrag+"€ ), der mit ihrer Risikostufe multipliziert wird");
	}
	public String auszahlen(){
		return(" geht nicht")
	}
	public String auszahlen(String beschreibung, int schaden){
		if(schaden < schadensdeckung){
			return ("Da sie" +name+ "bei Folgendem Unglück \n" + beschreibung + "\n Den folgenden Schaden verusacht haben:\n " + schaden +"\n bekommen sie diesen abzüglich einer Selbstbeteiligung von:\n" + risiko * 100 +"erstattet");
		}
		else{
			return ("Da sie" +name+ "bei Folgendem Unglück \n" + beschreibung + "\n Den folgenden Schaden verusacht haben:\n " + schaden +"\n , und dieser Schaden ihre maximale Schadensdeckung von " +schadensdeckung+"€ übersteigt\nbekommen sie jene abzüglich einer Selbstbeteiligung von:\n" + risiko * 100 +"erstattet");
		}
	}
}