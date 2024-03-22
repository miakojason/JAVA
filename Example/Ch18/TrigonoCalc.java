import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TrigonoCalc extends KeyAdapter
                        implements ActionListener {
  JFrame f = new JFrame("計算三角函數");
  JRadioButton deg = new JRadioButton("角度");
  JRadioButton rad = new JRadioButton("弳度");
  JTextField degree = new JTextField(16);
  JTextField sintxt = new JTextField();
  JTextField costxt = new JTextField();
  JTextField tantxt = new JTextField();
  JLabel sinlab =new JLabel(" SIN() ");
  JLabel coslab =new JLabel(" COS() ");
  JLabel tanlab =new JLabel(" TAN() ");
  JButton go = new JButton("計算");
  double convert = 180 / Math.PI;  // 一弳度等於 (180/π) 度

  public static void main(String[] args) {
    TrigonoCalc tri = new TrigonoCalc();
    tri.init();
  }

  public void init() {
    Container contentPane = f.getContentPane();
    JPanel p = new JPanel();
    // 將兩個元件及 JPanel 加入 JFrame
    contentPane.add(degree,"North");
    contentPane.add(p,"Center");
    contentPane.add(go,"South");

    // 將 JPanel 設定為使用 GridLayout (4 列、2 行)
    p.setLayout(new GridLayout(4,2));
    // 將各元件加到 JPanel 中
    p.add(deg);      p.add(rad);
    p.add(sinlab);   p.add(sintxt);
    p.add(coslab);   p.add(costxt);
    p.add(tanlab);   p.add(tantxt);

    // 設定選擇角度單位的快捷鍵
    deg.setMnemonic(KeyEvent.VK_D);
    rad.setMnemonic(KeyEvent.VK_R);

    // 將兩個單選鈕設為一組
    ButtonGroup group = new ButtonGroup();
    group.add(deg);
    group.add(rad);
    deg.setSelected(true);    // 將 deg 設為預設選取的項目

    go.addActionListener(this);
    degree.addKeyListener(this);

    // 單選鈕的選取事件之處理方法
    deg.addItemListener(
      new ItemListener() {
        public void itemStateChanged(ItemEvent e) {
          if (e.getStateChange() == ItemEvent.SELECTED)
            convert = 180 / Math.PI;
          else
            convert = 1;
        }
      }
    );

    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setSize(250,200);
    f.setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    calc();
  }

  // 在輸入區按 ENTER 鍵也會進行計算
  public void keyPressed(KeyEvent e) {
    if (e.getKeyCode() == KeyEvent.VK_ENTER) calc();
  }

  public void calc() {
    try {
      // 取得輸入區的字串, 轉成浮點數後除以角度換算單位
      double theta = Double.parseDouble(degree.getText())/convert;
      // 計算三角函數值, 並將結果寫到各文字欄位中
      sintxt.setText(String.format("%.3f",Math.sin(theta)));
      costxt.setText(String.format("%.3f",Math.cos(theta)));
      tantxt.setText(String.format("%.3f",Math.tan(theta)));
    } catch (NumberFormatException e) {
      degree.setText("");   // 發生例外時清除輸入區內容
    }
  }
}