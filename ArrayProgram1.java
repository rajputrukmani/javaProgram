
import java.util.Scanner;

public class Squ {
    public static void main(String[] args) {
     Scanner ob = new Scanner( System.in);
        System.out.println("Enter the elements of the array");
        int x[]= new int[5];
        int sq;
        for(int i =0;i<x.length;i++)
        {
            x[i]= ob.nextInt();
        }
        System.out.println("find length="+x.length);
        System.out.println("Squre");
        for(int i=0;i<x.length;i++)
        {
            sq=x[i]*x[i];
            System.out.println(sq);
        }
    }
    
}
