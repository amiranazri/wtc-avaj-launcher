package simulation;

import java.io.*;

public class writer {
        static BufferedWriter writer;
        static File file;
        private writer() {
            try {
                file = new File("simulation.txt");
                if (writer == null) {
                    writer = new BufferedWriter(new FileWriter(file));
                }
            }
            catch(IOException exception) {
                System.out.println("Writer error: " + exception);
            }
        }
}

public void write(String str) {
    writer.println(str);
}

public void close() {
    writer.close();
}}

