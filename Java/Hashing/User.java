
public class User {


	public static void main(String[] args) {
		Register r01 = new Register(20);
		Verkehrssuendiger v01 = new Verkehrssuendiger("Hans", 2, "Berlin");
		Verkehrssuendiger v02 = new Verkehrssuendiger("Peter", 2, "Berlin");
		Verkehrssuendiger v03 = new Verkehrssuendiger("Hans1", 2, "Berlin");
		Verkehrssuendiger v04 = new Verkehrssuendiger("Peter2", 2, "Berlin");
		Verkehrssuendiger v05 = new Verkehrssuendiger("Hans3", 2, "Berlin");
		Verkehrssuendiger v06 = new Verkehrssuendiger("Peter4", 2, "Berlin");
		Verkehrssuendiger v07 = new Verkehrssuendiger("Peter5", 2, "Berlin");
		Verkehrssuendiger v08 = new Verkehrssuendiger("Hans4", 2, "Berlin");
		Verkehrssuendiger v09 = new Verkehrssuendiger("Peter6", 2, "Berlin");
		r01.einfügen(v01);
//		r01.einfügen(v02);
//		r01.einfügen(v03);
//		r01.einfügen(v04);
//		r01.einfügen(v05);
//		r01.einfügen(v06);
//		r01.einfügen(v07);
//		r01.einfügen(v08);
//		r01.einfügen(v09);
//		r01.ausgabe();
//		r01.loeschen("Peter");
		r01.ausgabe();
		r01.suchen("Tom");
		
	
		
	}

}
