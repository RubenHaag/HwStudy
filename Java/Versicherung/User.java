class User {
	public static void ausgabe(String aus){
		System.out.println("\n");
		System.out.print(aus);
	}
	public static void main(String[] args) {
		Policen[] liste = new Policen[100];
		liste[0]= new Kfz("Tom","Freude",65.36,4);
		liste[1]= new Kfz("Farido","A. Sportkanone",23.97,1);

		liste[2]= new Hafti("Moritz", "Gerlach", 199.99, 5, 6780, 4);
		liste[3]= new Hafti("Ruben", "Haag", 200.01, 3, 5000, 4);
		
		liste[4]= new Leben("Bord", "Bernt", 27.99, 36, 90, 3);
		liste[5]= new Leben("Jonas", "Feuerstein", 35.95, 61, 95, 2);

		for (int i=0;i<5 ;i++ ) {
			ausgabe(liste[i].rechnungStellen());
		}
		
		ausgabe(liste[1].auszahlen("Totalschaden", 250000));
		ausgabe(liste[0].auszahlen("Frontschaden", 25000));

		ausgabe(liste[3].auszahlen("Hat einen Windows Pc", 10000000));
		ausgabe(liste[3].auszahlen("Hat einen Windows Pc", 10000000));

		ausgabe(liste[4].auszahlen("war langsamer als die Kugel"));
		ausgabe(liste[5].auszahlen("Autounfall"));
	}
}
