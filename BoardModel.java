package projet;

public class BoardModel{
  private BoardView view;
  private BoardControler controler;

  private int height, width;
  private Block [][] board;
  private int score;

  public BoardModel(int h, int w, Block [][] b){
    this.height = h;
    this.width = w;
    this.board = b;
  }

  public boolean isEmpty(int x, int y){
    return (board[x][y] == null);
  }

  public void destroyBlock(int y, int x){
    Block temp = board[x][y];

    if (isEmpty(x,y) || temp.isGrid || temp.isAnimal){
      return;
    } else if (temp.isMine){
      board[x][y] = null;
      destroyMine(x, y);
    } else if (temp.isBalloon){
      board[x][y] = null;
      destroyBalloon(temp);
    } else {
      board[x][y] = null;
      destroyBlock(x+1,y);
      destroyBlock(x-1,y);
      destroyBlock(x,y+1);
      destroyBlock(x,y-1);
      destroyBlock(x+1,y+1);
      destroyBlock(x+1,y-1);
      destroyBlock(x-1,y-1);
      destroyBlock(x-1,y+1);
    }

    adjaGrid(x, y);
  }

  public void destroyMine(int x, int y){
    if (!board[x+1][y].isSolid) board[x+1][y] = null;
    if (!board[x-1][y].isSolid) board[x-1][y] = null;
    if (!board[x][y+1].isSolid) board[x][y+1] = null;
    if (!board[x][y-1].isSolid) board[x][y-1] = null;
    if (!board[x+1][y+1].isSolid) board[x+1][y+1] = null;
    if (!board[x+1][y-1].isSolid) board[x+1][y-1] = null;
    if (!board[x-1][y-1].isSolid) board[x-1][y-1] = null;
    if (!board[x-1][y+1].isSolid) board[x-1][y+1] = null;
  }

  public void destroyBalloon(Block c){
    for (int i = 0; i < width; i++){
      for (int j = 0; j < height; j++){
        if (c.sameColor(board[i][j]) && board[i][j].isGrid) board[i][j].isGrid = false;
        else if(c.sameColor(board[i][j]) && !(board[i][j].isGrid)) board[i][j] = null;
      }
    }
  }

  public void adjaGrid(int x, int y){
    if (board[x+1][y].isGrid) board[x+1][y].isGrid = false;
    if (board[x-1][y].isGrid) board[x-1][y].isGrid = false;
    if (board[x][y+1].isGrid) board[x][y+1].isGrid = false;
    if (board[x][y-1].isGrid) board[x][y-1].isGrid = false;
    if (board[x+1][y+1].isGrid) board[x+1][y+1].isGrid = false;
    if (board[x+1][y-1].isGrid) board[x+1][y-1].isGrid = false;
    if (board[x-1][y-1].isGrid) board[x-1][y-1].isGrid = false;
    if (board[x-1][y+1].isGrid) board[x-1][y+1].isGrid = false;
  }

  public void terminalDisplay(){
    System.out.println("Score : " + "Placeholder");
    System.out.println();

    /*System.out.print("   ");
    for (int i = 0; i < width; i++){
      System.out.print(i + " ");
    }
    System.out.println();*/

    System.out.print("--");
    for (int i = 0; i < height; i++) {
      System.out.print("__");
    }
    System.out.println();

    for (int i = 0;  i < height; i++){
      System.out.print("| ");
      for (int j = 0; j < width; j++) {
        System.out.print(board[i][j].toString());
      }
      System.out.print(" |");
    }

    System.out.print("--");
    for (int i = 0; i < height; i++) {
      System.out.print("__");
    }
    System.out.println();
  }

  static class Block{
    final boolean isMine, isBalloon, isSolid, isAnimal;
    boolean isGrid;
    final String color;

    public Block(){
      this.isMine = true;
      this.isBalloon = false;
      this.isGrid = false;
      this.isSolid = false;
      this.isAnimal = false;
      this.color = null;
    }

    public Block(String c, boolean b, boolean g, boolean s, boolean a){
      this.isMine = false;
      this.isBalloon = b;
      this.isGrid = g;
      this.isSolid = s;
      this.isAnimal = a;
      this.color = c;
    }

    public boolean sameColor(Block c){
      return (color == c.color);
    }

    public String toString(){
      if (isMine) return "m";
      if (isSolid) return "/";
      if (this == null) return "*";
      if (isAnimal) return "a";

      if (isGrid){
        if (color.equals("Purple")) return "z";
        if (color.equals("Yellow")) return "e";
        if (color.equals("Red")) return "t";
        if (color.equals("Green")) return "s";
        if (color.equals("Blue")) return "i";
      } else if (isBalloon){
        if (color.equals("Purple")) return "o";
        if (color.equals("Yellow")) return "p";
        if (color.equals("Red")) return "q";
        if (color.equals("Green")) return "s";
        if (color.equals("Blue")) return "d";
      }

      return String.valueOf(color.charAt(0)).toLowerCase();

    }
  }
}
