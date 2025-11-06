public class Account {
    // 帳戶號碼
    private String accountNumber;
    // 帳戶餘額
    private double balance;

    // 建構子，初始化帳戶號碼與初始餘額
    public Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // 取得帳戶號碼
    public String getAccountNumber() {
        return accountNumber;
    }

    // 取得帳戶餘額
    public double getBalance() {
        return balance;
    }
    // 設定帳戶餘額
    public void setBalance(double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative");
        }
        this.balance = balance;
    }

    //存款方法，金額必須大於0
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            throw new IllegalArgumentException("存款金額必須為正數");
        }
    }

    public void deposit1(double amount, String currency) {
        if (amount <= 0) {
            throw new IllegalArgumentException("存款金額必須為正數");
        }
        if (currency == null) {
            throw new IllegalArgumentException("貨幣類型不可為空");
        }

        double exchangeRate = 1.0;
        switch (currency.toUpperCase()) {
            case "USD":
                exchangeRate = 30.0; // 假設1美元=30台幣
                break;
            case "EUR":
                exchangeRate = 35.0; // 假設1歐元=35台幣
                break;
            case "JPY":
                exchangeRate = 0.28; // 假設1日圓=0.28台幣
                break;
            default:
                throw new IllegalArgumentException("不支援的貨幣類型");
        }

        double amountInTWD = amount * exchangeRate;
        balance += amountInTWD;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            throw new IllegalArgumentException("提款金額不合法");
        }
    }
}
