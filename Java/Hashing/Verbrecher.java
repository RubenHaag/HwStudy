class Verbrecher {
	private String ganzName;
	private String artDesVergehns;
	private boolean haftbefehl;

	Verbrecher(String name, String art, boolean haftbefehl){
		ganzName= name;
		artDesVergehns= art;
		this.haftbefehl= haftbefehl;
	}

	public String getName(){
		return ganzName;
	}

	public String getArtDesVergehns(){
		return artDesVergehns;
	}

	public boolean getHaftbefehl(){
		return haftbefehl;
	}
	
}