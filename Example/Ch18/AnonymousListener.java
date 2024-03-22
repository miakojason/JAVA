import javax.swing.*;
import java.awt.event.*;

public class AnonymousListener extends JFrame {

  int act = 0;     // 用來記錄按鈕被次數的變數

  public static void main(String[] args) {
    AnonymousListener test = new AnonymousListener();
  }

  // 用建構方法建立元件、將元件加入視窗、顯示視窗
  public AnonymousListener() {
    setTitle("Listener 示範");
    JButton mybutton = new JButton("換個標題");

    // addActionListener() 的參數為匿名類別物件
    mybutton.addActionListener(
      // 以下建立的匿名類別物件為按鈕物件的傾聽者
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          act++;    // 將按鈕次數加 1
          setTitle("發生 " + act + " 次按鈕事件");
        }
      }
    );

    getContentPane().add(mybutton);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(420,140);
    setVisible(true);
  }
}
