import javax.swing.JLabel;

public class HexDisplay implements ColorObserver{
    String hexCode;
    private JLabel hexLabel;
    public HexDisplay(JLabel hexLabel) {
        this.hexLabel = hexLabel;
        this.hexCode = "#000000";
    }
    @Override
    public void update(int red, int green, int blue) {
        // Display the hex color
        this.hexCode = rgbtoHex(red, green, blue);
    }

    public static String rgbtoHex(int red, int green, int blue){
        return String.format("#%02x%02x%02x", red, green, blue);
    }
}
