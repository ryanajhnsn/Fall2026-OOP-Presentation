public class RGBDisplay implements ColorObserver {
    int red;
    int green;
    int blue;
    
    public RGBDisplay() {
        this.red = 0;
        this.green = 0;
        this.blue = 0;
    }

    @Override
    public void update(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

}