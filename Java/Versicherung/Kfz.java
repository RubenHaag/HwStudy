class Kfz extends Policen {

	Kfz(String vorname, String name, double minBeitrag, int plaktte){
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
			default: multi = 7; break; // keine bedrüger!!!
				
		}
		return ("Hallo "+vorname+" "+name+",\nDie Rechnung von ihrer Kfz-Versicherrung ist da.\nSie müssen "+minBeitrag*multi+"€ zahlen.\nDer zu zahlende Beitrag entsteht durch ihren Mindestbeitrag ( "+minBeitrag+"€ ) und die Multipikatoin mit dem Faktor( "+multi+" ) aufgrund Ihrer Umweltplakette. ( "+plaktte+" ).\n");
	}
	public String auszahlen(String beschribung, int schaden){
		return("Der Schaden, "+ beschribung+" in Höhe von "+schaden+"€ wurde repariert.\n");
	}
	public String auszahlen(){
		return(" geht nicht");
	}
	public String auszahlen(String beschreibung){
		return(" geht nicht");
	}
}