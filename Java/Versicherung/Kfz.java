class Kfz extends Policen {

	Kfz(String name, String vorname, double minBeitrag, int plaktte){
		this.name =name;
		this.vorname =vorname;
		this.minBeitrag =minBeitrag;
		this.plaktte=plaktte;
	}

	int plaktte;
	double multi;

	public String rechnungStellen(){
		switch(plaktte){
			case 1: multi=1.6; break;
			case 2: multi=1.4; break;
			case 3: multi=1.2; break;
			case 4: multi=1; break;
		}
		return (" Die Rechnung von iher Kfzversicherrung ist Da.\nSie müssen "+minBeitrag*multi+"€ zahlen.\nDer zu zahlende beitraäg enseht durch ihren Mindesbeiteig ( "+minBeitrag+"€ ) und die Multipikatoin mit dem Facktor( "+multi+"€ ) durch ihre Umweltbacktte. ( "+plaktte+" )");
	}
	public double auszahlen(String beschribung, int schaden){
		System.out.print("Der Schaden, in höhe von "+schaden+"€ wurde entfernt.");
	}
}