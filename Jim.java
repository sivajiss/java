import java.io.*;
class Jim
{
public static void main(String[]args)
{
BufferedReader o=new BufferedReader(new FileReader("Information.txt"));
o.write("palak");
o.newLine();
char[]c={'p','a','l','a','k'}; 
o.write(c);
o.newLine();
o.write("badgujar");
o.flush();
o.close();
}
}