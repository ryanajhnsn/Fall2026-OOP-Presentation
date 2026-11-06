// Observer design pattern Concrete Observer

import javax.swing.JPanel;
import java.awt.Color;

public class ColorPreview implements ColorObserver {
    private JPanel colorPreview;

    public ColorPreview(JPanel colorPreview) {
        this.colorPreview = colorPreview;
    }
    @Override
    public void update(int red, int green, int blue) {
        colorPreview.setBackground(new Color(red, green, blue));
    }
}
