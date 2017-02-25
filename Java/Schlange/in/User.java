
public class User {

	public static void main(String[] args) {
		
		Stativ s01=new Stativ("Apfel");
		s01.Einfuegen(new Element("Traube"));
		s01.Einfuegen(new Element("Banane"));
		s01.Einfuegen(new Element("Apfel"));
		s01.listeInhaltGeben();
		System.out.println(s01.knotenGeben(1).getInhalt().datenGeben());
		System.out.println(s01.knotenGeben(3).getInhalt().datenGeben());
		System.out.println(s01.knotenGeben(s01.getAnzahl()).getInhalt().datenGeben());
		for(int i=0; i<6;i++){
			s01.obenEntnehmen();
		}
		s01.obenEinfuegen(new Element("Ananas"));
		s01.obenEinfuegen(new Element("Birne"));
		s01.obenEinfuegen(new Element("grapefruit"));
		s01.obenEinfuegen(new Element("zitrone"));
		s01.obenEinfuegen(new Element("Orange"));
		
		s01.listeInhaltGeben();
		

	}

}
