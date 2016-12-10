package threadproject;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadProject {

 
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        MyThread mythread = new MyThread();
        mythread.start();
        myThread.start();
    }
}
class MyThread extends Thread{
    @Override
    public void run(){
        for(int c=0; c<10; c++){
            System.out.println(Thread.currentThread().getId()+"Value: "+c);
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(MyThread.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }  
    }
}
