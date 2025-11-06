public class AccountTest {
    private int customerCount;
    public static void main(String[] args) {
    Account[] customers = new Account[10];
    Account acc1 = new Account("A001", 5000);
    addCustomer(customers, acc1);
    Account acc2 = new Account("A002", 3000);
    addCustomer(customers, acc2);
    Account acc3 = new Account("A003", 7000);
    addCustomer(customers, acc3);
    }
    public static void addCustomer(Account[] customers, Account newAccount) {
        for (int i = 0; i < customers.length; i++) {
            if (customers[i] == null) {
                customers[i] = newAccount;
                System.out.println("Added account: " + newAccount.getAccountNumber());
                return;
            }
        }
        System.out.println("No space to add new account: " + newAccount.getAccountNumber());
    }
}