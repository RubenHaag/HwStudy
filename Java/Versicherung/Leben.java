class Leben extends Policen {
	int alter;
	int schadensdeckung;
	int jährlicheErhöhung;
	int risiko
	double multi;

	Leben(String name, String vorname, double minBeitrag, int alter, int schadensdeckung, int risiko){
		this.name =name;
		this.vorname =vorname;
		this.minBeitrag =minBeitrag;
		this.schadensdeckung = schadensdeckung;
	}

	

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
	public String auszahlen(String beschreibung){
		return ("Da ihr Verwandter" +name+ "bei Folgendem Unfall verunglück ist \n" + beschreibung + "\n erhalten sie einen Schadensersatz von " + schadensdeckung);
	}
}