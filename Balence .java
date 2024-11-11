class A
{
    static  int balance = 1000;
    static void deposit(int amt)
    {
       balance = balance+amt;
    }
    static void withdrow(int amt)
    {
       balance = balance-amt;
    }
 

    static void display()
    {
        System.out.println("current balance ="+ balance);
    }
    public static void main(String[] args)
   {
    deposit( 200);
    withdrow(400);
    display();

   }
}
