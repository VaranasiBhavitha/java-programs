class WithoutRT
{
  void square(int n)
  {
    System.out.println( n*n ); 
  }
  public static void main(String args[])
  {
     WithoutRT obj= new WithoutRT();
     obj.square(5);
  }
}