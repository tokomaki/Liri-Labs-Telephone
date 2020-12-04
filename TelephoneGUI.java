/* Justin Victoria
 * Liri Labs
 * TelephoneGUI.java: Create a GUI that gathers a valid telephone number and
 * outputs accordingly.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TelephoneGUI {
    public static void main(String[] args) {
        // Create the frame.
        JFrame frame = new JFrame("My first GUI.");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 300);

        // Create the panel on the center and add its components.
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Phone #");
        JTextField tf = new JTextField(11);
        JButton find = new JButton("Find Member");
        // In charge of causing action when button is clicked.
        find.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (tf.getText().matches("[0-9]{10}") || tf.getText().matches("1[0-9]{10}")) {
                    tf.setText("Success!");
                }
                else {
                    tf.setText("Failure!");
                }
            }
        });
        panel.add(label);
        panel.add(label);
        panel.add(tf);
        panel.add(find);

        // Add panel to global panel that uses GridBagLayout.
        JPanel pane = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        // Add panel to pane.
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridwidth = 3;
        c.gridx = 0;
        c.gridy = 1;
        pane.add(panel, c);

        // Add global panel to the frame.
        frame.getContentPane().add(pane);

        // Centers frame on screen
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
