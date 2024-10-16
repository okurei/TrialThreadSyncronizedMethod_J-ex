public class BankAccount {
    private static int balance = 1000000;

    public static synchronized int withdraw(int withdrawAmount){
        if (balance < 100){
            System.out.println(balance);
            return -1;
        }else {
            balance = balance-withdrawAmount;
            return withdrawAmount;
        }
    }
}
