import java.awt.event.*;
import javax.swing.*;

public class MyKeyAdapter extends KeyAdapter {

  JFrame myframe = new JFrame("Adapetr 類別示範");

  // 用來顯示訊息的標籤
  JLabel whatkey = new JLabel("請輸入任一字元！");

  public static void main(String[] args) {
    MyKeyAdapter test = new MyKeyAdapter();
    test.init();
  }

  // 建立元件、將元件加入視窗、顯示視窗的方法
  public void init() {
    myframe.addKeyListener(this);  // 設定按鍵事件的傾聽者

    myframe.getContentPane().add(whatkey);
    myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    myframe.setSize(240,120);
    myframe.setVisible(true);
  }

  // 繼承自 KeyAdapter 的方法,
  public void keyTyped(KeyEvent e) {
    whatkey.setText("您剛剛輸入的是─＞" + e.getKeyChar() );
  } // keyPressed()、keyReleased() 方法都不用管
}
