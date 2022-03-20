import java.awt.event.*;
import java.awt.Graphics;
import java.awt.*;

import java.io.IOException;

import javax.swing.*;

public class Draw {
    public static void main(String[] arg) throws IOException{
        JFrame window = new JFrame();
        window.setSize(1000, 500);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         Canvas canv=new Canvas () ;
         window.add(canv);
        window.setVisible (true) ;
    }
}

class Canvas extends JComponent implements ActionListener{
public Canvas (){
    super();
    Timer timer = new Timer(40, this);
    timer.start();
}
int x=5;
int y = 0;
@Override
public void actionPerformed(ActionEvent e) {
    x += 20;
    y+=20;
    repaint();
}
    public void paintcar(Graphics g){
        Image car = new ImageIcon("Harreck_Blue_Car.png").getImage();
        Image tree = new ImageIcon("tree.png").getImage();
        Image el = new ImageIcon("el.png").getImage();
        g.drawImage(tree, 10, 100, null);
            g.drawImage(car, x, y, null);
            g.drawImage(el, 500, 200, null);
            repaint();
        
    }
    public void paintLine(Graphics g)
    {
        super.paintComponent (g) ;
        Graphics2D g2d=(Graphics2D) g;
        g2d.setPaint (Color.RED) ;
        int x = 700;
        int y = 10;
        int x1 = 700;
        int y1 = 200;
        for(int i = 0; i<10; i++)
        {
            g2d.drawLine (x-i*10, y+i*10, x1+10*i, y1-10*i);
        }
        repaint();
    }
    public void paintComponent (Graphics g){
        super.paintComponent (g);
        paintLine(g);
        paintcar(g);
        super.repaint();
}
}
    
    
