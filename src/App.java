import javax.swing.SwingUtilities;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Create the ColorPickerGUI
        SwingUtilities.invokeLater(() -> {
            ColorPickerGUI colorPickerGUI = new ColorPickerGUI();
        });
    }
}
