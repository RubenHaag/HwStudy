class Verbrecherhash extends Hashing{
	Verbrecher [] s;
	int länge;
	Verbrecherhash(int länge){
		s = new Verbrecher [länge];
		this.länge= länge;
	}
	Verbrecherhash(){
		s = new Verbrecher [100];
		länge = 100;
	}

	void einfügen(Verbrecher x){
		int hcode = hashfunktion(x.getName()) % länge;
		while (s [hcode] != null){
				hcode*= 1.7 % länge;
		}
		s[hcode] = x;
	}
	void löschen(String name){
		int hcode = hashfunktion(name) % länge;
		while (s[hcode].getName().equals(name)){
				hcode*= 1.7 % länge;
		}
		s[hcode] = null;
	}
	Verbrecher suchen(String name){
		int hcode = hashfunktion(name) % länge;
		while (s[hcode].getName().equals(name)){
				hcode*= 1.7 % länge;
		}
		return s[hcode];
	}
	

	void ausgabe(){
		System.out.println("Name\t\tArt des Vergehens\t\t\tHaftbefehl");
		for(int i = 0; i<30; i++){
			System.out.print("-");
		}
		System.out.println("");
		for(int i = 0; i < länge; i++){
			if(s[i] != null){
				System.out.println(s[i].getName() + s[i].getArtDesVergehns() + s[i].getHaftbefehl());
			}
		}
	}
}