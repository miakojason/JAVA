class PollingStation extends Thread { // �}����
  static int reportTimes = 5; // �^������
  int total = 0; // ���}�����`����
  Assistant a; // �O���U�z����
  String name; // �}���ҦW��

  public PollingStation(Assistant a,String name) { // �غc��k
    this.a = a; // �O��Vote2����
    this.name = name; // �O���}���ҦW��
  }

  public void run() { // ������n�i��u�@
    for(int i = 0;i < reportTimes;i++) { // �^��5���o��
      //�H�üƲ��ͷs�W�o����
      int count = (int)(Math.random() * 500);
      a.reportCount(name,count); // �^���s�W�o���ƨå[�`
      total += count; // ���}���ҥ[�`
    }
  }
}

class Assistant {
  // �O�_���o���ƥ��[�`
  private boolean unprocessedData = false;
  private int count; // �s�W���o����
  private String name; // �}�X�s�W�o���ƪ��}����

  public void reportCount(String name,int count) {
    while(unprocessedData) {
      try {
        wait();
      } catch (InterruptedException e) {}
    }

    System.out.println(name + "�}���ҷs�W" + count + "��");
    this.count = count;
    this.name = name;
    unprocessedData = true;
    notify();
  }

  public int getCount() {
    while(!unprocessedData) {
      try {
        wait();
      } catch(InterruptedException e) {}
    }

    int value = count;
    unprocessedData = false;
    notify();
    return value;
  }
}
                
public class Vote5 {
  static int total = 0; // �`�}����
  static int numOfStations = 2; // �}���Ҽ�
  static PollingStation[] stations;

  public static void main(String[] argv) {
    // �إߧU�z����
    Assistant a = new Assistant();

    // �إ߰}�C
    stations = new PollingStation[numOfStations];

    // �@�@�إߧ벼�Ҫ���A�åB����
    for(int i = 1;i <= numOfStations;i++) {
      stations[i - 1] = new PollingStation(a,i + "��");
    }

    // �@�@�Ұʰ����
    for(int i = 0;i < numOfStations;i++) {
      stations[i].start();
    }

    for(int i = 0;
      i < numOfStations * PollingStation.reportTimes;i++) {
      total += a.getCount(); // Ū������
      System.out.println("�ثe�`���ơG" + total);
    }

    System.out.println("�̫�벼���G�G");

    // �@�@��ܦU�벼�Ҳ���
    for(int i = 0;i < numOfStations;i++) {
      System.out.println(stations[i].name + ":" +
              stations[i].total);
    }

    // ��̫ܳ��`����
    System.out.println("�`���ơG" + total);
  }
}                       