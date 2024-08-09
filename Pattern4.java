  class Pattern4 {
    public static void main(String[] args) {
        
    int i,j;
    
    for(i=1;i<=7;i++)
    { 
        for( j=1;j<=7;j++)
        {
            if(i==3||i==5 ||
            i==2&&j==3||i==2&&j==5||
            i==6&&j==3||i==6&&j==5||
            i==1&&j==4||i==7&&j==4||
            i==4&&j==2||i==4&&j==6)
            {
                System.out.print(" *");

            }
           else
        {
         
            System.out.print( "  ");
        }   
    }  
    System.out.println();
}
 
}

}
