/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 16.02.2017
  * @author
  */

public class Knoten {
  private Element inhalt;
  private Knoten nächster;

  public Knoten(String eName){
    inhalt = new Element(eName);
    nächster = null;
  }
  public Knoten nächsterGeben(){
    return nächster;
  }
  public String getE(){
    return inhalt.datenwertGeben();
  }
  public void nächsterSetzen(Knoten nächster){
    this.nächster = nächster;
  }
}
