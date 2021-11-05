public class SavingsAccount extends  BankAccount{
    private double rate = 0.0025;
    private int savingsNumber = 0;
    private String accountNumber;

    public SavingsAccount(String name, double amount)
    {
        super(name, amount);
        accountNumber = super.getAccountNumber();
        setAccountNumber(accountNumber);
    }

    public void postInterest()
    {
       setBalance((getBalance() * rate) + getBalance());
    }

    @Override
    public String getAccountNumber() {
        return accountNumber + "-" + savingsNumber;
    }
    public SavingsAccount(BankAccount name, double amount)
    {
        super(name, amount);
        savingsNumber++;
        accountNumber = super.getAccountNumber();
        setAccountNumber(accountNumber);
    }

}
