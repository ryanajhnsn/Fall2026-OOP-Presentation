
import javax.swing.*;
import java.awt.*;

// Mediator design pattern 
public class ColorPickerGUI {

    // constructor for GUI
    public ColorPickerGUI() {
        // Create the window
        JFrame frame = new JFrame("Color Picker");
        // Set the size for the window
        Dimension fixedSize = new Dimension(800,600);

        // Close the program when the window is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Set the size for the window
        frame.setSize(fixedSize);
        // Make the window visible
        frame.setVisible(true);
        // Prevent the window from being resized
        frame.setResizable(false);

        // Create the main panel for the GUI inside of the window
        JPanel mainPanel = new JPanel(new BorderLayout(10,10));
        // Add an empty border around the main panel for spacing
        mainPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        // Set the preferred, minimum, and maximum sizes for the main panel
        mainPanel.setPreferredSize(fixedSize);
        mainPanel.setMinimumSize(fixedSize);
        mainPanel.setMaximumSize(fixedSize);
        mainPanel.setBackground(Color.lightGray);


        // Color preview panel for displaying the selected color
        JPanel previewPanel = new JPanel();
        previewPanel.setPreferredSize(new Dimension(100, 100));
        previewPanel.setBackground(Color.BLACK);
        previewPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 4));
        

        // RGB Sliders for adjusting the color components
        JSlider redSlider = new JSlider(0, 255, 0);
        JSlider greenSlider = new JSlider(0, 255, 0);
        JSlider blueSlider = new JSlider(0, 255, 0);

        // Container for the Sliders
        // 3 rows for each slider
        JPanel sliderPanel = new JPanel(new GridLayout(3, 1));

        sliderPanel.setBackground(Color.lightGray);
        sliderPanel.add(createSliderPanel("Red", redSlider));
        sliderPanel.add(createSliderPanel("Green", greenSlider));
        sliderPanel.add(createSliderPanel("Blue", blueSlider));



        // Labels for the RGB and Hex Values
        JLabel rgbLabel = new JLabel("RGB: 0, 0, 0");
        JLabel hexLabel = new JLabel("HEX: #000000");

        // Center the text
        rgbLabel.setHorizontalAlignment(SwingConstants.CENTER);
        hexLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // Container for the labels
        JPanel labelPanel = new JPanel(new GridLayout());
        labelPanel.setPreferredSize(new Dimension(100, 50));
        labelPanel.setBackground(Color.lightGray);
        labelPanel.add(rgbLabel, BorderLayout.WEST);
        labelPanel.add(hexLabel, BorderLayout.EAST);


        // Create model(observer pattern's subject) and register observers for the subject to update
        ColorModel model = new ColorModel();
        model.addObserver(new ColorPreview(previewPanel));
        model.addObserver(new RGBDisplay(rgbLabel));
        model.addObserver(new HexDisplay(hexLabel));

        new ColorPickerMediator(model, redSlider, greenSlider, blueSlider);

        // Add components to the main panel so they actually appear in the GUI
        JPanel previewContainer = new JPanel(new BorderLayout(0,10));
        previewContainer.setBackground(Color.lightGray);
        previewContainer.add(previewPanel, BorderLayout.CENTER);
        previewContainer.add(labelPanel, BorderLayout.SOUTH);

        mainPanel.add(previewContainer, BorderLayout.NORTH);
        mainPanel.add(sliderPanel, BorderLayout.CENTER);

        

        frame.add(mainPanel);
    }
    
    // Method to create a container that has the a slider and label for the slider
    private JPanel createSliderPanel(String name, JSlider slider){
        JPanel panel = new JPanel(new BorderLayout(10, 0));
        panel.setBackground(Color.lightGray);

        JLabel label = new JLabel(name);
        label.setPreferredSize(new Dimension(50,10));
        label.setBackground(Color.lightGray);
        
        slider.setBackground(Color.lightGray);
        panel.add(label, BorderLayout.WEST);
        panel.add(slider, BorderLayout.CENTER);

        return panel;
    }
}


