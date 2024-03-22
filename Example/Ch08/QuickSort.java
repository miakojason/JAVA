class Sorter {
  int[] data;

  void quickSort(int start,int end) {
    // 如果只有一個元素，直接返回
    if(start >= end) {
      return;
    }

    // 取得中間元素的值
    int mid = data[(start + end) / 2];

    int left = start;
    int right = end;
    while(left < right) { // 還未相遇
      // 往尾端搜尋
      while((left < end) && (data[left] < mid)) {
        left++;
      }

      // 往前端搜尋
      while((right > start) && (data[right] > mid)) {
        right--;
      }

      // 還未交錯
      if(left <= right) {
        int temp = data[left]; // 交換元素
        data[left] = data[right];
        data[right] = temp;
        left++; // 往尾端移動
        right--; // 往前端移動
        show();
      }
    }

    // 遞迴排序前後兩段
    quickSort(start,right);
    quickSort(left,end);
  }

  void show() {
    for(int i:data) {
      System.out.print(i +" ");
    }
    System.out.println("");
  }

  void sort(int[] data) {
    this.data = data;
    show();
    quickSort(0,data.length - 1); // 排序整個陣列
  }
}

public class QuickSort {

  public static void main(String[] argv) {

    // argv傳入要排序的資料
    int[] data = new int[argv.length];

    // 將傳入的資料轉為整數
    for(int i = 0;i < data.length;i++) {
            data[i] = java.lang.Integer.parseInt(argv[i]);
    }

    // 排序
    Sorter s = new Sorter();
    s.sort(data);
  }
}