import java.util.*;
class TwoDarray
{
 public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
int i=sc.nextInt();
int j=sc.nextInt();
int a[][]=new int[i][j];

 System.out.println("Enter elements one by one: ");
  for(i=0;i<a.length;i++)
 {
  for(j=0;j<a.length;j++)
{
   a[i][j]=sc.nextInt();

}
  }
System.out.println("Array elements are: ");
 for( i=0;i<a.length;i++)
 {  
   for(j=0;j<a.length;j++)
   {
    System.out.println(" " + a[i][j]); 

    }
  }
System.out.println(" ");
}
}