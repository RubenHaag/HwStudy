class User {
	public static void main(String[] args) {
		Verbracherhash fdrf =  new Verbracherhash(10);
		Verbrecher v01= Verbrecher("Ruben Haag","§-4 Ruben Haag",true);
		Verbrecher v02= Verbrecher("Moritz Gerlach","§ 147 Inverkehrbringen von Falschgeld",false);
		Verbrecher v03= Verbrecher("Tom Wolf","§ 147 Inverkehrbringen von Falschgeld",false);
		Verbrecher v04= Verbrecher("Farido","alle",false);
		Verbrecher v05= Verbrecher("Jonas Anspitzer","§ 89 Verfassungsfeindliche Einwirkung auf Bundeswehr und öffentliche Sicherheitsorgane",false);
		
		fdrf.einfühen(v01);
		fdrf.einfühen(v03);
		fdrf.einfühen(v05);
		fdrf.ausgabe();
		fdrf.einfühen(v02);
		fdrf.einfühen(v04);
		fdrf.ausgabe();
		fdrf.suchen("Farido");
		fdrf.löschen("Moritz Gerlach");
		fdrf.ausgabe();
		fdrf.einfühen(v02);
	}
	
}