package thread;

public class Counter {
    static int c=0;
    static synchronized void increment(){
        System.out.println(c++ +",");
    }
}

class Process1 extends Thread{
    @Override
    public void run(){
        Counter.increment();
        Counter.increment();
        Counter.increment();
    }

    Process1(String s){
        setName(s);
        //start();
    }

    public static void main(String[] args) {
        Process1 process1=new Process1("process1");
        Process1 process2=new Process1("process2");
        Process1 process3=new Process1("process3");

        process1.start();       //instead of start here we can use the start in the Process1 constructor also
        process2.start();
        process3.start();
    }
}
