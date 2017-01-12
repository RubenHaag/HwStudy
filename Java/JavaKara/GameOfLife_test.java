import javakara.JavaKaraProgram;


public class GameOfLife_test extends JavaKaraProgram {
  public short runden = 100;
  public int feldgröße = 50;
  public int fortpflanzungPflanz = 2;
  public int fortpflanzungFress = 2;
  public int jagdwahrscheinlichkeit = 18;

  public int [][] besetzungAkt = new int [feldgröße][feldgröße];//in das erste Kästchen immer spalte
  public int [][] besetzungNeu = new int [feldgröße][feldgröße];//in das zweite zeile

  
  public void zufallsFeld(){
    //generiert ein zufällig besetztes Feld
    world.clearAll();
    for(int zeile = 0; zeile<feldgröße; zeile++){
      for(int spalte = 0; spalte<feldgröße; spalte++){

        besetzungAkt[zeile][spalte] = tools.random(3);
        //besetzt alle felder bei denen tools.random = 1 ist mit einem Blatt
        if(besetzungAkt[zeile][spalte] == 1){
          world.setLeaf(zeile, spalte, true);
        }
        //besetzt alle felder bei denen tools.random = 2 ist mit einem Pilz
        if(besetzungAkt[zeile][spalte] == 2){ 
          world.setMushroom(zeile, spalte, true);
        }
        //besetzt alle Felder bei denen tools.random = 3 ist mit einem Pilz und einem Blatt
        if(besetzungAkt[zeile][spalte] == 3){
          world.setMushroom(zeile, spalte, true);
        world.setLeaf(zeile, spalte, true);
        }
        //besetzt die Randfelder mit Bäumen
        if ((spalte==0 || zeile==0 || spalte==49 || zeile==49)){
          world.setMushroom(zeile, spalte, false);
          world.setLeaf(zeile, spalte, false);
          world.setTree(zeile, spalte, true);
                    
        }
      }
    }
  }


  public int vermehrungsscan(int zeile, int spalte, boolean pflanze){
    int i = 0;
      
    if(pflanze == true){
      for(int x = zeile-1; x<=(zeile+1); x++){
        for(int y = spalte-1; y<=(spalte+1); y++){
          if (world.isLeaf(x , y)){
            i++;  
          }
        }
      }
    }
    if(pflanze == false){
      for(int x = zeile-1; x<=(zeile+1); x++){
        for(int y = spalte-1; y<=(spalte+1); y++){
          if (world.isMushroom(x , y))
            i++;
        }
      }
    }
    return i;
  }

  public void fortpflanzungPflanzen(int fortpflanzungPlanz){
    for(int zeile = 0; zeile<feldgröße; zeile++){
      for(int spalte = 0; spalte<feldgröße; spalte++){
        if (!(spalte==0 || zeile==0 || spalte==49 || zeile==49)){
          if(vermehrungsscan(zeile, spalte, true)>fortpflanzungPlanz){
            if(!world.isMushroom(zeile,spalte)){
              besetzungNeu[zeile][spalte]=1;
            }
            if(world.isMushroom(zeile,spalte)){
              besetzungNeu[zeile][spalte]=3;
            }
            if(!(besetzungNeu[zeile][spalte]==1||besetzungNeu[zeile][spalte]==2||besetzungNeu[zeile][spalte]==3)){
              besetzungNeu[zeile][spalte]=0;
            }
          }
        }
      }
    }
    for(int zeile = 0; zeile<feldgröße; zeile++){
      for(int spalte = 0; spalte<feldgröße; spalte++){
        if(besetzungNeu[zeile][spalte]==1||besetzungNeu[zeile][spalte]==3){
          world.setLeaf(zeile, spalte, true);
        }
      }
    }
  }
  
  public void fortpflanzungFresser(int fortpflanzungFress){
    for(int zeile = 0; zeile<feldgröße; zeile++){
      for(int spalte = 0; spalte<feldgröße; spalte++){
        if (!(spalte==0 || zeile==0 || spalte==49 || zeile==49)){
          if(vermehrungsscan(zeile, spalte, false)>fortpflanzungFress){

            if(!world.isLeaf(zeile,spalte)){
              besetzungNeu[zeile][spalte]=2;
            }

            if(world.isLeaf(zeile,spalte)){
              besetzungNeu[zeile][spalte]=3;
            }
            if(!(besetzungNeu[zeile][spalte]==1||besetzungNeu[zeile][spalte]==2||besetzungNeu[zeile][spalte]==3)){
              besetzungNeu[zeile][spalte]=0;
            }
          }
        }
      }
    }
    for(int zeile = 0; zeile<feldgröße; zeile++){
      for(int spalte = 0; spalte<feldgröße; spalte++){
        if(besetzungNeu[zeile][spalte]==2||besetzungNeu[zeile][spalte]==3){
          world.setMushroom(zeile, spalte, true);
        }
      }
    }
  }
  

  public void jagd(){
    int zufall=0;

    for(int zeile = 0; zeile<feldgröße; zeile++){
      for(int spalte = 0; spalte<feldgröße; spalte++){
        boolean gefressen = false;
        if(world.isMushroom(zeile, spalte)){
          for(int x = zeile-1; x<=(zeile+1); x++){
            for(int y = spalte-1; y<=(spalte+1); y++){
              if(!gefressen){
                if (world.isLeaf(x , y)){
                  zufall=tools.random(99);
                  if(zufall<=(jagdwahrscheinlichkeit-1)){
                    world.setLeaf(x, y, false);
                    gefressen=true;
                    if(world.isLeaf(zeile, spalte)){
                      besetzungNeu[zeile][spalte]=3;
                    }
                    else{
                      besetzungNeu[zeile][spalte]=2;
                    }
                  }
                }
              }
            }
          }
          
          if(!gefressen){
            world.setMushroom(zeile, spalte, false);
           if(world.isLeaf(zeile, spalte)){
              besetzungNeu[zeile][spalte]=1;
            }
            else{
              besetzungNeu[zeile][spalte]=0;
            }
          }       
        }
      }
    }
  }
  public void neueWorld(){
    for(int zeile = 0; zeile<feldgröße; zeile++){
      for(int spalte = 0; spalte<feldgröße; spalte++){
        besetzungAkt[zeile][spalte] = besetzungNeu[zeile][spalte];
        besetzungNeu[zeile][spalte] = 0;
        if(besetzungAkt[zeile][spalte] == 1){
          world.setLeaf(zeile, spalte, true);
        }
        if(besetzungAkt[zeile][spalte] == 2){
          world.setMushroom(zeile, spalte, true);
        }
        if(besetzungAkt[zeile][spalte] == 3){
          world.setMushroom(zeile, spalte, true);
          world.setLeaf(zeile, spalte, true);
        }
        if(besetzungAkt[zeile][spalte] == 0){
          world.setMushroom(zeile, spalte, false);
          world.setLeaf(zeile, spalte, false);
        }
      }
    }
  }
  public void zahlen(){

  }
  public void zähler(int runde){
      
  }

    
  // hier können Sie eigene Methoden definieren

  public void myProgram() {
  // hier kommt das Hauptprogramm hin, z
    world.setSize(feldgröße,feldgröße+20);
    zufallsFeld();

    for (short i = 0; i<=runden; i++){
      jagd();
      fortpflanzungPflanzen(fortpflanzungPflanz);
      fortpflanzungFresser(fortpflanzungFress);
      tools.println("Runde:\t"+i+"\f");
    }
  }
}