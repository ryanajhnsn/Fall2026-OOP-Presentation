import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class App {
    public static void main(String[] args) throws Exception {       
        // Create the GUI
        // invokeLater isnt needed for this but good to have
        SwingUtilities.invokeLater(() -> {
            ColorPickerGUI colorPickerGUI = new ColorPickerGUI();
        });
    }
}
