public class Knoten {
	private Element inhalt;
	private Knoten naechster;
	Knoten(Element e){
		inhalt=e;
		naechster=null;
	}
	public Knoten naechsterGeben(){
		return naechster;
	}
	public void naechsterSetzen(Knoten k){
		naechster=k;
	}
	public Element getInhalt(){
		return inhalt;
	}

}
