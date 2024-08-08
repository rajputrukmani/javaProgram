import java.util.Scanner;
 
class Demo
{
  void show(double purchaseAmount)
   {
    
      if(purchaseAmount>=3000 && purchaseAmount<=5000)
         {
           System.out.println("Congratulations! You've received a flat ₹500 discount");
         }
  
      else if(purchaseAmount>=5000 && purchaseAmount<=10000)
       {
          System.out.println("Congratulations! You've received a 30% discount");
        }
         
      else if (purchaseAmount>=10000 && purchaseAmount<=15000)
       {
          System.out.println("Congratulations! You've received a free mixer as a gift");
       }
     else if(purchaseAmount>15000)
       {
           System.out.println("Congratulations! You've received a free suitcase as a gift.");
       }

     else 
       {
         System.out.println("No discounts or gifts are applicable for this amount");
        }

    }

}

class Dmart1  
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your total purchase");
        double purchaseAmount = sc.nextDouble();
         Demo ob =new Demo();
          ob.show(purchaseAmount);
          
    }
     
}
