 class B {
public void show(int a)
{
    System.out.println(a);
} 
public int show()
{
System.out.println("kkkk");
return 0;
}
public String show(String a)
{
    String s="hello";
     return s;
}
  public static void main (String[]age)
    {
       B ob = new B();
      ob.show(10);
      ob.show();
     System.out.println( ob.show( "Rukmani"));

    }

}
