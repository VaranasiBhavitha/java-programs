import java.util.*;
class OneDArray
{
 public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter elements one by one: ");
 int a[]=new int[5];
 for(int i=0;i<a.length;i++)
 {
   a[i]=sc.nextInt();
 }
System.out.println("Array elements are: ");
 for(int i=0;i<a.length;i++)
 {
 System.out.println(" " + a[i]); 
 }
}
}