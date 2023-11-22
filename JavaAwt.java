package OOP;

import java.awt.*;
import java.awt.event.*;

public class JavaAwt {
    public static void main(String[] args) {
        // Frame banaye
        Frame frame = new Frame("Simple AWT Example");

        // Label banaye
        Label label = new Label("Enter Your Name:");

        // Text Field banaye
        TextField textField = new TextField();

        // Button banaye
        Button button = new Button("Submit");

        // Choice (Dropdown) banaye
        Choice choice = new Choice();
        choice.add("Option 1");
        choice.add("Option 2");
        choice.add("Option 3");

        // Layout manager ka use kare
        frame.setLayout(new FlowLayout());

        // Event listener add kare
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = textField.getText();
                String selectedOption = choice.getSelectedItem();
                System.out.println("Hello, " + name + "! You selected: " + selectedOption);
            }
        });

        // Frame mein components ko add kare
        frame.add(label);
        frame.add(textField);
        frame.add(button);
        frame.add(choice);

        // Frame ko set kare
        frame.setSize(300, 200);
        frame.setVisible(true);

        // Window close event handling
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
