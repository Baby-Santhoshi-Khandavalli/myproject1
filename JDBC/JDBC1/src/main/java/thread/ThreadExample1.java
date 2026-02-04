//package thread;
//
//class Task1 extends Thread{
//      @Override
//    public void run(){
//        for(int x=0;x<=20;x++)
//            System.out.println(x+" name "+getName());
//    }
//}
//
//class Task2 extends Thread{
//      @Override
//    public void run(){
//        for(int x=0;x<=20;x++)
//            System.out.println(x+" name "+getName());
//    }
//}
//
//public class ThreadExample1 {
//    public static void main(String[] args) {
//        System.out.println("Main thread starts");
//        Thread thread1=new Task1();
//        Thread thread2=new Task2();
//        thread1.start();
//        thread2.start();
//    }
//}



package thread;

class Task1 extends Thread{
    @Override
    public void run(){
        for(int x=0;x<=20;x++)
            System.out.println(x+" name "+getName());
        try {
            Thread.sleep(1000);     //one second
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class Task2 extends Thread{
    @Override
    public void run(){
        for(int x=0;x<=20;x++)
            System.out.println(x+" name "+getName());
    }
}

public class ThreadExample1 {
    public static void main(String[] args) {
        System.out.println("Main thread starts");
        Thread thread1=new Task1();
        Thread thread2=new Task2();
        thread1.start();
        thread2.start();
    }
}
