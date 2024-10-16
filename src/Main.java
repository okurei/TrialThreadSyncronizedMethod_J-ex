public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ATMSavings("T1"));
        Thread t2 = new Thread(new ATMSavings("T2"));
        Thread t3 = new Thread(new ATMSavings("T3"));
        Thread t4 = new Thread(new ATMSavings("T4"));
        Thread t5 = new Thread(new ATMSavings("T5"));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}