/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 16.02.2017
  * @author
  */

public class Element {
  String bezeichner;
  Element(String bezeichner){
    this.bezeichner = bezeichner;
  }
  String datenwertGeben(){
    return bezeichner;
  }
}
