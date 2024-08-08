  abstract class Animal1 {
    String color="white";
    String name ="rukmani";
    abstract  void showData1();
      Animal1 ()
    {
        int a=20;
        System.out.println(a);
        System.out.println(name);
        
    }
    
}
class Dog1 extends Animal1
{

    void  showData1()
    {
        System.out.println("Ramram");
    }
    String color ="Black ";
    Dog1()
    {
       System.out.println(color);
    }
    double area()
{
    System.out.println("ram");
    return 15;
}

void showData()
{
    System.out.println("Sonam");
}
    public static void main(String[] args) {
        Dog1 d=new Dog1();
        System.out.println( d. area());
        d.showData(); 
        d.showData1();
    }
    
}
    

