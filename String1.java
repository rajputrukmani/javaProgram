  class Stata {
    static String CENTER="Infobeans";
    String name ;
      int a;

    Stata(String name,int a)
    {
        this.name=name;
        this. a=a;
    }
    void show()
    {
        System.out.println(name);
        System.out.println(a);
        System.out.println(CENTER);

    }


         public static void main(String[] args) 
     {
        Stata.CENTER="nikki";
        Stata ob=new Stata("bhavna", 10);
        ob.show();
        Stata ob1=new Stata("savri", 11);
        ob1.show();

    }
}

