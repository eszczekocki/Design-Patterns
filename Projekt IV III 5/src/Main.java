public class Main {
    public static void main(String[] args) {
        Termometer termometr = new Termometer(36.4);
        FileLogger logger = new FileLogger();
        termometr.addObserver(logger);
        termometr.setTemperature(36.6);
        termometr.setTemperature(37.2);
    }
}

