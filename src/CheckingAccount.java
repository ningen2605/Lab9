public class CheckingAccount extends BankAccount {
    static double FEE = 0.15;
  private String accountNum;

    public CheckingAccount(String name, double initialAmount)
    {
        super(name,initialAmount);
      accountNum = getAccountNumber() + "-10";
     setAccountNumber(accountNum);
    }


    public boolean withdraw(double amount) {
        if (amount + FEE > getBalance()) {
            return false;
        }

        boolean result = super.withdraw(amount+ FEE);

        return result;
    }
}
