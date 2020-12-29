package projet;

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
  / = BoardModel.Block immobile
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

/*  private BoardModel.Block [] readLign(){
    LinkedList<BoardModel.Block> lign = new LinkedList<BoardModel.Block>();


  }*/

  public BoardModel.Block [][] readBoard(){
    sc.useDelimiter(", ");
    int height = Integer.parseInt(sc.next());
    int width = Integer.parseInt(sc.next());
    LinkedList<LinkedList<BoardModel.Block>> temp = new LinkedList<LinkedList<BoardModel.Block>>();
    BoardModel.Block[][] ret = new BoardModel.Block[height][width];

    while(sc.hasNext()){/* tant qu'il reste des lignes à lire*/

    }

    return ret;
  }

/*  public BoardModel.Block toBoardModel.Block(){

}*/


}
