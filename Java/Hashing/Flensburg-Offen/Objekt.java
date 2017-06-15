public abstract class Objekt {
	Objekt nächster;
	public abstract String getName();
	public abstract Objekt suchen(String n);
	public abstract String loeschen(String n);
	public abstract void einfügen(Objekt e);
	public abstract String ausgabe();
}
