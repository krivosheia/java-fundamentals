package homework6.task3;

public class Distance {
    private double distance;
    private String unit;

    public Distance(double distance) {
        this.distance = distance;
        this.unit = "Metres";
    }

    public void print() {
        System.out.println(distance + " " + unit);
    }

    public static class Converter {
        public static void convertMetresToKilometers(Distance distance) {
            if (!distance.unit.equals("Metres")) {
                return;
            }
            distance.distance /= 1000;
            distance.unit = "Kilometers";
        }

        public static void convertKilometersToMetres(Distance distance) {
            if (!distance.unit.equals("Kilometers")) {
                return;
            }
            distance.distance *= 1000;
            distance.unit = "Metres";
        }

        public static void convertKilometersToMiles(Distance distance) {
            if (!distance.unit.equals("Kilometers")) {
                return;
            }
            distance.distance *= 0.621371;
            distance.unit = "Miles";
        }

        public static void convertMilesToKilometers(Distance distance) {
            if (!distance.unit.equals("Miles")) {
                return;
            }
            distance.distance /= 0.621371;
            distance.unit = "Kilometers";
        }
    }
}
