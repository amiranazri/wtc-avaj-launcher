package simulation;

import java.io.BufferedWriter;
import java.io.File;
import java.io.*;
import java.io.IOException;
import java.util.ArrayList;

public class Writer {
    static BufferedWriter writer;
    static File file;
    static ArrayList<String> fileContent = new ArrayList<String>();
    
    public static void storeMessage(String message) {
        fileContent.add(message);
    }

    public static void writeToFile() {
        try{
        writer = new BufferedWriter(new FileWriter("simulation.txt"));

        for (int i = 0; i<fileContent.size(); i++)
            writer.write(fileContent.get(i));
        writer.close();
        }
        catch (Exception e)
        {
            System.out.println("anything");
        }
    }

   
    
}