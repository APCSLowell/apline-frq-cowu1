public class APLine
{
private double myA;
private double myB;
private double myC;
  
public APLine(double a, double b, double c)
  {
    myA = a;
    myB = b;
    myC = c;
}
  public double getSlope()
  {
    return -(a/b);
  }
  public boolean isOnLine(double x, double y){
    if((myA * x) + (myB * y) + myC) == 0)
      return true;
      return false;
  }
}
  
