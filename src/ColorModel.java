import java.util.ArrayList;
import java.util.List;

// Observer design pattern subject
public class ColorModel {
    private int red;
    private int green;
    private int blue;
    private List<ColorObserver> observers = new ArrayList<>();
    
    public void addObserver(ColorObserver observer) {
        observers.add(observer);
    }

    
    public void removeObserver(ColorObserver observer) {
        observers.remove(observer);
    }

      
    public void notifyObservers() {
        for (ColorObserver observer : observers) {
            observer.update(red, green, blue);
        }
    }

    public void setColor(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
        notifyObservers();
    }
}
