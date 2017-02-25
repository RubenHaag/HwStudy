class User{
	static Stativ a = new Stativ(new Knoten("Apfel"));

	public static void main(String[] args) {
		a.hintenAnfügen(new Knoten("Trauben"));
		a.hintenAnfügen(new Knoten("Banane"));
		a.hintenAnfügen(new Knoten("Apfel"));

		for(int i = 0; i < 6; i++){
			a.obenEntnehmen();
		}
		a.obenEinfügen(new Knoten("Ananas"));
		a.obenEinfügen(new Knoten("Birne"));
		a.obenEinfügen(new Knoten("Grapefruit"));
		a.obenEinfügen(new Knoten("Zitrone"));
		a.delK(3);
		a.ausgabe();

	}
}