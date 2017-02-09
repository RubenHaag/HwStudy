class User {
	
	public static void main(String[] args) {
		Policen[] liste = new Policen[100];
		liste[0]= new Kfz("Tom","Haag",65.36,4);
		liste[0].rechnungStellen();
		liste[1]= new Hafti("Moritz", "Gerlach", 199.99, 5, 5000000, 4)
		liste[1].rechnungStellen();
		liste[1].auszahlen("Hat einen Windows Pc", 10000000000000)
	}
}
