import java.io.*;

public class simulator {
    
public static void main(String[] args) throws IOException{

    File file = new File("C:\\Users\\amira\\Desktop\\avaj-launcher\\scenario.txt");
    FileReader fileReader = new FileReader(file);
    BufferedReader buff = new BufferedReader(fileReader);
    String str;
    String input = "25"; //should this be 25 or filename?
    int strCounter = 0;
    int loop;

    try {
        while((str = buff.readLine()) != null)
        {
            loop = Integer.parseInt(str);
            String[] descriptors = str.split(" ");
            
            for (String word : descriptors) 
            {
                if (word.equals(input))
                {
                   strCounter++;    
                }
            }
        }
    }
    
    catch(EOFException eofException) {
        System.out.println("\n");
        System.out.println("End of file reached");
    }
}
}