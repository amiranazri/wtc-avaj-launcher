//package simulator.coordinates

public class coordinates {
    private int longitude;
    private int latitude;
    private int height;

        public int getLongitude() {
            if (longitude < 1) { 
                longitude = 1;
            }
            return (longitude);
        }

        public int getLatitude() {
            if (latitude < 1) {
                latitude = 1;
            }
            return (latitude);
        }

        public int getHeight() {
            if (height < 0) {
                height = 0;
            }
            return (height);
        }
    }