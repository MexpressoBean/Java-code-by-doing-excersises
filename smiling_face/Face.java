import java.awt.*;
import javax.swing.JFrame;

public class Face extends Canvas
{
  public static void main(String[] args)
  {
    // Create the window, the string "Circle" is the title
    JFrame win = new JFrame("Smiling face");

    // Set the initial size of the window
    win.setSize(800,600);

    // Sets the setDefaultCloseOperation
    win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Creates new instance of class Circle
    Face canvas = new Face();

    win.add( canvas );
    win.setVisible(true);
  }



  public void paint(Graphics g)
  {
    g.setColor(Color.yellow); // sets the color to yellow
    g.fillOval(250, 150, 300, 300); // draws the cirlce for the head

    g.setColor(Color.blue); // sets the color to blue
    g.fillOval(325, 225, 50, 50); // draws the circle for the left eye
    g.fillOval(425, 225, 50, 50); // draws the circle for the right eye

    g.setColor(Color.red);
    g.drawArc(350, 300, 100, 100, 0, -180);



    // --------- Grid lines --------- //

    // // labels
    // g.setColor(Color.black);
    // g.setFont(new Font(null));
    //
    // for ( int X=0; X<800; X += 50 )
    //   g.drawString( String.valueOf(X), X, 50 );
    // for ( int Y=100; Y<600; Y += 50 )
    //   g.drawString( String.valueOf(Y), 28, Y );
    //
    // // lines
    // g.setColor(Color.lightGray);
    //
    // for ( int X=0; X<800; X += 50 )
    //   g.drawLine(X,0,X,599);    // horizontal
    // for ( int Y=0; Y<600; Y += 50 )
    //   g.drawLine(0,Y,799,Y);    // vertical
  }
}
