import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class ShowImage extends JPanel {
  Image img = null; // 代表影像的物件

  public ShowImage(String filename) {
    img = getToolkit().getImage(filename);  // 載入指定的影像檔
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D g2 = (Graphics2D) g;

    Dimension d = getSize();                // 取得面板的大小

    // 建立座標轉換物件
    AffineTransform at = new AffineTransform();

    // 依 Panel 的區域大小來調整顯示比例
    double sc = Math.min(d.width/(double)img.getWidth(null),
                         d.height/(double)img.getHeight(null));
    at.scale(sc,sc);

    g2.drawImage(img, at, this);            // 顯示影像
  }

  public static void main(String[] args) {
    try {
      ShowImage dimg = new ShowImage(args[0]);

      JFrame f = new JFrame(args[0]);
      f.getContentPane().add(dimg);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setSize(640,480);
      f.setVisible(true);
    }
    catch (Exception e) {
      System.out.println("用法: java ShowImage <影像檔名稱>");
      System.exit(0);
    }
  }
}
