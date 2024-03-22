import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class TempConverter implements ActionListener {

  JFrame myframe = new JFrame("華氏與攝氏溫度的轉換");
  // 轉換結果顯示區
  JLabel result = new JLabel(" ",SwingConstants.CENTER);
  JTextField degree = new JTextField();  // 輸入區
  JButton f2c = new JButton("華氏轉攝氏");
  JButton c2f = new JButton("攝氏轉華氏");

  public static void main(String[] args) {
    TempConverter test = new TempConverter();
  }

  public TempConverter () {
    // 先取得 ContentPane 物件
    Container contentPane = myframe.getContentPane();

    // 將 5 個元件加到 BorderLayout 的五個位置
    contentPane.add(new JLabel("請輸入溫度",SwingConstants.CENTER),
                    BorderLayout.NORTH);
    contentPane.add(f2c,BorderLayout.EAST);
    contentPane.add(c2f,BorderLayout.WEST);
    contentPane.add(degree,BorderLayout.CENTER);
    contentPane.add(result,BorderLayout.SOUTH);

    // 設定 this 物件為傾聽者
    f2c.addActionListener(this);
    c2f.addActionListener(this);

    myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    myframe.setSize(400,120);
    myframe.setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    try {
      // 取得輸入區的字串, 並轉成浮點數
      double value = Double.parseDouble(degree.getText());

      String msg="";     // 顯示轉換結果的字串
      if(e.getSource() == f2c) // 依按鈕決定轉換方式
       msg= "華氏 " + value + " 度等於攝氏 " +
                      ((value-32)*5/9) +" 度";
      else
        msg= "攝氏 " + value + " 度等於華氏 " +
                      (value/5*9 + 32) +" 度";
      // 並將結果寫到視窗最下方
      result.setText(msg);
    } catch (NumberFormatException ne) {
      degree.setText("");   // 發生例外時清除輸入區內容
    }
  }
}
