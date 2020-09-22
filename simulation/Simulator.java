package simulation;

import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import simulation.Writer;
import vehicles.*;
import weather.*;
import weather.Tower;

public class Simulator {
    static BufferedReader buff;

    public static void main(String[] args) throws IOException{
            ArrayList<String> Scenario = new ArrayList<String>();
            ArrayList<Flyable> flyable = new ArrayList<Flyable>();
            WeatherTower WeatherTower = new WeatherTower();
            File file = new File("scenario.txt");
            Scanner scan = new Scanner(file); 
            String str;
            int nbr;
    
            nbr = Integer.parseInt(scan.nextLine());
            int i = 0;
    
            while (scan.hasNextLine()){
                str = scan.nextLine();
                Scenario.add(str); 
                String[] arrayScenario = str.split(" ");
                flyable.add(AircraftFactory.newAircraft(arrayScenario[0], arrayScenario[1], Integer.parseInt(arrayScenario[2]), Integer.parseInt(arrayScenario[3]), Integer.parseInt(arrayScenario[4])));
                flyable.get(i).registerTower(WeatherTower);
                i++;    
            }
    
            WeatherTower.changeWeather();
            while (nbr > 0) {
                WeatherTower.changeWeather();
                nbr--;
            }
            Writer.writeToFile();
    }
}