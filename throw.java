
import java.io.FileNotFoundException;
import java.io.FileInputStream;

class ReadAndWrite
{
    void readfile() throws FileNotFoundException
    {
        FileInputStream fis = new FileInputStream("ThrowsKeyword1 ");
    }
}

public class Throws{
    public static void main(String[] args) {
        ReadAndWrite s = new ReadAndWrite();

        try{
            s.readfile();
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }
    
}
