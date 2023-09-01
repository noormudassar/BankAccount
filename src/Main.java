public class Main {
    public static class BankAccount {
        public double checkingBalance;
        public double savingsBalance;
        public static int numberOfAccounts = 0;
        public static double totalAmountStored = 0;

        public BankAccount () {
            numberOfAccounts++;
        }
        public double getCheckingBalance() {
            return checkingBalance;
        }
        public double getSavingsBalance() {
            return savingsBalance;
        }
        public void deposit (double money, String accountType) {
                if ("checking".equalsIgnoreCase(accountType)) {
                    checkingBalance+=money;
                } else if ("savings".equalsIgnoreCase(accountType)) {
                    savingsBalance+=money;
            }
                totalAmountStored+=money;
        }
        public void withdraw (double money, String accountType) {
            if (checkingBalance >= money && "checking".equalsIgnoreCase(accountType)) {
                checkingBalance -= money;
                totalAmountStored -= money;
            } else if (savingsBalance >= money && "savings".equalsIgnoreCase((accountType))) {
                savingsBalance -= money;
                totalAmountStored -= money;
            } else {
                System.out.println("Cannot withdraw money. Insufficient funds");
            }
        }
        public static double getTotalAmountStored() {
            return totalAmountStored;
        }
        public static int getNumberOfAccounts() {
            return numberOfAccounts;
        }
    }
}

