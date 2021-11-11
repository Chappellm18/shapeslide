import javax.swing.DefaultBoundedRangeModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.util.Hashtable;

public class shapes {
    static int b = 0;
    static int r = 0;
    static int g = 0;
    static int x = 75;
    static int y = 75;

    public static void main(String[] args) {

        // Create and set up a frame window
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Shape slider");
        frame.setSize(600, 600);
        frame.setLayout(new GridLayout(3, 3));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add the shape
        JPanel shape = new JPanel();
        shape.setSize(new Dimension(x, y));
        shape.setBackground(new Color(r, g, b));

        JPanel green_panel = new JPanel();
        DefaultBoundedRangeModel green = new DefaultBoundedRangeModel(20, 0, 0, 255);
        JSlider greenSlide = new JSlider(green);
        greenSlide.setMajorTickSpacing(50);
        greenSlide.setMinorTickSpacing(10);
        greenSlide.setPaintTicks(true);
        greenSlide.setPaintLabels(true);
        greenSlide.setOrientation(JSlider.VERTICAL);
        Hashtable<Integer, JLabel> green_position = new Hashtable<Integer, JLabel>();
        green_position.put(0, new JLabel("0"));
        green_position.put(50, new JLabel("50"));
        green_position.put(100, new JLabel("100"));
        green_position.put(150, new JLabel("155"));
        green_position.put(200, new JLabel("200"));
        green_position.put(255, new JLabel("255"));
        greenSlide.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                g = greenSlide.getValue();
                shape.setBackground(new Color(r, g, b));
            }
        });
        green_panel.add(greenSlide);
        frame.add(green_panel);
        greenSlide.setLabelTable(green_position);

        JPanel red_panel = new JPanel();
        DefaultBoundedRangeModel red = new DefaultBoundedRangeModel(20, 0, 0, 255);
        JSlider redSlide = new JSlider(red);
        redSlide.setMajorTickSpacing(50);
        redSlide.setMinorTickSpacing(10);
        redSlide.setPaintTicks(true);
        redSlide.setPaintLabels(true);
        redSlide.setOrientation(JSlider.VERTICAL);
        Hashtable<Integer, JLabel> red_position = new Hashtable<Integer, JLabel>();
        red_position.put(0, new JLabel("0"));
        red_position.put(50, new JLabel("50"));
        red_position.put(100, new JLabel("100"));
        red_position.put(150, new JLabel("155"));
        red_position.put(200, new JLabel("200"));
        red_position.put(255, new JLabel("255"));
        redSlide.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                r = redSlide.getValue();
                shape.setBackground(new Color(r, g, b));
            }
        });
        red_panel.add(redSlide);
        frame.add(red_panel);
        redSlide.setLabelTable(red_position);

        JPanel blue_panel = new JPanel();
        DefaultBoundedRangeModel blue = new DefaultBoundedRangeModel(20, 0, 0, 255);
        JSlider blueSlide = new JSlider(blue);
        blueSlide.setMajorTickSpacing(50);
        blueSlide.setMinorTickSpacing(10);
        blueSlide.setPaintTicks(true);
        blueSlide.setPaintLabels(true);
        blueSlide.setOrientation(JSlider.VERTICAL);
        Hashtable<Integer, JLabel> blue_position = new Hashtable<Integer, JLabel>();
        blue_position.put(0, new JLabel("0"));
        blue_position.put(50, new JLabel("50"));
        blue_position.put(100, new JLabel("100"));
        blue_position.put(150, new JLabel("155"));
        blue_position.put(200, new JLabel("200"));
        blue_position.put(255, new JLabel("255"));
        blueSlide.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                b = blueSlide.getValue();
                shape.setBackground(new Color(r, g, b));
            }
        });
        blue_panel.add(blueSlide);
        frame.add(blue_panel);
        blueSlide.setLabelTable(blue_position);

        frame.add(new JPanel()); // placeholder for shape to be in center
        frame.add(shape);
        frame.add(new JPanel()); // placeholder for shape to be in center

        JPanel height_panel = new JPanel();
        DefaultBoundedRangeModel height = new DefaultBoundedRangeModel(20, 0, 0, 200);
        JSlider heightSlide = new JSlider(height);
        heightSlide.setMajorTickSpacing(50);
        heightSlide.setMinorTickSpacing(10);
        heightSlide.setPaintTicks(true);
        heightSlide.setPaintLabels(true);
        heightSlide.setOrientation(JSlider.VERTICAL);
        Hashtable<Integer, JLabel> height_position = new Hashtable<Integer, JLabel>();
        height_position.put(0, new JLabel("0"));
        height_position.put(50, new JLabel("50"));
        height_position.put(100, new JLabel("100"));
        height_position.put(150, new JLabel("155"));
        height_position.put(200, new JLabel("200"));
        heightSlide.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                x = heightSlide.getValue();
                shape.setSize(x, y);
            }
        });
        height_panel.add(heightSlide);
        frame.add(height_panel);
        heightSlide.setLabelTable(height_position);

        JPanel border_panel = new JPanel();
        DefaultBoundedRangeModel border = new DefaultBoundedRangeModel(20, 0, 0, 200);
        JSlider borderSlide = new JSlider(border);
        borderSlide.setMajorTickSpacing(50);
        borderSlide.setMinorTickSpacing(10);
        borderSlide.setPaintTicks(true);
        borderSlide.setPaintLabels(true);
        borderSlide.setOrientation(JSlider.VERTICAL);
        Hashtable<Integer, JLabel> border_position = new Hashtable<Integer, JLabel>();
        border_position.put(0, new JLabel("0"));
        border_position.put(50, new JLabel("50"));
        border_position.put(100, new JLabel("100"));
        border_position.put(150, new JLabel("155"));
        border_position.put(200, new JLabel("200"));
        borderSlide.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                y = borderSlide.getValue();

            }
        });
        border_panel.add(borderSlide);
        frame.add(border_panel);
        borderSlide.setLabelTable(border_position);

        JPanel width_panel = new JPanel();
        DefaultBoundedRangeModel width = new DefaultBoundedRangeModel(20, 0, 0, 200);
        JSlider widthSlide = new JSlider(width);
        widthSlide.setMajorTickSpacing(50);
        widthSlide.setMinorTickSpacing(10);
        widthSlide.setPaintTicks(true);
        widthSlide.setPaintLabels(true);
        widthSlide.setOrientation(JSlider.VERTICAL);
        Hashtable<Integer, JLabel> width_position = new Hashtable<Integer, JLabel>();
        width_position.put(0, new JLabel("0"));
        width_position.put(50, new JLabel("50"));
        width_position.put(100, new JLabel("100"));
        width_position.put(150, new JLabel("155"));
        width_position.put(200, new JLabel("200"));
        widthSlide.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                y = widthSlide.getValue();
                shape.setSize(x, y);
            }
        });
        width_panel.add(widthSlide);
        frame.add(width_panel);
        widthSlide.setLabelTable(width_position);

        frame.pack();
        frame.setVisible(true);

    }
}