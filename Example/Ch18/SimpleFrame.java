import javax.swing.*;

public class SimpleFrame {
  public static void main(String[] args) {

    JFrame myframe = new JFrame("加個按鈕");

    // 建立按鈕物件
    JButton mybutton = new JButton("確定");

    // 取得 Content Pane 並加入按鈕
    myframe.getContentPane().add(mybutton);

    myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    myframe.setSize(320,240);
    myframe.setVisible(true);
  }
}
