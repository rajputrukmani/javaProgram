import java.util.Scanner;
 public class Example3
 {
    public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
System.out.println("enter a no. a");
int a=sc.nextInt();
System.out.println("enter a no. b");
int b=sc.nextInt();
System.out.println("select option");
int select=sc.nextInt();
if(select==1)
{
System.out.println("Addition Result="+" "+(a+b));
}
else if(select==2)
{
System.out.println(" substraction Result="+(a-b));
}
else if(select==3)
{
System.out.println(" multiplection Result="+a*b);
 }
else if(select==4){
System.out.println("Division Result="+a/b);
}
 else{
System.out.println("invalid choice");
}
sc.close();
    }
 }
