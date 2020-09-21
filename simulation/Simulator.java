package simulation;

import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import vehicles.AircraftFactory;
import vehicles.Flyable;
import simulation.Writer;
import weather.*;

public class Simulator {
    static BufferedReader buff;
    static WeatherTower WeatherTower = new WeatherTower();
    
    public static void main(String[] args) throws IOException{
        
        ArrayList<String> Scenario = new ArrayList<String>();
        ArrayList<Flyable> Flyable = new ArrayList<Flyable>();
        File file = new File("scenario.txt");
        Scanner scan = new Scanner(file); 
        String str;
        int nbr;

        nbr = Integer.parseInt(scan.nextLine());

        while (scan.hasNextLine()){
            str = scan.nextLine();
            Scenario.add(str); 
            String[] arrayScenario = str.split(" ");
            Flyable.add(AircraftFactory.newAircraft(arrayScenario[0], arrayScenario[1], Integer.parseInt(arrayScenario[2]), Integer.parseInt(arrayScenario[3]), Integer.parseInt(arrayScenario[4])));
            // Writer.storeMessage(arrayScenario[0] + " " + arrayScenario[1] + " " + arrayScenario[2].toString() + " " + arrayScenario[3].toString() + " " + arrayScenario[4].toString() + "\n");

            
        }

        while (nbr > 0) {
            Writer.storeMessage("");
            WeatherTower.changeWeather();
            nbr--;
        }
        Writer.writeToFile();
    }
}