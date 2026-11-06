import javax.swing.JLabel;
// Observer design pattern Concrete Observer
public class HexDisplay implements ColorObserver{
    String hexCode;
    private JLabel hexLabel;
    public HexDisplay(JLabel hexLabel) {
        this.hexLabel = hexLabel;
        this.hexCode = "#000000";
    }
    @Override
    public void update(int red, int green, int blue) {
        // convert RGB to the hex color and update the hex label
        this.hexCode = rgbtoHex(red, green, blue);
        hexLabel.setText("Hex: " + hexCode);
    }

    public static String rgbtoHex(int red, int green, int blue){
        return String.format("#%02x%02x%02x", red, green, blue);
    }
}
