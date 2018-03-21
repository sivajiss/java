import java.io.*;
class Fil1
{
    public static void main(String[]args) throws IOException
    {
      FileWriter f=new FileWriter("hello");
      f.write("hello how are you");
      f.flush();
      f.close();
        
    }
}