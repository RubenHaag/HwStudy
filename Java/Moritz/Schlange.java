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
   while (!aktuell.n�chsterGeben()=null) {
        aktuell=aktuell.n�chsterGeben();
    }
    aktuell.n�chsterSetzen(k);
  }
  public void abArbeiten(){
   Kunde alterster= erster;
   bezahlen(alterster);
   erster=erster.n�chsterGeben();
  }
  public void anzeigenKassenstant()
   System.out.printli("In Kasse liegen "+gesamt+50+"�");
   System.out.printli("Davon eingenommen sind"+gesamt+"�");
    System.out.printli("Gewinn ist davon"+gesamt*80%+"�");

}