import java.util.Observable;


public class Termometer extends Observable {

    private double temperature;

    public Termometer(double temp) {
        this.temperature = temp;
    }

    public void setTemperature(double temp) {
        if(temperature != temp) {
            System.out.println("Zmiana temperatury: "+temp);
            temperature = temp;
            setChanged();
            notifyObservers(temp);
        }
    }
}
