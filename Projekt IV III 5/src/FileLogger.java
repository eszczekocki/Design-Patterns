import java.io.*;
import java.util.Date;
import java.util.Observable;
import java.util.Observer;

public  class FileLogger implements Observer {
    public void Log(String log) {
        try{
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("log.txt", true)));
            out.append( log +System.lineSeparator() );
            out.close();
            } catch (IOException e1) {
            e1.printStackTrace();
        }
    }

    @Override
    public void update(Observable o, Object arg) {
        Log(new Date() + ": Aktualizacja temperatury "+arg);
    }
}
