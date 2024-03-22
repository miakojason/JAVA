import java.lang.Runnable;

public class Lambda {

    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("原本的 Runnable 程式");
            }
        }).start();

        new Thread( () ->
                System.out.println("利用 Lambda 方法改寫 !!") ).start();
    }
}