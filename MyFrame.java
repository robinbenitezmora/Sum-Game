import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
 public MyFrame() {
  super("My Frame");
  setSize(400, 300);
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  JPanel panel = new JPanel();
  JLabel label = new JLabel("Hello World");
  panel.add(label);
  add(panel);
  setVisible(true);
 }
}
