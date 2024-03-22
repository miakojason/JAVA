import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class ColorShape extends JPanel {
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D g2 = (Graphics2D) g;

    // 根據寬與高來調整圖案大小
    float Width  = getSize().width - 10;
    float Height = getSize().height/3 - 10;

    // 畫兩條紅色線
    g2.setPaint(Color.red);
    g2.draw(new Line2D.Float(5,5,5+Width,5+Height));
    g2.draw(new Line2D.Float(5,5+Height,5+Width,5));

    // 畫自訂顏色的矩形
    g2.setPaint(new Color(97,210,214));
    g2.fill(new Rectangle2D.Float(5,10+Height,Width,Height));

    // 畫漸層橢圓
    g2.setPaint(new GradientPaint (5,5,Color.white,
                                   5+Width,5,Color.black));
    g2.fill(new Ellipse2D.Float(5,20+2*Height,Width,Height));
  }

  public static void main(String[] args) {
    JFrame f = new JFrame("色彩應用");
    ColorShape p = new ColorShape();
    p.setBackground(Color.white); // 將背景設為白色
    f.getContentPane().add(p);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setSize(640,480);
    f.setVisible(true);
  }
}
