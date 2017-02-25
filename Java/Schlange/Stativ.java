/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 16.02.2017
  * @author Ruben Haag
  */

public class Stativ {
  private int anzahl;
  private Knoten erster;
  Stativ(Knoten erster){
    this.erster = erster;
  }
  public Knoten obenEntnehmen(){
    if (anzahl > 0){
      System.out.println("Fehler es gibt hier keinen Knoten");
      return null;
    }
    else{
      Knoten k = erster;
      erster = k.nächsterGeben();
      anzahl--;
      return k;
    }
  }
  public Knoten delK(int pos){
    if(anzahl>0){
      Knoten alterK = knotenGeben(pos);
      knotenGeben(pos-1).nächsterSetzen(knotenGeben(pos+1));
      anzahl--;
      return alterK;
    }
    else{
      System.out.println("Ich habe keine Knoten mehr");
      return null;
    }
  }
  public void obenEinfügen(Knoten k){
    k.nächsterSetzen(erster);
    erster = k;
    anzahl++;
  }
  public void hintenAnfügen(Knoten e){
    Knoten k = erster;
    for(int i =1; i <= anzahl; i++){
      k = k.nächsterGeben();
    }
    k.nächsterSetzen(e);
    anzahl++;
  }
  public Knoten knotenGeben(int position){
    if((position <1) || (position < anzahl)){
      System.out.println("Fehler!");
      return null;
    }
    else{
      Knoten k = erster;
      for (int i = 1; i < position; i++){
        k = k.nächsterGeben();
      }
      return k;
    }
  }
  public void ausgabe(){
    System.out.println("folgendes ist enthalten:");
    Knoten k = erster;
    for(int i = 1; i < anzahl;i++){
      k = k.nächsterGeben();
      System.out.println(k.getE());
    }
  }
}
