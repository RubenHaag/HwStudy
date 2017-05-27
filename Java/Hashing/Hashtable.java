package Ordentlich;

abstract class Hashtable {
	objekte [] s;
	int länge;
	
	Hashtable(int l){
		s = new objekte [l];
		this.länge= l;
	}
	Hashtable(){
		s = new objekte [100];
		this.länge= 100;
	}	
	
	public int hashfunktion(String s){
		if (s.isEmpty()){
			return 0;
		}
		int x = 0;
		char [] c = s.toCharArray();
		int l = s.length();
		for(int i = 0; i < l; i++){
			x = (int) (x + c[i] * Math.pow(5, l-i));
		}
		x = Math.abs(x);
		return x;
	}
	public void einfügen(objekte x){
		int hcode = hashfunktion(x.getPrimaryKey()) % länge;
		while (s[hcode] != null){
			if(hcode == 0 || hcode == 1){hcode += 2;}
				hcode*= 1.7;
				hcode = hcode % länge;
		}
		s[hcode] = x;
	}
	public void löschen(String key){
		int hcode = hashfunktion(key) % länge;
		while (s[hcode].getPrimaryKey().equals(key)){
			if(hcode == 0 || hcode == 1){hcode += 2;}
			hcode*= 1.7;
			hcode = hcode % länge;
		}
		s[hcode] = null;
	}
	public objekte suchen(String key){
		int hcode = hashfunktion(key) % länge;
		while (s[hcode].getPrimaryKey().equals(key)){
			if(hcode == 0 || hcode == 1){hcode += 2;}
			hcode*= 1.7;
			hcode = hcode % länge;
		}
		return s[hcode];
	}
}
