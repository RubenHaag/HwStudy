class Auto{
	String motor;
	int ps;
	String marke;
	int vMax;

	Auto(){
		motor = "unbekannt";
		marke = "unbekannt";
	}
	Auto(String motor, int ps, String marke,  int vMax){
		this.motor = motor;
		this.ps = ps;
		this.marke = marke;
		this.vMax = vMax;
	}
	void setMotor(String motor){
		this.motor = motor;
	}
	Sring getMotor(){
		return motor;
	}
	int getPs(){
		return ps;
	}
	void setPs(){
		this.ps = ps;
	}
	String getMarke(){
		return marke;
	}
	void setMarke(String marke){
		this.marke = marke;
	}
	int setVmax(int vMax){
		this.vMax = vMax;
	}
}