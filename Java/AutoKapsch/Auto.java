class Auto{
	int tankgröße;
	int verbrauch;
	int tankstand;

	Auto(int tankgröße, int verbrauch){
		this.tankgröße = tankgröße;
		this.verbrauch = verbrauch;
	}
	public void fahren(int sInKm){
		x = sInKm * verbrauch /100;
		if(x>tankstand){
			sMax = verbrauch * tankstand;
			System.out.println("Der Tank enhält leider nicht genug
								\aSprit\n um diese Strecke zurückzulegen\n
								es kann maximal " + sMax + " km fahren\n
								und fährt jetzt los")
			tankstand = 0;
		}
		else{ 
			System.out.println("Das Auto fährt nun " + sInKm + " und\n
								verbraucht dabei " + x + "Liter Benzin");
			tankstand -= x;
		}
	}
	public void tanken(int l){
		x = l + tankstand;
		if(x > tankgröße){
			System.out.println("Die maximale Füllmenge ist bereits bei \a\n"
								 + (tankgröße - tankstand) + "l erreicht");
			tankstand = tankgröße;

		}
		else{
			tankstand += l;
			System.out.println("Dem Auto werden " + l + " Liter Benzin zugeführt\n
								der neue Tankstand ist: " + tankstand + "l\a");

		}
	}
}