package projet;

public class BoardView{
  BoardModel model;
  BoardControler controler;
  /* Pour l'affichage dans le terminal
  p,y,r,g,b = bloque de couleur simple Purple, Yellow, Red, Green or Blue
  / = block immobile
  a = animal
  * = vide
  m = bombe
  z,e,t,u,i = bloque de cage
  o,p,q,s,d = bloque ballon
  */

  public BoardView(BoardModel m, BoardControler c){
    this.model = m;
    this.controler = c;

    
  }




}
