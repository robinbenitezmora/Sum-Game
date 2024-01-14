import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
 public MyFrame() {
  super("My Frame");
  JPanel panel = new JPanel();
  JLabel label = new JLabel("Hello, world!");
  panel.add(label);
  add(panel);
  pack();
  setVisible(true);
 }
}
