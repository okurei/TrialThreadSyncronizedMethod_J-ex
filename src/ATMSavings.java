import java.util.Random;

public class ATMSavings implements Runnable{
    private final String taskName;
    private int savings;
    private int withdraw;

    Random random = new Random();

    public ATMSavings(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        do{
            int timeSleep = random.nextInt(10);
            try {Thread.sleep(timeSleep);}catch (InterruptedException e){
                System.out.println("InterruptedException"+ taskName);
            }
            this.savings = savings+withdraw;
            int amount = random.nextInt(1000);
            withdraw = BankAccount.withdraw(amount);
            System.out.println(taskName+" withdraw: "+amount);
        }while(withdraw != -1);
        System.out.println(taskName+" total: "+savings);

    }
}
