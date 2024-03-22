import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ChangeColor extends JPanel
                         implements ActionListener {
  JButton red = new JButton("紅");
  JButton orange = new JButton("橙色");
  JButton yellow = new JButton("黃");
  JButton green = new JButton("變綠色");
  JButton blue = new JButton("藍");

  public static void main(String[] args) {
    // 建立 ChangeColor (JPanel 的子類別) 物件
    ChangeColor p = new ChangeColor();

    // 將 JPanel 物件加到 JFrame 中
    JFrame f = new JFrame("變換視窗背景");
    f.getContentPane().add(p);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setSize(360,80);
    f.setVisible(true);
  }

  public ChangeColor() {
    // 將 5 個按鈕元件加到面板中
    add(red);
    add(orange);
    add(yellow);
    add(green);
    add(blue);

    // 將五個按鈕的傾聽者都設為此物件
    red.addActionListener(this);
    orange.addActionListener(this);
    yellow.addActionListener(this);
    green.addActionListener(this);
    blue.addActionListener(this);
  }

  // 五個按鈕的事件處理方法
  public void actionPerformed(ActionEvent e) {
    JButton s = (JButton) e.getSource();   // 取得產生事件的按鈕

    // 將面板背景顏色換成按鈕對應的顏色
    if ( s == red) setBackground(Color.red);
    else if ( s == orange) setBackground (Color.orange);
    else if ( s == yellow) setBackground (Color.yellow);
    else if ( s == green)  setBackground (Color.green);
    else setBackground (Color.blue);
  }
}
