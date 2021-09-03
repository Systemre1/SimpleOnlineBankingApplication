import java.util.Scanner;

public class CreditCard extends Account {
    Scanner input = new Scanner(System.in);
    private int limit;
    private long creditCardNumber=(long)((Math.random()*999999899)+100);//bunları rasgele verdim çünkü müşterinin girmesi biraz saçma geldi.
    private int totalDept=(int)((Math.random()*3000)+100);
    private int minimumDeptInformation=(getTotalDept()/10);


    public CreditCard(){

    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public long getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(long creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public int getTotalDept() {
        return totalDept;
    }

    public void setTotalDept(int totalDept) {
        this.totalDept = totalDept;
    }

    public int getMinimumDeptInformation() {
        return minimumDeptInformation;
    }

    public void setMinimumDeptInformation(int minimumDeptInformation) {
        this.minimumDeptInformation = minimumDeptInformation;
    }
    private void withdrawnMoney(){
        System.out.print("Enter the amount of money you want to withdraw : ");
        int amount = input.nextInt();
        if (getBalance() < amount) {
            System.out.println("You don't have that much money!");
        }
        else {
            setBalance(getBalance() - amount);
            System.out.println("The money you withdraw: " + amount + "\tBalance left in your account: " + getBalance());
        }
    }
    public void withdrawnMoney(int amount){
        if (getBalance() < amount) {
            System.out.println("You don't have that much money!");
        }
        else {
            setBalance(getBalance() - amount);
            System.out.println("The money you withdraw: " + amount + "\tBalance left in your account: " + getBalance());
        }
    }
    public void payDebt(int amount) {
        System.out.println("Balance: " + getBalance() + "\tTotal Dept: " + getTotalDept() + "\tMinimum Dept Information: " + getMinimumDeptInformation());
        if (getBalance() < amount) {
            System.out.println("You don't have that much money!");
        }
        else {
            if (getTotalDept() < amount) {
                System.out.println("You invested more than your debt. Excess money is returned: " + (amount - getTotalDept())
                        + "\tBalance left in your account: " + getBalance());
                setTotalDept(0);
                setMinimumDeptInformation(0);
            }
            else if (amount == getTotalDept()) {
                System.out.println("You have paid your total debt.");
                setTotalDept(0);
                setMinimumDeptInformation(0);
            }
            else {
                if (getMinimumDeptInformation() < amount) {
                    setMinimumDeptInformation(0);
                }
                else {
                    setMinimumDeptInformation(getMinimumDeptInformation() - amount);
                    setTotalDept(getTotalDept() - amount);
                    System.out.println("Total remaining debt: " + getTotalDept() + "\tRemaining minimum debt information: " + getMinimumDeptInformation());
                }
            }
        }
    }

}
