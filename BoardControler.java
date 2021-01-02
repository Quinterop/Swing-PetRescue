import java.util.Scanner;
import java.io.*;
import java.util.*;

public class BoardControler{
  BoardModel model;
  BoardView view;
  Scanner sc;

  private char[] base = {'p', 'y', 'r', 'g', 'b', '/', 'a', '*', 'z', 'e', 't', 'u', 'i', 'o', 'p', 'q', 's', 'd', 'm'};
  /* Pour l'affichage dans le terminal
  p,y,r,g,b = bloque de couleur simple Purple, Yellow, Red Green or Blue
  / = Block immobile
  a = animal
  * = vide
  m = bombe
  z,e,t,u,i = bloque de cage
  o,p,q,s,d = bloque ballon
  */

  public BoardControler(BoardModel m, BoardView v){
    this.model = m;
    this.view = v;
  }

  public void setModel(String pathname){
    sc = null;

    try {
      sc = new Scanner(new File(pathname));
    }

    catch(Exception e){
      System.out.println("Erreur lors de l'ouverture du fichier:");
      e.printStackTrace();
      System.exit(1);
    }

    this.model = /*Placeholder*/null/*Placeholder*/;
  }

  private LinkedList<Block> [] readLign(){
    LinkedList<Block> lign = new LinkedList<Block>();


    while(sc.hasNext()){

    }
  }

  public Block [][] readBoard(){
    sc.useDelimiter(", ");
    int height = Integer.parseInt(sc.next());
    int width = Integer.parseInt(sc.next());


    LinkedList<LinkedList<Block>> temp = new LinkedList<LinkedList<Block>>();
    Block[][] ret = new Block[height][width];
    sc.useDelimiter("\n\\s*\n");

    while(sc.hasNext()){/* tant qu'il reste des lignes à lire*/
      LinkedList<Block> l = readLign();
      temp.add(l);
    }

    int i = 0;
    int j = 0;

    for ( LinkedList<Block> ligne : temp) {
      i = 0;
      for ( Block cell : ligne) {
        ret[i][j] = cell;
        i++;
      }
      j++;
    }

    return ret;
  }

/*  public Block toBlock(){

}*/


}
