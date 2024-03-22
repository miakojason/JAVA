public class Factory {
  public static void main(String[] argv) {
    double fact = 1;
    int i = 5;          // 設定預設值 5
    if(argv.length > 0) // 如果有設定命令列參數
      i = Integer.parseInt(argv[0]); // 將參數轉換為 int

    System.out.print(i + "!=");  // 輸出訊息開頭
    for(;i > 0;i--)  // 計算 i!
      fact *= i;
    System.out.println(fact);    // 輸出計算結果
  }
}
