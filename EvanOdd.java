import java.util.Scanner;

public class _5EvenOdd {
   public static int oddEven(int a)
   {
      if(a%2==0){
      System.out.println("no. is Even");
      }
      else{
         System.out.println("no. is Not");
      }
      return 0;
   }

    public static void main(String[]args)
    {
       Scanner sc=new Scanner(System.in);
        System.out.println("Entera value a");
        int a=sc.nextInt();
         System.out.println(oddEven(a));
       
    }
    
     
 } 
 
