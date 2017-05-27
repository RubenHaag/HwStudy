package Ordentlich;

class User {
	public static void main(String[] args) {
		Punktehash fdrf =  new Punktehash(10);
		Verkehrssünder v01= new Verkehrssünder("Ruben Haag","§ Ruben Haag", "30.7.2017");
		Verkehrssünder v02= new Verkehrssünder("Moritz Gerlach","§ 147 Inverkehrbringen von Falschgeld","300.10.2017");
		Verkehrssünder v03= new Verkehrssünder("Tom Wolf","§ 147 Inverkehrbringen von Falschgeld","7.1.2017");
		Verkehrssünder v04= new Verkehrssünder("Farido","alle","1.2.3000");
		Verkehrssünder v05= new Verkehrssünder("Jonas Anspitzer","§ 89 Verfassungsfeindliche Einwirkung auf Bundeswehr und öffentliche Sicherheitsorgane","3.2.1234");
		
		fdrf.einfügen(v01);
		fdrf.einfügen(v03);
		fdrf.einfügen(v05);
		fdrf.ausgabe();
		fdrf.einfügen(v02);
		fdrf.einfügen(v04);
		fdrf.ausgabe();
		fdrf.suchen("Farido");
		fdrf.löschen("Moritz Gerlach");
		fdrf.ausgabe();
		fdrf.einfügen(v02);
	}
}