import java.util.ArrayList;
import java.util.List;

// Observer design pattern subject
public class ColorModel {
    private int red;
    private int green;
    private int blue;

    // Having a list of observers is a sign that this is the subject in the Observer design pattern
    private List<ColorObserver> observers = new ArrayList<>();
    
    // Add an observer to the list of observers
    public void addObserver(ColorObserver observer) {
        observers.add(observer);
    }

    // Remove an observer from the list of observers
    public void removeObserver(ColorObserver observer) {
        observers.remove(observer);
    }

    // Notify all registered observers of the color change
    public void notifyObservers() {
        for (ColorObserver observer : observers) {
            observer.update(red, green, blue);
        }
    }

    // Set the color and notify all registered observers of the change
    public void setColor(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
        notifyObservers();
    }
}
