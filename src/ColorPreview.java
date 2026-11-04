public interface ColorPreview {
    void addObserver(ColorObserver observer);
    void removeObserver(ColorObserver observer);
    void notifyObservers(int red, int green, int blue);
    
}
