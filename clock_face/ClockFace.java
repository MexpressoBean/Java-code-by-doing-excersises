import java.awt.*;
import javax.swing.JFrame;

public class ClockFace extends Canvas
{
  public static void main(String[] args)
  {
    JFrame win = new JFrame("Clock Face");
    win.setSize(800,600);
    win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ClockFace canvas = new ClockFace();
    win.add( canvas );
    win.setVisible(true);
  }



  public void paint(Graphics g)
  {
    // sets color to black
    g.setColor(Color.black);

    // draws a circle
    g.drawOval(250, 100, 300, 300);

    // Sets the font for the string
    g.setFont(new Font("Consolas", Font.PLAIN, 30));

    // draws the number 12
    g.drawString("12", 385, 125);

    // draws the number 3
    g.drawString("3", 530, 260);

    // draws the number 6
    g.drawString("6", 391, 395);

    // draws the number 9
    g.drawString("9", 255, 260);

    // sets the color for the inner circle to grey
    g.setColor(Color.gray);

    // draws the center circle that holds the clock hands
    g.fillOval(395, 245, 10, 10);

    // sets the color for minute & hour hands
    g.setColor(Color.black);

    // draws minute hand
    g.drawLine(255, 250, 400, 250);

    // draws hour hand
    g.drawLine(320, 290, 400, 250);

    // // labels
    // g.setColor(Color.black);
    // g.setFont(new Font(null));
    // for ( int X=0; X<800; X += 50 )
    // g.drawString( String.valueOf(X), X, 50 );
    // for ( int Y=100; Y<600; Y += 50 )
    // g.drawString( String.valueOf(Y), 28, Y );
    // // lines
    // g.setColor(Color.lightGray);
    // for ( int X=0; X<800; X += 50 )
    // g.drawLine(X,0,X,599);    // horizontal
    // for ( int Y=0; Y<600; Y += 50 )
    // g.drawLine(0,Y,799,Y);    // vertical
  }
}
