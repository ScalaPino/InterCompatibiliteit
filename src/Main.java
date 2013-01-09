import java.awt.event.ActionListener;

import javax.swing.Timer;
class Main { 
    public static void main(String args[]) {
    MyListener myListener = new MyListener();
        Timer timer = new Timer(1000, (ActionListener) myListener);
    timer.start();
        while(timer.isRunning()) {
            System.out.print(".");
        }
    }
}