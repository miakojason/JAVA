import javax.swing.*;
import java.awt.event.*;  // 要處理事件必須 import 此套件

public class SimpleListener extends JFrame
                            implements ActionListener {
  int act = 0;     // 用來記錄按鈕被次數的變數

  public static void main(String[] args) {
    SimpleListener test = new SimpleListener();
  }

  // 用建構方法來建立元件、將元件加入視窗、顯示視窗
  public SimpleListener() {
    setTitle("Listener 示範");    // 設定視窗標題
    JButton mybutton = new JButton("換個標題");

    // 通知按鈕物件：本物件要當傾聽者
    mybutton.addActionListener(this);

    getContentPane().add(mybutton);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(420,140);
    setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    act++;    // 將按鈕次數加 1

    // 將視窗標題欄改為顯示按鈕次數
    setTitle("發生 " + act + " 次按鈕事件");
  }
}
