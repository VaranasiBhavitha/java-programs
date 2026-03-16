class MWReturnType
{
  int square(int n)
  {
    return n*n; 
  }
  public static void main(String args[])
  {
     MWReturnType obj= new MWReturnType();
     System.out.println(" "  + obj.square(4));
  }
}