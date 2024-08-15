// write a java prg to print laeger amount 5 no.without using  if ? 
public class Example1 {
    public static void main(String[] args)
    {
       int a ,b,c,d,e;
       a=10;
       b=20;
       c=60;
       d=40;
       e=50;
       System.out.println("a is laeger="+(a>b && a>c && a>d && a>e));
       System.out.println("b is laeger="+(b>c && b>d && b>e && b>a));
       System.out.println("c is laeger="+(c>d && c>e && c>a && c>b));
       System.out.println("d is laeger="+(d>e && d>a && d>b && d>c));
       System.out.println("e is laeger="+(e>a && e>b && e>c && e>d));
    }
    

} 
/*output  less than=true
greater than=false
less than qual=true
greater than qual=false
qual to=false
not qual=true*/

