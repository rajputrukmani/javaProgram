  class PallString {
    public static void main(String[] args) {
        String s="rar";
        boolean pal=true;

        for(int i =0; i<s.length();i++)
        {
            if(s.charAt(i)!=s.charAt(s.length()-1-i))
            {
                pal=false;
            }
        }
        if(pal)
        {
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
    
}
