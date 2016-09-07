import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.*;

public class main {
  public static void GUI(String NAME, int x, int y, int closeOperation) {
        //Create and set up the window.
        JFrame frame = new JFrame(NAME);
        frame.setDefaultCloseOperation(closeOperation);
 
        JLabel emptyLabel = new JLabel("");
        emptyLabel.setPreferredSize(new Dimension(x, y));
        frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);
 
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    };
  public static void main() {
		GUI("Hello world", 175, 200, 4);
	};
};
