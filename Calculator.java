import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    public static void main(String[] args) {
        // Create a window (JFrame)
        JFrame frame = new JFrame("Simple Calculator");
        frame.setSize(300, 200); // Set size of the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create components
        JLabel label1 = new JLabel("Number 1:");
        JTextField textField1 = new JTextField(10); // Input field for Number 1

        JLabel label2 = new JLabel("Number 2:");
        JTextField textField2 = new JTextField(10); // Input field for Number 2

        JButton addButton = new JButton("Add"); // Button for addition
        JLabel resultLabel = new JLabel("Result: "); // Label to display the result

        // Add action to the button
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Read numbers from text fields and calculate the sum
                try {
                    int num1 = Integer.parseInt(textField1.getText());
                    int num2 = Integer.parseInt(textField2.getText());
                    int sum = num1 + num2;
                    resultLabel.setText("Result: " + sum); // Show the result
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid input!"); // Error message for invalid input
                }
            }
        });

        // Add components to the frame
        frame.setLayout(new FlowLayout()); // Simple layout
        frame.add(label1);
        frame.add(textField1);
        frame.add(label2);
        frame.add(textField2);
        frame.add(addButton);
        frame.add(resultLabel);

        // Show the frame
        frame.setVisible(true);
    }
}
