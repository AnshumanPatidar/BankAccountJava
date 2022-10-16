package Bank;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customer_name;
    private String email;
    private long phone_number;

    public int setAccountNumber(int accountNumber) {
        return this.accountNumber = accountNumber;
    }

    public double setBalance(double balance) {
       return this.balance = balance;
    }

    public String setCustomer_name(String customer_name) {
        return this.customer_name = customer_name;
    }

    public String setEmail(String email) {
       return this.email = email;
    }

    public  long setPhone_number(long phone_number) {
      return this.phone_number = phone_number;
    }

    public void getaccount()
    {
        System.out.printf( "Your Account number is " + this.accountNumber + "\n");
        System.out.printf("Current Balance " + this.balance + "\n");
        System.out.printf("Your name is " + this.customer_name + "\n");
        System.out.printf("Your email address " + this.email + "\n");
        System.out.printf("Your contact number " + this.phone_number + "\n");
    }

    public void deposit(double addbalance)
    {
        System.out.printf("Your are depositing " + addbalance + " in your account\n");
        balance += addbalance;
        System.out.printf("Your updated Balance is " + balance + "\n");

    }
    public void withdraw( double subbalance)
    {
        System.out.printf("Your are withdrawing " + subbalance + " in your account\n" );
        balance -= subbalance;
        System.out.printf("Your updated Balance is " + balance);

    }


}
