package thread;

public class RunnableProgram1 implements Runnable{
    Thread t;
    @Override
    public void run(){
        t=Thread.currentThread();
        for(int i=0;i<20;i++){
            System.out.println("Child thread "+i+" name "+t.getName());
        }
    }

    public static void main(String[] args) {
        Runnable runnable=()->{
            Thread t=Thread.currentThread();
            for (int i = 0; i <=20 ; i++) {
                System.out.println("Child thread "+i+" name "+t.getName());
            }
        };

        Thread t1=new Thread(runnable);
        Thread t2=new Thread(runnable);
        Thread t3=new Thread(runnable);

        t1.setName("Program1");
        t2.setName("Program2");
        t3.setName("Program3");

        t1.start();
        t2.start();
        t3.start();

    }
}
