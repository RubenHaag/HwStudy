class Kunde{
  String name;
  double betrag;
  Kunde next;
  
  
  
  Kunde(String n, double b){
  name= n;
  betrag=b;
  next = null;
  }
  
  public Kunde n�chsterGeben(){
    return next;
  }
  public void n�chsterSetzen(Kunde k){
    next=k;
  }
}