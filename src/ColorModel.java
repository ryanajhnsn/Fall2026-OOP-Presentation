import java.util.ArrayList;
import java.util.List;

//concrete subject
public class ColorModel implements ColorPreview {
    private List<ColorObserver> observers = new ArrayList<>();
    
    @Override 
    public void addObserver(ColorObserver observer) {
        observers.add(observer);
    }

    
    @Override
    public void removeObserver(ColorObserver observer) {
        observers.remove(observer);
    }

    
    @Override   
    public void notifyObservers(int red, int green, int blue) {
        for (ColorObserver observer : observers) {
            observer.update(red, green, blue);
        }
    }
}
