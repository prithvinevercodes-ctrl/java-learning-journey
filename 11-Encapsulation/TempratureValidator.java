public class TemperatureValidator {
    // Private field
    private double temperature;

    // Constructor
    public TemperatureValidator(double temperature) {
        setTemperature(temperature);
    }

    public double getTemperature() {
        return temperature;
    }

    // Validate temperature range
    public void setTemperature(double temperature) {
        if (temperature >= -100 && temperature <= 100) {
            this.temperature = temperature;
        } else {
            System.out.println("Invalid temperature value. Setting temperature to 0.");
            this.temperature = 0;
        }
    }

    public void displayTemperature() {
        System.out.println("Temperature: " + temperature + " degree Celsius");
    }

    public static void main(String[] args) {
        TemperatureValidator t1 = new TemperatureValidator(36.5);
        TemperatureValidator t2 = new TemperatureValidator(200);

        System.out.println("Temperature 1:");
        t1.displayTemperature();

        System.out.println("
Temperature 2:");
        t2.displayTemperature();
    }
}
