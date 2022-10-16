package Bank;
public class Main {
    public static void main(String[] args)
    {
        BankAccount anshuman = new BankAccount();
        anshuman.setAccountNumber(12345678);
        anshuman.setBalance(300);
        anshuman.setCustomer_name("xyz");
        anshuman.setEmail("xyz@gmail.com");
        anshuman.setPhone_number(456565763);

        anshuman.getaccount();

        anshuman.deposit(20);
        anshuman.withdraw(20);


    }
}