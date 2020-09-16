package weather;

public class Coordinates
{
    private int longitude;
    private int latitude;
    private int height;
    public static String coordinateStr;

        public int getLongitude() {
            if (longitude < 1) { 
                longitude = 1;
            }
            return (this.longitude);
        }

        public int getLatitude() {
            if (latitude < 1) {
                latitude = 1;
            }
            return (this.latitude);
        }

        public int getHeight() {
            if (height < 0) {
                height = 0;
            }
            else if (height > 100) {
                height = 100;
            }
            else if (height <= 0) {
                System.out.println("Aircraft is preparing for landing...");
            }
            return (this.height);
        }
}