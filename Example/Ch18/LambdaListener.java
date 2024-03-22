import javax.swing.*;
import java.awt.event.*;

public class LambdaListener extends JFrame {

  int act = 0;     // 用來記錄按鈕被次數的變數

  public static void main(String[] args) {
    LambdaListener test = new LambdaListener();
  }

  // 用建構方法建立元件、將元件加入視窗、顯示視窗
  public LambdaListener() {
    setTitle("Listener 示範");
    JButton mybutton = new JButton("換個標題");

    // addActionListener() 的參數為匿名類別物件
    mybutton.addActionListener(
      e -> { act++;  
             setTitle("發生 " + act + " 次按鈕事件");
    });

    getContentPane().add(mybutton);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(420,140);
    setVisible(true);
  }
}
