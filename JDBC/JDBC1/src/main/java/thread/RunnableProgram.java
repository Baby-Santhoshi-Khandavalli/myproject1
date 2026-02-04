package thread;

public class RunnableProgram implements Runnable{
    Thread t;
    @Override
    public void run(){
        t=Thread.currentThread();
        for(int i=0;i<20;i++){
            System.out.println("Child thread "+i+" name "+t.getName());
        }
    }

    public static void main(String[] args) {
        RunnableProgram runnableProgram=new RunnableProgram();
        Thread t1=new Thread(runnableProgram);
        Thread t2=new Thread(runnableProgram);
        Thread t3=new Thread(runnableProgram);

        t1.setName("Program1");
        t2.setName("Program2");
        t3.setName("Program3");

        t1.start();
        t2.start();
        t3.start();

    }
}
