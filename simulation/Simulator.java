package simulation;

import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import vehicles.AircraftFactory;
import vehicles.Flyable;

public class Simulator {
    static BufferedReader buff;
    public static void main(String[] args) throws IOException{
        
        File file = new File("scenario.txt");
        Scanner scan = new Scanner(file); 
        ArrayList<String> Scenario = new ArrayList<String>();
        ArrayList<Flyable> Flyable = new ArrayList<Flyable>();
        
        String str;
        int nbr;

        nbr = Integer.parseInt(scan.nextLine());
        while (scan.hasNextLine()){
            str = scan.nextLine();
            Scenario.add(str); 
            //System.out.println(str);
            String[] arrayScenario = str.split(" ");
            Flyable.add(AircraftFactory.newAircraft(arrayScenario[0], arrayScenario[1], Integer.parseInt(arrayScenario[2]), Integer.parseInt(arrayScenario[3]), Integer.parseInt(arrayScenario[4])));
        }
    }
}
        // Writer.storeMessage("I like pizza");
        // Writer.writeToFile();
