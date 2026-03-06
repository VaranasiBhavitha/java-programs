import java.util.*;

class Fibonacci
{
  public static void main(String args[])
{
  int n,t=0,t1=1,next;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter number of terms: ");
  n=sc.nextInt();
  System.out.println("Fibonacci series: ");
  System.out.println(t + " " +t1 + " ");
  for(int i=2;i<n;i++)
  { 
    next=t+t1;
    System.out.println(next + " ");
    t=t1;
    t1=next;
   }
}
 
}