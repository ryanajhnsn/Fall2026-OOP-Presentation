

import javax.swing.JSlider;
import javax.swing.event.ChangeListener;
// Mediator design pattern Concrete Mediator
public class ColorPickerMediator {
    private JSlider redSlider;
    private JSlider greenSlider;
    private JSlider blueSlider;

    private ColorModel model;

    public ColorPickerMediator(ColorModel model, JSlider redSlider, JSlider greenSlider, JSlider blueSlider){
        this.model = model;
        this.redSlider = redSlider;
        this.greenSlider = greenSlider;
        this.blueSlider = blueSlider;

        // Listen to change in the slider and call the update method to get the value of sliders in real time
        ChangeListener listener = e -> update();
        redSlider.addChangeListener(listener);
        greenSlider.addChangeListener(listener);
        blueSlider.addChangeListener(listener);
    }

    public void update(){
        int red = redSlider.getValue();
        int green = greenSlider.getValue();
        int blue = blueSlider.getValue();
        model.setColor(red, green, blue);
    }
}
