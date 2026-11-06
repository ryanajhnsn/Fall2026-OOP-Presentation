import javax.swing.JLabel;
// Observer design pattern Concrete Observer
public class RGBDisplay implements ColorObserver {
    int red;
    int green;
    int blue;
    private JLabel rgbLabel;

    public RGBDisplay(JLabel rgbLabel) {
        this.rgbLabel = rgbLabel;
        this.red = 0;
        this.green = 0;
        this.blue = 0;
    }

    @Override
    public void update(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;

        rgbLabel.setText("RGB: " + red + ", " + green + ", " + blue);
    }

}