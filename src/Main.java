public class Main {
    public static class BankAccount {
        public double checkingSavings;
        public double savingsBalance;
        public static int numberOfAccounts = 0;
        public static double totalAmountStored = 0;

        public BankAccount () {
            numberOfAccounts++;
        }
    }
}

