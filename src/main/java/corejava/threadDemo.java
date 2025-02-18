package corejava;

public class threadDemo extends Thread {
    @Override
    public void run() {
        System.out.println("thread demo is RUNNING");
        try {
            Thread.sleep(2000);
            System.out.println("t1 executed succesfully");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        threadDemo t1 = new threadDemo();
        System.out.println("t1 state: "+t1.getState().name());
        t1.start();
        System.out.println("t1 state: "+t1.getState().name());

        System.out.println(Thread.currentThread().getName()+" , "+Thread.currentThread().getState().name());
        Thread.sleep(100);
        System.out.println("t1 state: "+t1.getState().name());
        t1.join(); // main method will wait for t1 to finish
        System.out.println(t1.getState().name());

//        for( ; ; ){
//            System.out.println("Hello");
//        }
    }
}
