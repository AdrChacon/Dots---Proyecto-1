import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
    
public class MainClass extends JPanel {
/*Busca las cordenadas en "x" y en "y" para saber donde pintar la figura*/
  public void paint(Graphics g) {
    int xpoints[] = {155, 205, 255, 255, 255, 255, 205, 155};
    int ypoints[] = {155, 105, 55, 105, 155, 205, 155, 205};
    int npoints = 8;
    /*Define el color y llama a la funcion*/
    g.setColor(Color.GREEN);
    g.fillPolygon(xpoints, ypoints, npoints);
  }
/* Crea la figura pintada*/
  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.getContentPane().add(new MainClass());

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500,500);
    frame.setVisible(true);
  }
}
