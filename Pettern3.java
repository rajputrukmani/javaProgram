public class Pettern3
{
    public static void main(String[] args)
   {
         int i , j;
        for(i=1;i<=6;i++)
        {
            for(j=1;j<=5;j++)
            {
                if(i==1&&j==3||i+j==4||j-i==2 ||i==3||j==1&&i>=3&&i<=5||j==5&&i>=3&&i<=5
                ||i==6&&j>=2&&j<=4||i==4&&j==2||i==4&&j==4||i==5&&j==3)
                
                {
                    System.out.print(" *");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
