import java.util.*;
class Multiples3and5
{
public static void main(String args[])
{
   System.out.println("Enter a number");
   int n=sc.nextInt();
   int a=1;
   
   while(a<=n)
   {
      if(a%3==0 || a%5==0)
      {
       System.out.print(a+" ,")
       a++;
      }
      else
      {
       a++;
      }
   }
 } 
 }
