import javakara.JavaKaraProgram;
        
/* BEFEHLE:  kara.
 *   move()  turnRight()  turnLeft()
 *   putLeaf()  removeLeaf()
 *
 * SENSOREN: kara.
 *   treeFront()  treeLeft()  treeRight()
 *   mushroomFront()  onLeaf()
 */
public class Zahlen_test extends JavaKaraProgram {

  // hier können Sie eigene Methoden definieren
public void zahlen(int zahl, int spalte, int zeile){
    if(zahl == 0){
      for(int x=0; x<=4; x++){
        world.setTree(spalte, zeile+x, true);
      }
      for(int x=0; x<=4; x+=4){
        world.setTree(spalte+1, zeile+x, true);
      }
      for(int x=0; x<=4; x++){
        world.setTree(spalte+2, zeile+x, true);
      }
    }
    if(zahl == 1){
      for(int x = 0; x<=4; x++){
        world.setTree(spalte,zeile+x, true);
      }
    }
    if(zahl==2){
      for (int x=0; x<=2; x++){
        world.setTree(spalte+x, zeile, true);
      }
      world.setTree(spalte+2, zeile+1, true);

      for (int x=0; x<=2; x++){
        world.setTree(spalte+x, zeile+2, true);
      }
      world.setTree(spalte, zeile+3, true);
      for (int x=0; x<=2; x++){
        world.setTree(spalte+x, zeile+4, true);
      }

    }
    if(zahl==3){
      for (int x=0; x<=2; x++){
        world.setTree(spalte+x, zeile, true);
      }
      world.setTree(spalte+2, zeile+1, true);

      for (int x=0; x<=2; x++){
        world.setTree(spalte+x, zeile+2, true);
      }
      world.setTree(spalte+2, zeile+3, true);
      for (int x=0; x<=2; x++){
        world.setTree(spalte+x, zeile+4, true);
      }
    }
    if(zahl==4){
      for(int x=0; x<=2;x++){
        world.setTree(spalte, zeile+x, true);
      }
      world.setTree(spalte+1, zeile+2, true);
      for(int x=1; x<=4;x++){
        world.setTree(spalte+2, zeile+x, true);
      }
    }
    if(zahl==5){
      for (int x=0; x<=2; x++){
        world.setTree(spalte+x, zeile, true);
      }
      world.setTree(spalte, zeile+1, true);

      for (int x=0; x<=2; x++){
        world.setTree(spalte+x, zeile+2, true);
      }
      world.setTree(spalte+2, zeile+3, true);
      for (int x=0; x<=2; x++){
        world.setTree(spalte+x, zeile+4, true);
      }
    }
    if(zahl==6){
      for (int x=0; x<=2; x++){
        world.setTree(spalte+x, zeile, true);
      }
      world.setTree(spalte, zeile+1, true);

      for (int x=0; x<=2; x++){
        world.setTree(spalte+x, zeile+2, true);
      }
      for(int x=0; x<=2; x+=2){
        world.setTree(spalte+x, zeile+3, true);
      }
      for (int x=0; x<=2; x++){
        world.setTree(spalte+x, zeile+4, true);
      }
    }
    if(zahl==7){
      for (int x=0; x<=2; x++){
        world.setTree(spalte+x, zeile, true);
      }
      for(int x=1; x<=4; x++){
        world.setTree(spalte+2, zeile+x, true);
      }
    }
    if(zahl==8){
      for(int x=0; x<=4; x++){
        world.setTree(spalte, zeile+x, true);
      }
      for(int x=0; x<=4; x+=2){
        world.setTree(spalte+1, zeile+x, true);
      }
      for(int x=0; x<=4; x++){
        world.setTree(spalte+2, zeile+x, true);
      }
    }
    if(zahl==9){
      for (int x=0; x<=2; x++){
        world.setTree(spalte+x, zeile, true);
      }
      for(int x=0; x<=2; x=x+2){
        world.setTree(spalte+x, zeile+1, true);
      }
      for (int x=0; x<=2; x++){
        world.setTree(spalte+x, zeile+2, true);
      }
      world.setTree(spalte+2, zeile+3, true);
      for (int x=0; x<=2; x++){
        world.setTree(spalte+x, zeile+4, true);
      }
    }
  }
  public void myProgram() {
    // hier kommt das Hauptprogramm hin, zB:
    world.clearAll();
    for(int x=0; x<=9; x++){
      for(int y=0; y<=9; y++){
        zahlen(y,4,0);
        zahlen(x,0,0);
        tools.sleep(999);
        
        world.clearAll();
        
      }
      
    }
  }
}


        