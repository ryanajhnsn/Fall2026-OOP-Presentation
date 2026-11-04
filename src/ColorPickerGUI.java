
import javax.swing.*;
import java.awt.*;


public class ColorPickerGUI {

    // constructor for GUI
    public ColorPickerGUI() {
        JFrame frame = new JFrame("Color Picker");
        Dimension fixedSize = new Dimension(800,600);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(fixedSize);
        frame.setVisible(true);
        frame.setResizable(false);

        JPanel mainPanel = new JPanel(new BorderLayout(10,10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        mainPanel.setPreferredSize(fixedSize);
        mainPanel.setMinimumSize(fixedSize);
        mainPanel.setMaximumSize(fixedSize);


        // Color preview
        JPanel previewPanel = new JPanel();
        previewPanel.setPreferredSize(new Dimension(100, 100));
        previewPanel.setBackground(Color.BLACK);
        

        // RGB Sliders
        JSlider redSlider = new JSlider(0, 255, 0);
        JSlider greenSlider = new JSlider(0, 255, 0);
        JSlider blueSlider = new JSlider(0, 255, 0);

        JPanel sliderPanel = new JPanel(new GridLayout(3, 1));

        sliderPanel.add(createSliderPanel("Red", redSlider));
        sliderPanel.add(createSliderPanel("Green", greenSlider));
        sliderPanel.add(createSliderPanel("Blue", blueSlider));

        JLabel rgbLabel = new JLabel("RGB: 0, 0, 0");
        JLabel hexLabel = new JLabel("HEX: #000000");

        JPanel labelPanel = new JPanel(new GridLayout(2, 1));
        labelPanel.add(rgbLabel);
        labelPanel.add(hexLabel);

        // Create model and register observers
        ColorModel model = new ColorModel();
        // model.addObserver(new ColorPreview(previewPanel));
        // model.addObserver(new RGBDisplay(rgbLabel));
        // model.addObserver(new HexDisplay(hexLabel));

        // new ColorPickerMediator(model, redSlider, greenSlider, blueSlider);

        // Components
        mainPanel.add(sliderPanel, BorderLayout.CENTER);
        mainPanel.add(previewPanel, BorderLayout.NORTH);
        mainPanel.add(labelPanel, BorderLayout.SOUTH);

        

        frame.add(mainPanel);
    }
    
    private JPanel createSliderPanel(String name, JSlider slider){
        JPanel panel = new JPanel(new BorderLayout());

        JLabel label = new JLabel(name);
        
        panel.add(label, BorderLayout.NORTH);
        panel.add(slider, BorderLayout.CENTER);

        return panel;
    }
}


