public abstract class Policen {
	String name;
	String vorname;
	double minBeitrag;

	public abstract String rechnungStellen();
	public abstract String auszahlen();
	public abstract String auszahlen(String beschribung, int schaden);
	public abstract String auszahlen(String beschribung);
	
}