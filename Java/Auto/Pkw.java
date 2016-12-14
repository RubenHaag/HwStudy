class Pkw extends Auto{
	int sitze;
	int kofferraumV;

	Pkw(int sitze, int kofferraumV, String motor, int ps, String marke, int vmax){
		this(motor, ps, marke, vmax);
		this.sitze = sitze;
		this.kofferraumV = kofferraumV;
	}
	int getSitze(){
		return sitze;
	}
	void setSitze(String sitze){
		this.sitze = sitze;
	}
	int getKofferaum(){
		return kofferraumV;
	}
	void setKofferraum(String kofferraumV){
		this.kofferraumV = kofferraumV;
	}
}