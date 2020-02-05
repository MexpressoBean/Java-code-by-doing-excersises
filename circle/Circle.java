import java.awt.*;
import javax.swing.JFrame;

public class Circle extends Canvas
{
  public static void main(String[] args)
  {
    // Create the window, the string "Circle" is the title
    JFrame win = new JFrame("Circle");

    // Set the initial size of the window
    win.setSize(800,600);

    // Sets the setDefaultCloseOperation
    win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Creates new instance of class Circle
    Circle canvas = new Circle();

    win.add( canvas );
    win.setVisible(true);
  }



  public void paint(Graphics g)
  {
    // Sets the color of the oval
    g.setColor(Color.green);

    //        (x, y, width, height)
    g.fillOval(100, 100, 200, 200);
  }
}
