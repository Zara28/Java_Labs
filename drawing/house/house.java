import java.awt.*;
import javax.swing.*;
 class Windows
{
	public static void main(String[] args) {
		JFrame w=new JFrame("Дозорова ПИбд-12 Вариант 6") ;
		w.setSize (200, 200) ;
		w.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE) ;
		w.setLayout (new BorderLayout (1,1));
		Canvas canv=new Canvas();
		w.add(canv);
		w.setVisible (true);
	}
}
class Canvas extends JComponent{
	public void paintComponent (Graphics g) {
		super.paintComponent (g);
		Graphics2D g2d=(Graphics2D)g;
		g2d.setPaint (Color.BLUE) ;
		int xpoints[] = {50, 80, 70, 70, 30, 30, 20, 50};
		int ypoints[] = {40, 80, 80, 120, 120, 80, 80, 40};
		int npoints = 8;
		g2d.drawPolygon(xpoints, ypoints, npoints);
		super.repaint();
	}
}
