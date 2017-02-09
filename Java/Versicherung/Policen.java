public abstract class Policen {
	String name;
	String vorname;
	double minBeitrag;

	public abstract String rechnungStellen();
	public abstract void auszahlen();
	public abstract void auszahlen(String beschribung, int schaden);
	
}