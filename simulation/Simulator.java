package simulation;

import java.io.*;
import vehicles.AircraftFactory;
import vehicles.Flyable;
import java.util.Scanner;

public class Simulator {
        
    public static void main(String[] args) throws IOException{

        File file = new File("scenario.txt");
        Scanner sc = new Scanner(file); 

        String str;
        while (sc.hasNextLine()){
            str = sc.nextLine();
            System.out.println(str); 
        }
        Writer.storeMessage("I like pizza");
        Writer.writeToFile();
    }
}