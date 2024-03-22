import javax.swing.*;
import java.awt.event.*;

public class InnerDemo extends JFrame {

  int act = 0;     // 用來記錄按鈕被次數的變數

  public static void main(String[] args) {
    InnerDemo test = new InnerDemo();
  }

  // 用建構方法建立元件、將元件加入視窗、顯示視窗
  public InnerDemo() {
    setTitle("Listener 示範");
    JButton mybutton = new JButton("換個標題");
    mybutton.addActionListener(new InnerListener());
                              // 以內部類別物件為傾聽者

    getContentPane().add(mybutton);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(420,140);
    setVisible(true);
  }

  // 實作 ActionListener 介面的內部類別
  class InnerListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      act++;       // 存取外部類別的 act 成員
      setTitle("發生 " + act + " 次按鈕事件");
    }
  }
}
