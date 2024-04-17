public class APLine
{
private int myA, myB, myC;
  
public APLine(int a, int b, int c)
  {
    myA = a;
    myB = b;
    myC = c;
}
  public double getSlope(int myA, int myB)
  {
    int slope = 0;
    slope =  -a/b;
    return slope;
  }
  public boolean isOnLine(double x, double y){
    if((myA * x + myB * y + myC) == 0.0)
      return true;
    else 
      return false;
  }
}
  
