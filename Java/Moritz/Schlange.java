class Schlange extends Kette{
  Kunde erster;
  double gesamt;
  
  Schlange(){
    double  gesamt=0;
  }
  
  public void bezahln(Kunde k){
    gesamt=gesamt+k.betrag;
  }
  
  public void anstellen(Kunde k){
   Kunde aktuell = k;
   while (!aktuell.nächsterGeben()=null) {
        aktuell=aktuell.nächsterGeben();
    }
    aktuell.nächsterSetzen(k);
  }
  public void abArbeiten(){
   Kunde alterster= erster;
   bezahlen(alterster);
   erster=erster.nächsterGeben();
  }
  public void anzeigenKassenstant()
   System.out.printli("In Kasse liegen "+gesamt+50+"€");
   System.out.printli("Davon eingenommen sind"+gesamt+"€");
    System.out.printli("Gewinn ist davon"+gesamt*80%+"€");

}