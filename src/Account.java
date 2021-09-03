import java.util.Scanner;

public class Account extends User {
    Scanner input = new Scanner(System.in);
    private int balance;
    private int minimumBalanceLimit;//Bakiyesine göre aralık belirledim.
    private long accountNumber=(long)((Math.random()*999999899)+100);
    private long ibanNumber=(long)((Math.random()*999999899)+100);
    private int eftAmount=0;

    public Account(){

    }

    public int getEftAmount() {
        return eftAmount;
    }

    public void setEftAmount(int eftAmount) {
        this.eftAmount = eftAmount;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getMinimumBalanceLimit() {
        if(getBalance()<1000){
            this.minimumBalanceLimit = -100;
        }
        else if(1000<getBalance() && getBalance()<2500){
            this.minimumBalanceLimit = -500;
        }
        else if(2500<getBalance() && getBalance()<10000){
            this.minimumBalanceLimit = -1000;
        }
        else{
            this.minimumBalanceLimit = -10000;
        }
        return minimumBalanceLimit;
    }

    public void setMinimumBalanceLimit(int minimumBalanceLimit) {
        this.minimumBalanceLimit = minimumBalanceLimit;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getIbanNumber() {
        return ibanNumber;
    }

    public void setIbanNumber(long ibanNumber) {
        this.ibanNumber = ibanNumber;
    }

    public void doEft(Account account){
        if(checkEftBalance()){
            setBalance(getBalance()-getEftAmount());
            account.setBalance(getBalance()+getEftAmount());
            System.out.println("Your eft transaction has been completed.");
            System.out.println("Balance left in your account: " + getBalance() +"\t This amount of money was transferred: "+getEftAmount());
        }
        else{
            System.out.println("You have insufficient funds for this transaction.");
        }
    }
    public boolean checkEftBalance(){
        System.out.println("Balance: "+getBalance()+"\tMinimum Balance Limit: "+getMinimumBalanceLimit()
                +"\t The maximum amount of eft you can do: "+(getBalance()-getMinimumBalanceLimit()));
        System.out.print("Enter the amount of eft you want to make: ");
        setEftAmount(input.nextInt());
        if (getBalance()-getMinimumBalanceLimit()<eftAmount){
            return false;
        }
        else{
            return true;
        }
    }
}
