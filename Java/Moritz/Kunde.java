class Kunde{
  String name;
  double betrag;
  Kunde next;
  
  
  
  Kunde(String n, double b){
  name= n;
  betrag=b;
  next = null;
  }
  
  public Kunde nächsterGeben(){
    return next;
  }
  public void nächsterSetzen(Kunde k){
    next=k;
  }
}