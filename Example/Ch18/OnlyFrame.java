import javax.swing.*;

public class OnlyFrame {
  public static void main(String[] args) {

    // 建立 JFrame 容器物件
    JFrame myframe = new JFrame("陽春視窗");

    // 設定當使用者關閉視窗時, 即結束程式
    myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    myframe.setSize(320,240);  // 設定視窗的寬與高

    myframe.setVisible(true);  // 將視窗設為要顯示
  }
}
