public abstract class Policen {
	String name;
	String vorname;
	double minBeitrag;

	public abstract String rechnungStellen();
	public abstract double auszahlen();
	public abstract double auszahlen(String beschribung, int schaden);
	
}