import java.lang.Math;
class CheckersMove
{
  private int fromRow;
  private int fromCol;
  private int toRow;
  private int toCol;
  
  //Constructor
  public CheckersMove(int row1, int col1, int row2, int col2)
  {
    fromRow = row1;
    fromCol = col1;
    toRow = row2;
    toCol = col2;
  }
  
  //Accessors
  public int getFromRow()
  {
    return fromRow;
  }
  public int getFromCol() 
  {
    return fromCol;
  }
  public int getToRow()
  {
    return toRow;
  }
  public int getToCol()
  {
    return toCol;
  }
  public boolean isJump()
  {
    return Math.abs(fromRow - toRow) == 2;
  }
  
}
 

