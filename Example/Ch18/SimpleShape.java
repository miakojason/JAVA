import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class SimpleShape extends JPanel {

  public void paintComponent(Graphics g) {
    // 請上層容器重畫, 以清除原有內容
    super.paintComponent(g);

    // 取得面板的寬與高
    double Width  = getSize().width - 10;
    double Height = getSize().height / 4 - 10;

    Graphics2D g2 = (Graphics2D) g;

    g2.draw(new         // 畫線
       Line2D.Double(5,5,5+Width,5+Height));

    g2.draw(new         // 畫矩形
       Rectangle2D.Double(5,10+Height,Width,Height));

    g2.draw(new         // 圖圓角矩形
       RoundRectangle2D.Double(5,15+2*Height,Width,Height,20,30));

    g2.draw(new         // 畫橢圓
       Ellipse2D.Double(5,20+3*Height,Width,Height));
  }

  public static void main(String[] args) {
    JFrame f = new JFrame("幾何圖案");
    f.getContentPane().add(new SimpleShape());
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setSize(640,480);
    f.setVisible(true);
  }
}
