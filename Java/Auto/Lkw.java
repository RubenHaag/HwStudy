class Llkw extends Auto{
	int ladefläche;
	boolean anhänger;

	Lkw(int ladefläche, boolean anhänger, String motor, int ps, String marke,  int vMax){
		this(String motor, int ps, String marke,  int vMax);
		this.ladefläche = ladefläche;
		this.anhänger   = anhänger;
	}
	void setLadefläche(int ladefläche){
		this.ladefläche = ladefläche;
	}
	int getLadefläche(){
		return ladefläche;
	}
	void setAnhänger(boolean anhänger){
		this.anhänger = anhänger;
	}
	boolean getAnhänger(){
		return anhänger;
	}
}